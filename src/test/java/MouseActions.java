import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class MouseActions {
    public static WebDriver driver;

    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazil\\IdeaProjects\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.get("http://www.leafground.com/pages/mouseOver.html");
//
//        WebElement button = driver.findElement(By.xpath("//a[text()='TestLeaf Courses']"));
//        WebElement textSelenium = driver.findElement(By.xpath("//a[text()='Selenium']"));
//        Actions action = new Actions(driver);
//        action.moveToElement(button).click(textSelenium).build().perform();


        //Drag and Drop

        driver.get("http://www.leafground.com/pages/drop.html");
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        //action.dragAndDrop(source,destination).build().perform();

        action.clickAndHold(source).moveToElement(destination).release().build().perform();
        Thread.sleep(5000);


//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
//        Thread.sleep(5000);


        driver.quit();
    }
}
