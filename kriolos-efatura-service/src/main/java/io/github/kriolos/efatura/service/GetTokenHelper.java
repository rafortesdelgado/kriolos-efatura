package io.github.kriolos.efatura.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTokenHelper {
    public static void init(String nif, String password) {
        
        ChromeDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();

        driver.get("https://pe.efatura.cv/");
        WebElement loginButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));

        loginButton.click();

        WebElement nifInput = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.name("username")));

        WebElement passwordInput = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.name("password")));

        nifInput.sendKeys(nif);
        passwordInput.sendKeys(password);

        loginButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("kc-login")));

        loginButton.click();

        HttpURLConnection cn;
        try {
            cn = (HttpURLConnection)new URL("https://iam.efatura.cv/auth/realms/taxpayers/protocol/openid-connect/token")
                .openConnection();
            cn.setRequestMethod("POST");
            cn.connect();
            
            int res = cn.getResponseCode();
            System.out.println("Http response code: " + res);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        driver.quit();

        

    }
}
