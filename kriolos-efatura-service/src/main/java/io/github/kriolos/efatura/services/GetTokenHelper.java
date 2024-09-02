package io.github.kriolos.efatura.services;

import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v128.network.Network;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.kriolos.efatura.components.LoginProcess;

public class GetTokenHelper {

	public static String init(String nif, String password) {

		
		//WebDriverManager.chromedriver().browserVersion("126.0.6463.0").setup();
		//WebDriverManager.chromedriver().browserVersion("125.0.6381.0").setup();
		WebDriverManager.chromedriver().browserVersion("128.0.6613.0").setup();
		//ChromeDriverManager.getInstance().setup();
		
		ChromeDriver driver = null;
		try 
		{
			ChromeOptions options = new ChromeOptions();
			// options.addArguments("start-maximized"); 
			options.addArguments("enable-automation"); 
			options.addArguments("--no-sandbox"); 
			options.addArguments("--disable-infobars");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--disable-browser-side-navigation"); 
			options.addArguments("--disable-gpu"); 
			
			driver = new ChromeDriver();

			// Set Dev-Tools and create a session
			DevTools tool = driver.getDevTools();
			
			tool.createSessionIfThereIsNotOne();

			final Object o = new Object();

			tool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

			final ConcurrentLinkedQueue<String> l = new ConcurrentLinkedQueue<>();

			// add listener to intercept request and continue

			tool.clearListeners();
			tool.addListener(Network.requestWillBeSent(),
					r -> {
						if(r != null) 
						{
							Object authorization = r.getRequest().getHeaders().get("Authorization");
							if (r.getRequest().getUrl().endsWith("/software") && authorization != null) {
								String jwt = ((String) authorization).split(" ")[1];
								synchronized (o) {
									l.add(jwt);
									o.notify();
								}
							}
						}
						
					});

			driver.get("https://pe.efatura.cv/");

			LoginProcess.run(driver, nif, password);

			int i = 0;
			while (i < 5) {
				try {
					synchronized (o) {
						o.wait(5000);
						if (l.size() > 0) {
							break;
						}
					}
				} catch (InterruptedException e) {
					System.out.println(i + " timeout " + nif);
				}
				i++;
			}

			tool.disconnectSession();
			tool.close();
			driver.quit();

			if (l.size() > 0) {
				return l.remove();
			}

			return null;
		}
		catch(Exception e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			if(driver != null) driver.quit();
		}

		return null;
	}
}