package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {

        // Java projemize, chromedriveri tanittik.
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\sezgi\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        // selenium ile ilgili ilk kodumuz.
        // webDriver nesnesi olusturarak, chrome driveri kullanabilir hale getirdik.
        WebDriver webDriver = new ChromeDriver();

        // driver'imiza google.com'a gitmesini soyledik.
        webDriver.get("https://google.com");

        // driverimizda acik olan pencereyi kapatir.
        // webDriver.close();

        // driverimi komple(tum pencereler ile birlikte) kapatiyor.
        //webDriver.quit();
        
        System.out.println{"GitHub dan merhaba!"};



    }

}
