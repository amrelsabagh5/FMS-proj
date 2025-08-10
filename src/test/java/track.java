import org.checkerframework.checker.units.qual.N;
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

import java.sql.Driver;
import java.time.Duration;

public class track {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void open_page() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://saferoad-fms-web-stage.vercel.app/auth/signin");
        wait = new WebDriverWait(driver, Duration.ofSeconds(200));

    }

    @Test
    public void make_sure_that_the_page_track_open() throws InterruptedException {
        page_login track = new page_login(driver, wait);
        track.userName("testAdmin");
        track.Password("Tr3cking@2030");
        track.click_page_login();
        track.CliCKonIconTEST();
        track.Login_as_user();

        track.Field_search();
        try {
            Thread.sleep(Duration.ofSeconds(3));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        track.Search1("td");
        try {
            Thread.sleep(Duration.ofSeconds(3));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        track.LogIn_td();
        try {
            Thread.sleep(Duration.ofSeconds(6));
        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }
        track.moveto_icons();

        track.open_track();
        wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        WebElement teack = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"/track\"]")));
        String N = teack.getText();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        WebElement part_of_track = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type=\"buttun\"]")));
        String V = part_of_track.getText();
        System.out.println(N);
        System.out.println(V);
        try {
            Thread.sleep(Duration.ofSeconds(3));
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
        Assert.assertTrue(N.contains(V));
    }

    @Test
    public void refersh_page_more_than_two() {

        page_login track = new page_login(driver, wait);
        track.userName("testAdmin");
        track.Password("Tr3cking@2030");
        track.click_page_login();
        track.CliCKonIconTEST();
        track.Login_as_user();

        track.Field_search();
        try {
            Thread.sleep(Duration.ofSeconds(3));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        track.Search1("td");
        try {
            Thread.sleep(Duration.ofSeconds(3));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        track.LogIn_td();
        try {
            Thread.sleep(Duration.ofSeconds(6));
        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }
        track.moveto_icons();

        track.open_track();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        track.refresh();
    }

    @Test
    public void make_sure_that_when_clike_on_vehicle_will_filter_on_it_By_Status() {
        page_login track = new page_login(driver, wait);
        track.userName("testAdmin");
        track.Password("Tr3cking@2030");
        track.click_page_login();
        track.CliCKonIconTEST();
        track.Login_as_user();

        track.Field_search();
        try {
            Thread.sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        track.Search1("td");
        try {
            Thread.sleep(Duration.ofSeconds(3));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        track.LogIn_td();
        try {
            Thread.sleep(Duration.ofSeconds(6));
        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }
        track.moveto_icons();
        try {
            Thread.sleep(Duration.ofSeconds(6));
        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }

        track.open_track();
        try {
            Thread.sleep(Duration.ofSeconds(1));
        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }
       track.icons_vehicle_idil();
        track.group_vehicles1();
        track.group_vehicles2();
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement gg = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[src=\"data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMTEiIGhlaWdodD0iMjAiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgdmVyc2lvbj0iMS4xIi8+\"]")));
        String r = gg.getText();
       wait=new WebDriverWait(driver,Duration.ofSeconds(20));
       WebElement ff = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[src=\"data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMTEiIGhlaWdodD0iMjAiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgdmVyc2lvbj0iMS4xIi8+\"]")));
       String m = ff.getText();
       System.out.println(m);

       Assert.assertTrue(m.contains(r));


    }

}

