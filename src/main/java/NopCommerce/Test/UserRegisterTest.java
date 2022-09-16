package NopCommerce.Test;

import org.testng.annotations.Test;

public class UserRegisterTest extends BaseClass {
    @Test
    public void register() {
        pageFactory.getUserRegister().registeringUser();
    }
}
