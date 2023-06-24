package Step_Definition;

import Base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import java.io.IOException;

public class Commonstep2 extends TestBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL2"));
        driver.manage().window().maximize();
    }
}
