package io.github.kriolos.efatura.kriolosefaturaservice.processes.components;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginProcess {

    public static void run (WebDriver driver, String nif, String password) {

        WebElement loginButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button")));

        loginButton.click();

        WebElement nifInput = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.name("username")));

        nifInput.sendKeys(nif);
        
        WebElement passwordInput = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.name("password")));

        passwordInput.sendKeys(password);

        loginButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("kc-login")));

        loginButton.click();
    }        

    
}
