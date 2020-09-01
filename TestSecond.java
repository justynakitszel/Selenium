import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestRunn {
    @Test
    public void SecondTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement search_bar = driver.findElement(By.id("search_query_top"));
        search_bar.click();
        search_bar.sendKeys("Blouse");
        WebElement magnifier = driver.findElement(By.name("submit_search"));
        magnifier.click();
        Thread.sleep(3000);

        WebElement gointo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"));
        gointo.click();
        Thread.sleep(2000);

        Select dropdown = new Select(driver.findElement(By.id("group_1")));
        dropdown.selectByVisibleText("M");

        WebElement white =  driver.findElement(By.id("color_8"));
        white.click();

        WebElement addtocart = driver.findElement(By.id("add_to_cart"));
        addtocart.click();


    }

}
