package org.fbdlive.techfeature.selenium4;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LocatorTest {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\techfeature\\src\\main\\resources\\chromedriver.exe");

        ChromiumDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.getSessionStorage().

//        WebElement email=driver.findElement(RelativeLocator.withTagName("input").toLeftOf(By.id("pass"))
//                .below(By.name("lsd")));
//        String text=email.getAttribute("placeholder");
//        System.out.println(text);
        //webelement screen shot
//        File emailImage=email.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(emailImage,new File("C:\\Users\\Dell\\Documents\\techfeature\\Screenshot\\email.png"));
//
//        driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.navigate().to("https://www.google.com/");
    }
}
