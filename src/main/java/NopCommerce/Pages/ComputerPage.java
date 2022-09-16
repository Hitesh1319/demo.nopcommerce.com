package NopCommerce.Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ComputerPage {
    WebDriver driver;

    int number;
    By computers = By.linkText("Computers");
    By notebooks = By.linkText("Notebooks");
    By product = By.xpath("//div[@class='item-box']");
    By asusNotebook = By.linkText("Asus N551JK-XO076H Laptop");
    By addToCartButton = By.xpath("//button[@type='button' and @id='add-to-cart-button-5']");
    By shoppingCart = By.linkText("Shopping cart");
    By productVerify = By.xpath("//td[@class='sku']");
    By checkout = By.xpath("//button[@id='checkout']");
    By readioInput = By.xpath("//input[@id='termsofservice']");
    By countryBilling = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By countrySelect = By.xpath("//option[@value='133' and text()='India']");
    By cityInput = By.xpath("//input[@type='text' and @id='BillingNewAddress_City']");
    By address1 = By.xpath("//input[@type='text' and @id='BillingNewAddress_Address1']");
    By address2 = By.xpath("//input[@type='text' and @id='BillingNewAddress_Address2']");

    public ComputerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void computerNotebook() {
        driver.findElement(computers).click();
        driver.findElement(notebooks).click();
        List<WebElement> objectDetails = driver.findElements(product);
        number = objectDetails.size();
        driver.findElement(asusNotebook).click();
        driver.findElement(addToCartButton).click();
        driver.findElement(shoppingCart).click();
        String actual = driver.findElement(productVerify).getText();
        Assert.isTrue(actual.equals("AS_551_LP"), "Expected result does not match with actual result");
    }

    public void checkout() {
        driver.findElement(readioInput).click();
        driver.findElement(checkout).click();
    }

    public void bilingAddress() {
        driver.findElement(countryBilling).click();
        driver.findElement(countrySelect).click();
        driver.findElement(cityInput).sendKeys("Delhi");
        driver.findElement(address1).sendKeys("Random #103 Delhi India");
        driver.findElement(address2).sendKeys("Random #103 Delhi India");
    }
}
