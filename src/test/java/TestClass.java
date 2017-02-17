import org.testng.annotations.Test;

/**
 * Created by QA on 2/17/2017.
 */
public class TestClass {
    @Test(priority=1, description="This testcase will verify the login funtionality")
    public void loginApplication(){
        System.out.println("Successfully Logged in to the Application");
//Assert.assertEquals(1, 3);
    }

    @Test (priority=2, description="This testcase will verify the place order funtionality")
    public void placeOrder(){
        System.out.println("Successfully placed an Order");
    }

    @Test (priority=3, description="This testcase will verify the check out funtionality")
    public void checkOut(){
        System.out.println("Successfully checked out the Order");
    }
}
