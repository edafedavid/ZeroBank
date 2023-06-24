package Step_Definition;

import Base.TestBase;
import Pages.Bobby_sPOM;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class Invalid_Login extends TestBase {
    //@Given("^I am on the login page$")
    //public void iAmOnTheLoginPage() {

    //}


    @When("^I enter my \"([^\"]*)\" detail$")
    public void iEnterMyDetail(String Login) throws Throwable {
        Bobby_sPOM page = PageFactory.initElements(driver, Bobby_sPOM.class);
        page.EnterLoginField(Login);

    }

    @And("^my \"([^\"]*)\" in the appropriate field$")
    public void myInTheAppropriateField(String Password) throws Throwable {
        Bobby_sPOM page = PageFactory.initElements(driver, Bobby_sPOM.class);
        page.EnterPasswordFld(Password);
    }

    @And("^I click the sign in button$")
    public void iClickTheSignInButton() {
        Bobby_sPOM page = PageFactory.initElements(driver, Bobby_sPOM.class);
        page.ClickSiginBtn();
    }

    @Then("^I should see the appropriate \"([^\"]*)\" as designed$")
    public void iShouldSeeTheAppropriateAsDesigned(String error_messsage) throws Throwable {
        Bobby_sPOM page = PageFactory.initElements(driver, Bobby_sPOM.class);
        page.AssertInvalidLogin(error_messsage);
    }





}
