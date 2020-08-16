package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    // driver'ımızı ekranı kaplayacak şekilde kullanalım.
    // 1 - ilk önce google.com'a gidelim.
    // 2 - sayfanın title'ını alalım ve ekrana yazdıralım.
    // 3 - daha sonra youtube.com'a gidelim.
    // 4 - sayfanın title'ını ve url'ini alalım ekrana yazdıralım.
    // 5 - google.com'a geri gelelim ve sayfanın url'ini alıp ekrana yazdıralım.
    // 6 - driver'ımızı kapatalım.

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\sezgi\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https:google.com");

        String titleGoogle = driver.getTitle();
        System.out.println(titleGoogle);

        driver.navigate().to("http:youtube.com");

        String titleYoutube = driver.getTitle();
        System.out.println(titleYoutube);
        String urlYoutube = driver.getCurrentUrl();
        System.out.println(urlYoutube);

        driver.navigate().back();

        String urlGoogle = driver.getCurrentUrl();
        System.out.println(urlGoogle);

        driver.quit();






    }
}
