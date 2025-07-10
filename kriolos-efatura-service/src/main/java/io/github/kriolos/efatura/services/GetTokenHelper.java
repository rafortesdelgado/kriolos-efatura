package io.github.kriolos.efatura.services;

import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.openqa.selenium.bidi.module.Network;
import org.openqa.selenium.bidi.network.Header;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.kriolos.efatura.components.LoginProcess;

public class GetTokenHelper {

	public static String init(String nif, String password) {

		// WebDriverManager.chromedriver().browserVersion("126.0.6463.0").setup();
		// WebDriverManager.chromedriver().browserVersion("125.0.6381.0").setup();
		// ChromeDriverManager.chromedriver().browserVersion("133.0.6943.127").setup();
		ChromeDriverManager.getInstance().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");

		ChromeDriver driver = null;
		Network network = null;
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--no-sandbox");
			options.addArguments("--headless");
			options.addArguments("--disable-gpu");
			options.addArguments("--disable-crash-reporter");
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-in-process-stack-traces");
			options.addArguments("--disable-logging");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--log-level=3");
			options.addArguments("--output=/dev/null");
			options.setCapability("webSocketUrl", true);

			driver = new ChromeDriver(options);
			
			network = new Network(driver);
			// String intercept = network
			// 		.addIntercept(
			// 				new AddInterceptParameters(InterceptPhase.BEFORE_REQUEST_SENT));

			final Object o = new Object();

			final ConcurrentLinkedQueue<String> l = new ConcurrentLinkedQueue<>();


			network.onBeforeRequestSent(
					r -> {
						if (r != null) {
							Optional<Header> authorizationHeader = r.getRequest()
									.getHeaders()
									.stream()
									.filter(h -> h.getName().equals("Authorization"))
									.findFirst();

							if (r.getRequest().getUrl().endsWith("/software") && authorizationHeader.isPresent()) {

								String authorization = authorizationHeader.get().getValue().getValue();
								String jwt = authorization.split(" ")[1];
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

			// network.removeIntercept(intercept);
			network.close();

			if (l.size() > 0) {
				return l.remove();
			}

			return null;
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			if (network != null) network.close();
			if (driver != null) driver.quit();
		}

		return null;
	}
}