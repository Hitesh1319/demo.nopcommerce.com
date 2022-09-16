package NopCommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class UserRegister {

    WebDriver driver;
    WebDriverWait wait;

    By register = By.linkText("Register");
    By gender = By.xpath("//input[@type='radio' and @id='gender-male']");
    By firstName =By.xpath("//input[@type='text' and @id='FirstName']");
    By lastName =By.xpath("//input[@type='text' and @id='LastName']");
    By dateOfBirthDay =By.xpath("//select[@name='DateOfBirthDay']");
    By dateOfBirthMonth =By.xpath("//select[@name='DateOfBirthMonth']");
    By dateOfBirthYear =By.xpath("//select[@name='DateOfBirthYear']");
    By dateYear=By.xpath("//option[@value='1990' and text()='1990']");
    By dateMonth=By.xpath("//option[@value='8' and text()='August']");
    By dateDay= By.xpath("//option[@value='5' and text()='5']");
    By email =By.xpath("//input[@type='email' and @id='Email']");
    By company=By.xpath("//input[@id='Company']");
    By password =By.xpath("//input[@id='Password']");
    By confirmPassword=By.xpath("//input[@id='ConfirmPassword']");
    By registerButton=By.xpath("//button[@id='register-button']");
    //By dateOfBirthDay =By.xpath("//select[contains(@name,'DateOfBirthDay')and text()='5']");

    public UserRegister(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void registeringUser() {
        driver.findElement(register).click();
        driver.findElement(gender).click();
        driver.findElement(firstName).sendKeys("Random");
        driver.findElement(lastName).sendKeys("Tester");
        driver.findElement(dateOfBirthDay).click();
        driver.findElement(dateDay).click();
        driver.findElement(dateOfBirthMonth).click();
        driver.findElement(dateMonth).click();
        driver.findElement(dateOfBirthYear).click();
        driver.findElement(dateYear).click();
        driver.findElement(email).sendKeys("Random@gmail.com");
        driver.findElement(company).sendKeys("TextNg");
        driver.findElement(password).sendKeys("Random123");
        driver.findElement(confirmPassword).sendKeys("Random123");
        driver.findElement(registerButton).click();
    }
}
