import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.jar.JarFile;

public class page_login {
    WebDriver Driver;
    WebDriverWait wait;

    public page_login(WebDriver Driver, WebDriverWait wait) {
        this.Driver = Driver;
        this.wait = wait;

    }

    By UserNamePuttom = By.name("username");
    By Password = By.name("password");
    By ClickBottom = By.xpath("//button[@type=\"submit\"]");
    By clickOnTestAdmain = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]");
    By bage_users =By.xpath("//a[@href=\"/management/account-management/manageUsers\"]");
    By icon_field_search=By.xpath("//*[@id=\"__next\"]/main/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div/div[3]/div[3]/span");
    By field_search=By.xpath("//*[@id=\"ag-33-input\"]");
    By search1=By.xpath("//*[@id=\"ag-47-input\"]");
    By LOGIN_TD =By.xpath("(//button[@class=\"btn btn-outline-primary m-1 login-as\"])[7]");

    public void userName(String username) {
        Driver.findElement(UserNamePuttom).sendKeys(username);

    }

    public void Password(String pass) {
        Driver.findElement(Password).sendKeys(pass);
    }

    public void  click_page_login() {
        Driver.findElement(ClickBottom).click();

    }

    public void LOGIN(String username, String pass) {
        userName(username);
        Password(pass);
     click_page_login();

    }

    public void CliCKonIconTEST() {
        WebDriverWait wait1=new WebDriverWait(Driver,Duration.ofSeconds(100));
        wait1.until(ExpectedConditions.elementToBeClickable(clickOnTestAdmain)).click();
    }
    public void Login_as_user(){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(100));

        wait.until(ExpectedConditions.elementToBeClickable(bage_users)).click();

    }

    public void Field_search(){
  // WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(20));
     WebElement rr= wait.until(ExpectedConditions.elementToBeClickable(icon_field_search));
     JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("arguments[0].click();", rr);
    }
    public void field_search(String search){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(field_search)).sendKeys(search);

    }
    public void Search1 (String Search){
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(100));

    WebElement r=wait.until(ExpectedConditions.elementToBeClickable(search1));
/*JavascriptExecutor js1 =(JavascriptExecutor) Driver ;
js1.executeScript("arguments[0].value=arguments[1];",r,Search);
*/
        r.clear();
        r.sendKeys(Search);
    }
    public void LogIn_td(){
        wait.until(ExpectedConditions.elementToBeClickable(LOGIN_TD)).click();


    }


}

