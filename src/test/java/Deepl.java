import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Deepl {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void login() {
        driver.manage().window().maximize();
        driver.get("https://www.deepl.com/translator/");
        WebElement lang = driver.findElement(By.xpath("//button[@id='headlessui-popover-button-3']"));
        lang.click();
        WebElement eng = driver.findElement(By.xpath("//button[@class='hover:bg-dark-8 py-1 px-2 focus-visible-inside rounded text-blue-chill']"));
        eng.click();
        WebElement enter = driver.findElement(By.xpath("//*[@id=\"textareasContainer\"]/div[1]/section/div/div[1]/d-textarea/div[1]"));
        enter.sendKeys("aboba");

        //Assert.assertEquals("Неверный логин или пароль.", errorMessage);
    }

    @After
    public void close() {
        driver.close();
    }
}