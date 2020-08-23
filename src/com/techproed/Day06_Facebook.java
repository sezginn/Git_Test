package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\sezgi\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        //1.Adim
        //email kutusuna
        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Test1234");
        WebElement login = driver.findElement(By.id("u_0_d"));
        login.click();

        //Burada java 3000 milisaniye bekleyecek.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        String url = driver.getCurrentUrl();
        //https://www.facebook.com/login/
        System.out.println(url);

        if(url.contains("facebook.com/login/")){
            System.out.println("Giriş Başarısız !");
        }else{
            System.out.println("Giriş Başarılı !");
        }

        driver.quit();

    }
}
