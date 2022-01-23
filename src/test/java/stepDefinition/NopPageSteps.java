package stepDefinition;

//import Driver.BaseDriver;
import com.pages.NopPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.build.Plugin;
import org.apache.hc.core5.reactor.Command;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NopPageSteps {
    // Login
    WebDriver driver=null;
    NopPage log;
    JavascriptExecutor js = (JavascriptExecutor) driver;
   // @Before
    @Given("browser is open")
    public void browser_is_open() throws InterruptedException {
       //System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
       //driver = new FirefoxDriver();
       System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
       driver = new ChromeDriver();
        driver.get("https://plugin.nop-station.com/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);


    }

    @And("user is on login page")
    public void user_is_on_login_page() {
         log = new NopPage(driver);
         log.loginPage();
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        log = new NopPage(driver);
        log.enterUserNamePassword();
        log.clickLogin();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
        // For scrollbar
       // JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,3500)");
        Thread.sleep(2000);

        log.navigateHomePage();
     //   driver.findElement(By.xpath("/html/body/div[6]/div[4]/div/div/div/div/div[5]/div[2]/div[15]/div/div[2]/div[3]/div[3]/button[1]")).submit();

    }



    //Checkout

    @Given("add an item to my shoping cart")
    public void add_an_item_to_my_shoping_cart() throws InterruptedException {
        Thread.sleep(2000);
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(2000);
       log.itemAddToCart();
       // driver.findElement(By.xpath("/html/body/div[6]/div[4]/div/div/div/div/div[5]/div[2]/div[15]/div/div[2]/div[3]/div[3]/button[1]")).submit();
    }
    @When("click add to cart")
    public void click_add_to_cart() throws InterruptedException {
        log.shoppingCart();

    }
    @And("select billing address and shipping address")
    public void select_billing_address_and_shipping_address() {

        log.billingAndShippingAddress();
    }
    @And("select a shipping method")
    public void select_a_shipping_method() {
        log.shipping();
       // driver.findElement(By.xpath()).click();
    }
    @And("select a payment method")
    public void select_a_payment_method() {
        log.payment();
        System.out.println("5");
    }
    @And("select a payment information")
    public void select_a_payment_information() {

        log.payment_info();
    }
    @And("confirm order")
    public void confirm_order() {
        log.conf_order();
    }
    @Then("successfully check out")
    public void successfully_check_out() {
        System.out.println("Successfully checkout");
       // driver.findElement(By.xpath()).click();
    }

    //Logout Action
    @When("user is logout")
    public void user_is_logout() throws InterruptedException {
        log.clickLogout();
       //driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
    }
    @Then("logout successfully")
    public void logout_successfully() throws InterruptedException {
        //log.clickLogout();

    }
    @And("browser is quit by driver")
    public void browser_is_quit_by_driver() {
        driver.close();
    }


}