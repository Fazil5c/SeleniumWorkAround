import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {
    public static WebDriver driver;

    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazil\\IdeaProjects\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.leafground.com/pages/Dropdown.html");

//        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown1']"));
//        Select select = new Select(dropDown);
//        List<WebElement> selectList = select.getOptions();
//        for (WebElement ele : selectList) {
//            if(ele.getText().equals("Selenium")){
//                ele.click();
//            }
//        }

//        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown1']"));
//        Select select = new Select(dropDown);
//        select.selectByIndex(2);
//        Thread.sleep(5000);

//        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown1']"));
//        Select select = new Select(dropDown);
//        select.selectByValue("3");
//        Thread.sleep(5000);

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown1']"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Loadrunner");
        Thread.sleep(5000);


    }
}
