import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class page_login {
    WebDriver Driver;
    WebDriverWait wait;
    private Object Sleep;

    public page_login(WebDriver Driver, WebDriverWait wait) {
        this.Driver = Driver;
        this.wait = wait;
        wait=new WebDriverWait(Driver,Duration.ofSeconds(200));
// بس كده!

    }


    By UserNamePuttom = By.name("username");
    By Password = By.name("password");
    By ClickBottom = By.xpath("//button[@type=\"submit\"]");
    By clickOnTestAdmain = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]");
    By bage_users = By.xpath("//a[@href=\"/management/account-management/manageUsers\"]");
    By icon_field_search = By.xpath("//*[@id=\"__next\"]/main/div[2]/div[2]/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/div/div[3]/div[3]/span");
    By field_search = By.xpath("//*[@id=\"ag-33-input\"]");
    By search1 = By.xpath("//*[@id=\"ag-47-input\"]");
    By LOGIN_TD = By.xpath("(//button[@class=\"btn btn-outline-primary m-1 login-as\"])[7]");
    By icon2 = By.xpath("(//span[@class=\"ag-icon ag-icon-menu\"])[1]");
    By MAIN_ICON = By.xpath("//a[@class=\"navbar-brand d-flex align-items-center\"]");

    public void userName(String username) {
        wait = new WebDriverWait(Driver, Duration.ofSeconds(300));

        wait.until(ExpectedConditions.elementToBeClickable(UserNamePuttom)).sendKeys(username);

    }

    public void Password(String pass) {
        Driver.findElement(Password).sendKeys(pass);
    }

    public void click_page_login() {
        Driver.findElement(ClickBottom).click();

    }

    public void LOGIN(String username, String pass) {
        userName(username);
        Password(pass);
        click_page_login();

    }

    public void CliCKonIconTEST() {
        wait = new WebDriverWait(Driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(clickOnTestAdmain)).click();
    }

    public void Login_as_user() {
        wait = new WebDriverWait(Driver, Duration.ofSeconds(300));

        wait.until(ExpectedConditions.elementToBeClickable(bage_users)).click();

    }

    public void Field_search() {
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(400));
        WebElement rr = wait.until(ExpectedConditions.elementToBeClickable(icon_field_search));
        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("arguments[0].click();", rr);
    }

    public void field_search(String search) {
        wait = new WebDriverWait(Driver, Duration.ofSeconds(500));
        wait.until(ExpectedConditions.elementToBeClickable(field_search)).sendKeys(search);

    }

    public void Search1(String Search) {
        wait = new WebDriverWait(Driver, Duration.ofSeconds(450));
        WebElement r = wait.until(ExpectedConditions.elementToBeClickable(search1));
/*JavascriptExecutor js1 =(JavascriptExecutor) Driver ;
js1.executeScript("arguments[0].value=arguments[1];",r,Search);
*/
        r.clear();
        r.sendKeys(Search);
    }

    public void LogIn_td() {
        wait = new WebDriverWait(Driver, Duration.ofSeconds(500));
        wait.until(ExpectedConditions.elementToBeClickable(LOGIN_TD)).click();


    }

    public void logint(String userName, String pass, String nameAcc) {
        userName(userName);
        Password(pass);
        click_page_login();
        CliCKonIconTEST();
        Login_as_user();
        Field_search();
        Search1(nameAcc);
        LogIn_td();
    }

    public String topDriver() {

        wait = new WebDriverWait(Driver, Duration.ofSeconds(200));
        WebElement f = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href=\"/driver/558\"])[1]")));
        String nam = f.getText();

        f.sendKeys(Keys.ENTER);
        return nam;
    }

    public String WorstDriver() {
        wait = new WebDriverWait(Driver, Duration.ofSeconds(200));
        WebElement g = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href=\"/driver/558\"])[3]")));
        String c = g.getText();
        g.sendKeys(Keys.ENTER);

        return c;
    }

    public String TopVehicles() {
        wait = new WebDriverWait(Driver, Duration.ofSeconds(300));
        WebElement TopVeh = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@href=\"/vehicle/14260\"])[1]")));
        String x = TopVeh.getText();
        TopVeh.sendKeys(Keys.ENTER);
        return x;

    }

    public String worst_Vehicles() {
        wait = new WebDriverWait(Driver, Duration.ofSeconds(200));
        WebElement worst = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"/vehicle/64301\"]")));
        String x = worst.getText();
        worst.sendKeys(Keys.ENTER);
        return x;

    }

    public void ICON_NAME() {


        WebElement search = Driver.findElement(icon2);

        JavascriptExecutor RR = (JavascriptExecutor) Driver;
        RR.executeScript("arguments[0].style.background = 'red';", search);

        RR.executeScript("arguments[0].click();", search);


    }

    public String Search_name(String name) {

        wait = new WebDriverWait(Driver, Duration.ofSeconds(600));
        WebElement field_search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@ref=\"eInput\"])[6]")));
        field_search.sendKeys(name);


        return name;
    }

    public String search2(String name) {
        wait = new WebDriverWait(Driver, Duration.ofSeconds(300));
        WebElement D = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input [@ref=\"eInput\"])[6]")));
        String x = D.getText();
        D.sendKeys(name);
        return x;

    }

    public void moveto_icons() {
        wait = new WebDriverWait(Driver, Duration.ofSeconds(300));
        WebElement N = Driver.findElement(MAIN_ICON);
        Actions m = new Actions(Driver);
        m.moveToElement(N).perform();


    }

    public String open_track() {
        wait = new WebDriverWait(Driver, Duration.ofSeconds(500));
        WebElement teack = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\"/track\"]")));
        teack.sendKeys(Keys.ENTER);
        String N = teack.getText();
        return N;
    }

    public void refresh() {
        String currentUrl = Driver.getCurrentUrl();
        for (int i = 0; i < 4; i++) {
            Driver.navigate().to(currentUrl);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public void icons_vehicle_idil(){
        wait=new WebDriverWait(Driver,Duration.ofSeconds(200));
     WebElement  icon_idel= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class=\"bg-transparent opacity-2  border-0 p-1 btn btn-primary\"])[1]")));
     icon_idel.click();

        }
        public void group_vehicles1(){
            wait=new WebDriverWait(Driver,Duration.ofSeconds(200));
            WebElement group1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=\"rc-tree-switcher rc-tree-switcher_close\"])[1]")));
                group1.click();

        }
    public void group_vehicles2(){
        wait=new WebDriverWait(Driver,Duration.ofSeconds(200));
        WebElement group1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class=\"rc-tree-switcher rc-tree-switcher_close\"])[2]")));
        group1.click();

    }
}