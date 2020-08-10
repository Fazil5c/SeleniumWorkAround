import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandleWindow {
    WebDriver driver;
    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazil\\IdeaProjects\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.leafground.com/pages/Window.html");
        WebElement window=driver.findElement(By.xpath("//button[contains(text(),'Open Home Page')]"));

        window.click();
        Set<String> multipleWindow=driver.getWindowHandles();
        ArrayList<String> str=new ArrayList<String>();
        str.addAll(multipleWindow);

        driver.switchTo().window(str.get(1));
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.close();

        driver.switchTo().window(str.get(0));
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        driver.quit();
    }
}
