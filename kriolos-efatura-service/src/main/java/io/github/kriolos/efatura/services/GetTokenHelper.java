package io.github.kriolos.efatura.services;

import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v122.network.Network;

import io.github.kriolos.efatura.components.LoginProcess;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import java.io.File;

public class GetTokenHelper {

	public static String init(String nif, String password) {
		String path = "C:\\Users\\Rafael Delgado\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		File chromeDriverFile = new File(path);

		if(!chromeDriverFile.exists()) 
		{
			return null;
		}

		ChromeDriverService service =  new ChromeDriverService.Builder()
			.usingDriverExecutable(chromeDriverFile)
			.usingAnyFreePort()
			.build();
		
		ChromeDriver driver = new ChromeDriver(service);
		// driver.manage().window().maximize();

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
}
