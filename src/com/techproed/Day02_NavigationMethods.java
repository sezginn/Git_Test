package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {

        // Java projemize, chromedriver'i tanittik.
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\sezgi\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        // driverin tum ekrani kaplamasini saglar.
        webDriver.manage().window().maximize();

        // driver'a google.com'a gitmesini soyledik.
        webDriver.get("http://google.com");

        // get komutu ile ayni islemi yapiyor.
        webDriver.navigate().to( "http://amazon.com");

        // navigate().back() komutu bir onceki sayfaya geri donmeye yariyor.
        webDriver.navigate().back();

        // navigate().forward() methodu geri geldigimiz sayfaya gitmemizi sagliyor
        // ornek : google ==> amazona gittik ==> amazondan google'a geri geldik
        // eger forward yaparsak. amazona geri gideriz.
        webDriver.navigate().forward();

        // navigate().refresh() methodu sayfayi yenilemeye yarar.
        webDriver.navigate().refresh();

    }
}
