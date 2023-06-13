package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div/div/div/ul/li[2]/button")
    public static WebElement LoginButton;

    @FindBy(how = How.NAME, using = "user_login")
    public static WebElement UsernameLoginField;

    @FindBy(how = How.NAME, using = "user_password")
    public static WebElement PasswordLoginField;

    @FindBy(how = How.NAME, using = "submit")
    public static WebElement Submit;

    public void clicksigninButton() {
        LoginButton.click();


    }




    public void enterloginUsername() {
        UsernameLoginField.sendKeys("username");

    }

    public void enterloginpassword() {
        PasswordLoginField.sendKeys("password");

    }

    public void clicksubmit() {
        Submit.click();


    }

}
