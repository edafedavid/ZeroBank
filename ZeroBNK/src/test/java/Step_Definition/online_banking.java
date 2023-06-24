package Step_Definition;

import Pages.Bobby_sPOM;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static Base.TestBase.driver;

public class online_banking {
    @When("^I click the online banking btn$")
    public void iClickTheOnlineBankingBtn() {
        Bobby_sPOM page = PageFactory.initElements(driver, Bobby_sPOM.class);
        page.ClickOnlineBankingBtn();

    }

    @Then("^I should be directed to the online banking page$")
    public void iShouldBeDirectedToTheOnlineBankingPage() {
        Bobby_sPOM page = PageFactory.initElements(driver, Bobby_sPOM.class);
        page.AssertOnlineBankingpage();
    }
}
