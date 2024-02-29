package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        
        //System.setProperty("webdriver.chrome.driver", "/home/labs/Downloads/chromedriver-linux64/chromedriver");
        
    	WebDriverManager.chromedriver().setup();
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        System.out.println( "Script excetuting..." );
        
        //1. Open the browser and get to the URL
        driver.get("https://www.facebook.com/");
        
        //2. Wait for the page to load
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        //3. Locate and input email
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        Thread.sleep(1000);
        
        //4. Locate and input Password
        driver.findElement(By.id("pass")).sendKeys("password");
        Thread.sleep(1000);
        
        //5. Login
        //driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
        //Thread.sleep(1000);
        
        driver.quit();
        
        System.out.println( "Script executed successfully" );
    }
}
