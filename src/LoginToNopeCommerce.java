import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginToNopeCommerce {
    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\WebDriver1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='header-links']")).click();
        driver.findElement(By.id("Email")).sendKeys("jaypatel@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("Jay123");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        String actulText = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/input[1]")).getText();
        String expectedText = "Your Login is Completed";
        Assert.assertEquals(expectedText,actulText);



    }
}
