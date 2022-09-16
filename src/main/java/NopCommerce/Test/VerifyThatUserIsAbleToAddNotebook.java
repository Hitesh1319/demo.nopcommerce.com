package NopCommerce.Test;

import org.testng.annotations.Test;

public class VerifyThatUserIsAbleToAddNotebook extends BaseClass{
    @Test
    public void notebookAddToCart() {
        pageFactory.getUserRegister().registeringUser();
        pageFactory.getComputerPage().computerNotebook();
        pageFactory.getComputerPage().checkout();
        pageFactory.getLoginPage().login();
        pageFactory.getComputerPage().checkout();
    }
}
