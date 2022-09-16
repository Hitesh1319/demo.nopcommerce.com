package NopCommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By login = By.linkText("Log in");
    By email = By.xpath("//input[@class='email']");
    By password = By.xpath("//input[@class='password']");
    By submit = By.xpath("//button[@type='submit' and text()='Log in']");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        driver.findElement(login).click();
        driver.findElement(email).sendKeys("Random@gmail.com");
        driver.findElement(password).sendKeys("Random123");
        driver.findElement(submit).click();
    }
}
