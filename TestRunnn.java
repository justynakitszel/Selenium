import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TestRunnn {
    @Test
    public void SecondTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

       WebElement login = driver.findElement(By.className("ico-login"));
       login.click();

       WebElement email = driver.findElement(By.id("Email"));
       email.click();
       email.sendKeys("pcc83855@zzrgg.com");

       WebElement password = driver.findElement(By.id("Password"));
       password.click();
       password.sendKeys("111111");

       WebElement loginn = driver.findElement(By.className("button-1 login-button"));
       loginn.click();

       WebElement account = driver.findElement(By.className("ico-account"));
       account.click();

       WebElement orders = driver.findElement(By.className("inactive"));
       orders.click();


        driver.close();
        driver.quit();
    }
}