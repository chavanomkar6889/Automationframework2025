package Base_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement con;

    @FindBy(xpath = "//*[contains(text(),'E-Mail Address is already registered')]")
    private WebElement warning;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String war() {
        String message = warning.getText();
        System.out.println("Warning message: " + message);
        return message;
    }

    public void clickOrShowWarning() {
        try {
            if (con.isDisplayed()) {
                con.click();
                System.out.println("Button clicked successfully.");
            }
        } catch (Exception e) {
            // If button not clickable or not found, show warning
            String message = war();
            System.out.println("Warning: " + message);
        }
    }
}
