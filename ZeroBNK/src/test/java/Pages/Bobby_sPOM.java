package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Bobby_sPOM {
    @FindBy(how = How.ID, using = "user_login")
    public static WebElement LoginField;

    @FindBy(how = How.NAME, using = "user_password")
    public static WebElement PasswordField;

    @FindBy(how = How.CLASS_NAME, using = "btn")
    public static WebElement SigninButton;

    @FindBy(how = How.CSS, using = "div.alert")
    public static WebElement ErrorMessage;

    @FindBy(how = How.ID, using = "onlineBankingMenu")
    public static WebElement OnlineBanking;


    @FindBy(how = How.XPATH, using = "//h1")
    public static WebElement onlinebankingmessage;

    public void EnterLoginField(String Login) {
        LoginField.sendKeys(Login);
    }

    public void EnterPasswordFld(String Password) {
        PasswordField.sendKeys(Password);
    }

    public void ClickSiginBtn(){ SigninButton.click();}

    public void AssertInvalidLogin(String error_message) {
        String ActualText = ErrorMessage.getText();
        Assert.assertEquals(ActualText, error_message);
        System.out.println("This is the error message displayed: " + ActualText);
    }

    public void ClickOnlineBankingBtn(){ OnlineBanking.click();}

    public void AssertOnlineBankingpage() {
        String ExpectedTxt = "Online Banking";
        String ActualText = onlinebankingmessage.getText();
        Assert.assertEquals(ActualText, ExpectedTxt);
        System.out.println("This is the error message displayed: " + ActualText);
    }
}
