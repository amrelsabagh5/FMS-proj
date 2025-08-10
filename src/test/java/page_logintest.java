import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class page_logintest {
    WebDriver Driver ;

    @BeforeTest

    public void SetUp()

    {
        Driver =new FirefoxDriver();
        Driver.manage().window().maximize();
        Driver.navigate().to("");
    }
    @Test
    public void test_valid_data(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(22));

        page_login userName1 = new page_login(Driver,wait);
        userName1.userName("testAdmin");
        userName1.Password("Tr3cking@2030");
        userName1.click_page_login();
      //  WebDriverWait dd=new WebDriverWait(Driver, Duration.ofSeconds(20));
        WebElement words= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"__next\"]/main/div[1]/div/div[1]/div/div/div/div/h1")));
        String actual = words.getText();

        Assert.assertTrue(actual.contains("Dashboard"));

    }
    @Test
    public void testbyinvalidusername(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(22));

        page_login LL = new page_login(Driver,wait);
        LL.userName("fwef");
        LL.Password("Tr3cking@2030");
        LL.click_page_login();
     //   WebDriverWait ii=new WebDriverWait(Driver,Duration.ofSeconds(20));
        WebElement yy=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"__next\"]/section/div/div[1]/div[1]/div/div/div/h2")));
String actual = yy.getText();

Assert.assertTrue(actual.contains("Sign In"));
    }



}

