package testng_knowledge;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class _04_TestDescription {

    @Test(priority = 1, description = "Login with valid credentials")
    public void login(){
        System.out.println("This is login");
    }

    //@Ignore used to ignore a test case when running (doesn't even reflect in the console)
    @Test(priority = 2, description = "Login with invalid credentials")
    public void invalidLogin(){
        System.out.println("This is invalid login");
    }
}
