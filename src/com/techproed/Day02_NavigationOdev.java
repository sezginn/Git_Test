package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {

    // 1- ilk once google.com'a gidiniz.
    // 2- oradan youtube.com'a gidiniz.
    // 3- google.com'a back methodu ile geri donunuz.
    // 4 - youtube.com'a geri giniz.(forward methodu ile)
    // 5 - youtube.com'u yenileyiniz (refresh methodu ile)
    // 6- driver'i kapatin.(quit ile)

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\sezgi\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        driver.get("http://youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();

    }
}
