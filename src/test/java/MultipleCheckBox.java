import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultipleCheckBox {
    public static WebDriver driver;

    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fazil\\IdeaProjects\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://ironspider.ca/forms/checkradio.htm");

        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
        Thread.sleep(3000);
        List<WebElement> CheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement ele : CheckBoxes) {
            if (!ele.isSelected()) {
                ele.click();
            }
            else
            {
                ele.click();
            }
        }
        Thread.sleep(5000);

    }

}
