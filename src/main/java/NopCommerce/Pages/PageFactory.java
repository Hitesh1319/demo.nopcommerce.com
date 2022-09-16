package NopCommerce.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    static WebDriver driver;
    private UserRegister userRegister;
    private ComputerPage computerPage;
    private LoginPage loginPage;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public UserRegister getUserRegister() {
        if (userRegister == null) {
            userRegister = new UserRegister(driver);
        }
        return userRegister;
    }

    public ComputerPage getComputerPage() {
        if (computerPage == null) {
            computerPage = new ComputerPage(driver);
        }
        return computerPage;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return  loginPage;
    }
}