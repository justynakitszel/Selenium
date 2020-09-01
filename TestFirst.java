import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRun {
    @Test
    public void FirstTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Assert.assertTrue(driver.getTitle().startsWith("My"));
        Assert.assertTrue(driver.getTitle().contains("My Store"));
        WebElement contact = driver.findElement(By.id("contact-link"));
        contact.click();

        Thread.sleep(4000);
        WebElement ramka = driver.findElement(By.id("center_column"));
        Assert.assertTrue(ramka.isDisplayed());

        WebElement sign_in = driver.findElement(By.className("login"));
        sign_in.click();

        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement((By.id("passwd")));
        email.sendKeys("pax18208@eoopy.com");
        password.sendKeys("Test_123");

        WebElement login = driver.findElement(By.id("SubmitLogin"));
        login.click();

        WebElement wishlist = driver.findElement(By.id("center_column"));
        Assert.assertTrue(wishlist.isDisplayed());

        WebElement logout = driver.findElement(By.className("logout"));
        logout.click();

        WebElement check = driver.findElement(By.id("columns"));
        Assert.assertTrue(check.isDisplayed());

    driver.close();
    driver.quit();
    }




}
