import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Selenium1
    {
    protected static WebDriver driver;
    public static void main(String [] args )
    {
        System.setProperty("webdriver.chrome.driver","src\\WebDriver1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("FirstName")).sendKeys("JAY");
        driver.findElement(By.id("LastName")).sendKeys("patel");
        driver.findElement(By.id("Email")).sendKeys("jaypatel1@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("jay123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("jay123");
        driver.findElement(By.id("register-button")).click();
        String actualText = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/form/div/div[2]/div[1]")).getText();
        String expectedText = "Your registration completed";
        Assert.assertEquals(expectedText,actualText);
    }
    }

