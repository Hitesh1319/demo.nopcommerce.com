package NopCommerce.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    static WebDriver driver;
    private UserRegister userRegister;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public UserRegister getUserRegister() {
        if (userRegister == null) {
            userRegister = new UserRegister(driver);
        }
        return userRegister;
    }
}