package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class NopPage {
    WebDriver driver;
    String  url_link="https://plugin.nop-station.com/login";
    By userName=By.id("Email");
    By password=By.id("Password");
    By log_btn = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    By logout_btn = By.xpath("/html/body/div[6]/div[2]/div[1]/div[2]/div[1]/ul/li[2]/a");
    // By add_to_cart1 = By.xpath("(//button[contains(@class,'button-2 product-box-add-to-cart-button')and starts-with(text(),'Add to cart')])[1]");
    By add_to_cart1 =  By.xpath("/html/body/div[6]/div[4]/div/div/div/div/div[5]/div[2]/div[15]/div/div[2]/div[3]/div[3]/button[1]");
    By add_to_cart2 = By.xpath("//button[contains(@class,'button-1 add-to-cart-button')and starts-with(text(),'Add to cart')]");
    By item = By.xpath("/html/body/div[6]/div[4]/div/div/div/div/div[5]/div[2]/div[15]/div/div[2]/div[3]/div[3]/button[1]");
    By shop = By.xpath("//span[contains(@class,'cart-label')]");
    By check_box = By.xpath("//input[(@id='termsofservice') and (@type='checkbox')  ]");
    By check_out = By.xpath("//button[(@type='submit')and(@id='checkout')]");
    By billing_address= By.xpath("//button[contains(@class,'new-address-next-step-button')]");
    By shipping_address = By.xpath("//button[contains(@class,'new-address-next-step-button')]");
    By shipping = By.xpath("//button[contains(@class,'shipping-method-next-step-button')]");
    By payment = By.xpath("//button[contains(@class,'payment-method-next-step-button')]");
    By payment_info = By.xpath("//button[contains(@class,'payment-info-next-step-button')]");
    By confirm_order = By.xpath("//button[contains(@class,'confirm-order-next-step-button')]");
    By confirm = By.xpath("//button[(@type='button') and (starts-with(text(),'Confirm')) and  contains(@class,'confirm-order-next-step-button')]");
    public NopPage(WebDriver driver) {
        this.driver=driver;

    }

    public void loginPage(){
        driver.get(url_link);
    }

    public void enterUserNamePassword() throws InterruptedException {
        driver.findElement(userName).clear();
        driver.findElement(userName).sendKeys("foysal134038@gmail.com");
        Thread.sleep(2000);
        driver.findElement(password).clear();
        Thread.sleep(2000);
        driver.findElement(password).sendKeys("12345678");

    }

    public void clickLogin() throws InterruptedException {
        driver.findElement(log_btn).click();
        Thread.sleep(2000);
    }

    public void navigateHomePage() throws InterruptedException {
        driver.findElement(add_to_cart1).click();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0,3500)");
        Thread.sleep(2000);

    }
    public void itemAddToCart() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,3500)");
        driver.findElement(By.xpath("/html/body/div[6]/div[4]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[11]/div[2]/button")).click();
        Thread.sleep(2000);

    }
    public void shoppingCart() throws InterruptedException {
   driver.findElement(shop).click();
   Thread.sleep(2000);
    }
    public void billingAndShippingAddress(){
        driver.findElement(billing_address).click();
        driver.findElement(shipping_address).click();

    }
    public void shipping(){
        driver.findElement(shipping);
    }
    public void payment(){

        driver.findElement(payment);
    }
    public void payment_info(){

        driver.findElement(payment_info);
    }
    public void conf_order(){

        driver.findElement(confirm_order);
        driver.findElement(confirm);
    }

    public void clickLogout() throws InterruptedException {
        driver.findElement(logout_btn).click();
        Thread.sleep(2000);
    }
}
