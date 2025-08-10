
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class dashboard {
    WebDriver Driver;
    WebDriverWait wait;

    @BeforeTest

    public void SetUp() {
        Driver = new FirefoxDriver();

        Driver.manage().window().maximize();
        Driver.navigate().to("");
        wait = new WebDriverWait(Driver, Duration.ofSeconds(200));

    }

    @Test
    public void make_sure_LoginBy_user() {
        wait = new WebDriverWait(Driver, Duration.ofSeconds(100));

        page_login loginByUser = new page_login(Driver, wait);
        loginByUser.userName("testAdmin");
        loginByUser.Password("Tr3cking@2030");
        loginByUser.click_page_login();

        // page_login rr = new page_login(Driver, wait);
        loginByUser.CliCKonIconTEST();

        WebElement LoginAs = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/div/a[2]")));
        String actual = LoginAs.getText();
        Assert.assertTrue(actual.contains("Login as user"));
    }

    @Test(priority = 1)
    public void make_sure_that_the_user_can_open_page_LoginASuser() {

        page_login login = new page_login(Driver, wait);
        login.userName("testAdmin");
        login.Password("Tr3cking@2030");
        login.click_page_login();
        login.CliCKonIconTEST();
        login.Login_as_user();
        WebElement phrase = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"__next\"]/main/div[2]/div[2]/div[2]/div/div[1]/div/div[1]/div/div[1]/div/button")));
        String actuaiString = phrase.getText();
        Assert.assertTrue(actuaiString.contains("Add User"));
        System.out.println(phrase);

    }

    @Test
    public void make_sure_that_the_user_can_search_by_UserName() {
        page_login login = new page_login(Driver, wait);
        login.userName("testAdmin");
        login.Password("Tr3cking@2030");
        login.click_page_login();
        login.CliCKonIconTEST();
        login.Login_as_user();
        login.Field_search();
        login.Search1("td");
        WebElement t = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"__next\"]/main/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div[3]/div[2]/div/div/div[7]/div[3]")));
        String actual2 = t.getText();
        Assert.assertTrue(actual2.contains("td"));
        System.out.println(t);

    }

            @Test
    public void make_sure_that_the_user_can_loginByUser(){
        page_login login = new page_login(Driver,wait);
        login.userName("testAdmin");
        login.Password("Tr3cking@2030");
        login.click_page_login();
        login.CliCKonIconTEST();
        login.Login_as_user();
        login.Field_search();
        login.Search1("td");
        login.LogIn_td();





    }






}
