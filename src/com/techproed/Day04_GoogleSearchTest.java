package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_GoogleSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\sezgi\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com");

        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();    // Enter gorevi gorur.

        WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
        System.out.println(sonucSayisi.getText());

        WebElement shoppingLinki = driver.findElement(By.partialLinkText("Shopping"));
        shoppingLinki.click();



    }
}
