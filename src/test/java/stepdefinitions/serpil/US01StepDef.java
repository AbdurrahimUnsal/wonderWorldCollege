package stepdefinitions.serpil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US01StepDef {

    HomePage homePage = new HomePage();


    @Given("User navigates to {string} Site")
    public void user_navigates_to_site(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("homepage should be visible")
    public void homepage_should_be_visible() {

       homePage.wonderworldLogoIsDisplayed();
    }

    @Then("close the page")
    public void close_the_page() {
       // Driver.getDriver().close();
    }

}
