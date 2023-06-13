package Step_Definition;



import Base.TestBase;
import Pages.Loginpage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static Base.TestBase.CONFIG;
import static Base.TestBase.driver;

public class Commonstep1 extends TestBase {
    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the application home page$")
    public void iAmOnTheApplicationHomePage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();

    }

    @And("^I login$")
    public void iLogin() {
        Loginpage page = PageFactory.initElements(driver, Loginpage.class);
       page.clicksigninButton();

       page.enterloginUsername();
       page.enterloginpassword();
       page.clicksubmit();




    }
}
