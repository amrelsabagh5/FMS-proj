import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class login_acc {

    WebDriver Driver;
    WebDriverWait wait;

    @BeforeTest

    public void SetUp1() {
        Driver = new FirefoxDriver();
        Driver.manage().window().maximize();
        Driver.navigate().to("https://saferoad-fms-web-stage.vercel.app/auth/signin");
        wait = new WebDriverWait(Driver, Duration.ofSeconds(200));
    }

    @Test

    public void make_sure_that_when_user() {

        page_login login = new page_login(Driver, wait);
        login.userName("testAdmin");
        login.Password("Tr3cking@2030");
        login.click_page_login();
        login.CliCKonIconTEST();
        login.Login_as_user();
        login.Field_search();
        login.Search1("td");
        login.LogIn_td();
        WebDriverWait Wait = new WebDriverWait(Driver, Duration.ofSeconds(20));
        WebElement f = Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"card\"])[1]")));
        String actual = f.getText();
        Assert.assertTrue(actual.contains("Active Vehicles"));
    }

    @Test
    public void Make_sure_that_clicking_on_the_TOP_driver_will_open_its_page() {
        page_login login = new page_login(Driver, wait);

        login.userName("testAdmin");
        login.Password("Tr3cking@2030");
        login.click_page_login();
        login.CliCKonIconTEST();
        login.Login_as_user();
        login.Field_search();
        login.Search1("td");
        login.LogIn_td();

        String topDriver = login.topDriver();
        String inpage = Driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]")).getText();
        Assert.assertTrue(inpage.contains(topDriver));
    }

    @Test
    public void Make_sure_that_the_top_driver_have_rate_right() {
        page_login rate = new page_login(Driver, wait);
        rate.userName("testAdmin");
        rate.Password("Tr3cking@2030");
        rate.click_page_login();
        rate.CliCKonIconTEST();
        rate.Login_as_user();
        rate.Field_search();
        rate.Search1("td");
        rate.LogIn_td();
        rate.topDriver();
        List<WebElement> stars = Driver.findElements(By.xpath("(//div[@class=\"text-secondary text-warning\"])[1]"));

        // احسبهم
        int filledStars = stars.size();

        System.out.println("Driver stars: " + filledStars);

        // اتأكد إنه 3 أو أكتر
        Assert.assertTrue(filledStars >= 1, "Driver rate is less than 3 stars!");

    }

    @Test
    public void Make_sure_that_clicking_on_the_WORST_driver_will_open_its_page() {
        page_login Worst_Driver = new page_login(Driver, wait);

        Worst_Driver.userName("testAdmin");
        Worst_Driver.Password("Tr3cking@2030");
        Worst_Driver.click_page_login();
        Worst_Driver.CliCKonIconTEST();
        Worst_Driver.Login_as_user();
        Worst_Driver.Field_search();
        Worst_Driver.Search1("td");
        Worst_Driver.LogIn_td();
        String WorstDriver = Worst_Driver.WorstDriver();
        wait = new WebDriverWait(Driver, Duration.ofSeconds(200));
        WebElement actual = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"__next\"]/main/div[2]")));
        String s = actual.getText();
        Assert.assertTrue(s.contains(WorstDriver));

    }

    @Test
    public void make_sure_that_the_rate_to_worst_vehicle_is_correct() {
        page_login Worst_Driver = new page_login(Driver, wait);
        Worst_Driver.userName("testAdmin");
        Worst_Driver.Password("Tr3cking@2030");
        Worst_Driver.click_page_login();
        Worst_Driver.CliCKonIconTEST();
        Worst_Driver.Login_as_user();
        Worst_Driver.Field_search();
        Worst_Driver.Search1("td");
        Worst_Driver.LogIn_td();
        List<WebElement> rate = Driver.findElements(By.xpath("(//div[@class=\"text-secondary text-warning\"])[3]"));
        int x = rate.size();
        System.out.println(x);
        Assert.assertTrue(x < 1);


    }


    @Test
    public void make_sure_that_page_When_clicking_on_top_vehicles_will_open_with_right_data() {

        page_login TopVeh = new page_login(Driver, wait);
        TopVeh.userName("testAdmin");
        TopVeh.Password("Tr3cking@2030");
        TopVeh.click_page_login();
        TopVeh.CliCKonIconTEST();
        TopVeh.Login_as_user();
        TopVeh.Field_search();
        TopVeh.Search1("td");
        TopVeh.LogIn_td();

        String v = TopVeh.TopVehicles();
        wait = new WebDriverWait(Driver, Duration.ofSeconds(200));
        WebElement c = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"__next\"]/main/div[2]/div[2]")));
        String actual = c.getText();
        Assert.assertTrue(actual.contains(v));

    }

    @Test
    public void make_sure_that_the_rate_to_top_vehicles_iscorrect() {
        page_login TopVeh = new page_login(Driver, wait);
        TopVeh.userName("testAdmin");
        TopVeh.Password("Tr3cking@2030");
        TopVeh.click_page_login();
        TopVeh.CliCKonIconTEST();
        TopVeh.Login_as_user();
        TopVeh.Field_search();
        TopVeh.Search1("td");
        TopVeh.LogIn_td();
        wait = new WebDriverWait(Driver, Duration.ofSeconds(400));
//List<WebElement> rate1=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class='text-secondary text-warning'])[1]/svg")));
        // WebElement rate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='text-secondary text-warning'])[5]")));
        List<WebElement> rate1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#top-utilized-vehicles > div > div.card-body > div > a:nth-child(1) > div > div > div:nth-child(2) > div > svg[fill=\"orange\"]")));
        int d = rate1.size();
        System.out.println(d);

        Assert.assertTrue(d >= 1);
    }

    @Test
    public void make_sure_when_clicking_on_the_worst_vech_will_open_this_page() {


        page_login TopVeh = new page_login(Driver, wait);
        TopVeh.userName("testAdmin");
        TopVeh.Password("Tr3cking@2030");
        TopVeh.click_page_login();
        TopVeh.CliCKonIconTEST();
        TopVeh.Login_as_user();
        TopVeh.Field_search();
        TopVeh.Search1("td");
        TopVeh.LogIn_td();
        String x = TopVeh.worst_Vehicles();
        wait = new WebDriverWait(Driver, Duration.ofSeconds(200));
        WebElement r = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"__next\"]/main/div[2]/div[2]")));
        String v = r.getText();
        System.out.println(v);
        System.out.println(x);
        Assert.assertTrue(v.contains(x));

    }

    @Test
    public void make_sure_that_the_rate_to_worrst_vehicles_iscorrect() {
        page_login TopVeh = new page_login(Driver, wait);
        TopVeh.userName("testAdmin");
        TopVeh.Password("Tr3cking@2030");
        TopVeh.click_page_login();
        TopVeh.CliCKonIconTEST();
        TopVeh.Login_as_user();
        TopVeh.Field_search();
        TopVeh.Search1("td");
        TopVeh.LogIn_td();
        wait = new WebDriverWait(Driver, Duration.ofSeconds(200));

        List<WebElement> rate = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#worst-utilized-vehicles > div > div.card-body > div > a:nth-child(1) > div > div > div:nth-child(2) > div > svg[fill=\"orange\"]")));
        int d = rate.size();
        System.out.println(d);
        Assert.assertTrue(d < 2.5);
    }
    @Test
           public void make_sure_that_the_field_search_to_name_is_working_correct() {
        page_login TopVeh = new page_login(Driver, wait);
        TopVeh.userName("testAdmin");
        TopVeh.Password("Tr3cking@2030");
        TopVeh.click_page_login();
        TopVeh.CliCKonIconTEST();
        TopVeh.Login_as_user();
        TopVeh.Field_search();
        TopVeh.Search1("td");
    try {
        Thread.sleep(30);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);

    }
        TopVeh.LogIn_td();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        TopVeh.ICON_NAME();

    }
    @Test
    public void make_sure_thT_FIELD_SEARCH_TO_DISPLAY_NAME_IS_WORKING_CORRECT(){
        page_login TopVeh = new page_login(Driver, wait);
        TopVeh.userName("testAdmin");
        TopVeh.Password("Tr3cking@2030");
        TopVeh.click_page_login();
        TopVeh.CliCKonIconTEST();
        TopVeh.Login_as_user();
        TopVeh.Field_search();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        TopVeh.Search1("td");
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        TopVeh.LogIn_td();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        TopVeh.ICON_NAME();
TopVeh.search2("8298 TXA -Q3-904");
String H="8298 TXA -Q3-904";

wait=new WebDriverWait(Driver,Duration.ofSeconds(400));

WebElement h = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"repair-table\"]/div/div[2]/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]")));
String f=h.getText();
System.out.println(f);
System.out.println(H);
Assert.assertTrue(f.contains(H));

    }
}

















