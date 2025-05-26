package Base_Class;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // Step 1: Run NewCustomer flow and get driver
        NewCustomer nc = new NewCustomer();
        nc.startCustomerFlow();

        // Step 2: Get the driver instance from NewCustomer
        var driver = nc.getDriver();

        // Step 3: Pass driver to Login class
        Login login = new Login(driver);

        // Step 4: Perform the click or show warning action
        login.clickOrShowWarning();

        // Step 5: Clean up and close browser
        driver.quit();
    }
}
