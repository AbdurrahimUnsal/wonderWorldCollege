package stepdefinitions.serpil;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class US05StepDef {
  HomePage homePage = new HomePage();

    @Then("Click the Contact from the nav-bar")
    public void click_the_contact_from_the_nav_bar() {

      homePage.contactButtonMainPageClick();
    }

  @And("Verify that the Contact menu title is visible and clickable.")
  public void verifyThatTheContactMenuTitleIsVisibleAndClickable() {
        homePage.contactPageTextIsDisplayed();

  }

  @And("Verify inside the send query section: name, Email,Subject, Description text boxes is visible.")
  public void verifyInsideTheSendQuerySectionNameEmailSubjectDescriptionTextBoxesIsVisible() {
        homePage.contactPageTextBoxesIsVisible();

  }

//    @And("Entering valid data in the text areas in the Send In Your Query section")
//    public void enteringValidDataInTheTextAreasInTheSendInYourQuerySection() {
//      homePage.contactPageSuccessfullyMessageWhenEntersRightInformations();
//  }
//    @Then("Verify  that alert message.")
//    public void verifyThatAlertMessage() {
//        homePage.contactPageSubmittedSuccessfullyAlertMessageIsDisplay();
//    }
@Then("entering valid data in the text areas in the Send In Your Query section")
public void entering_valid_data_in_the_text_areas_in_the_section() {
 homePage.contactPageSuccessfullyMessageWhenEntersRightInformations();
}
  @Then("clicking the Submit button")
  public void clicking_the_submit_button() {

  }
  @Then("Verify the alert message")
  public void verify_the_alert_message() {
    homePage.contactPageSubmittedSuccessfullyAlertMessageIsDisplay();
  }


  @And("entering invalid data {string}, {string},{string},{string}in the text areas in the Send In Your Query section")
  public void enteringInvalidDataInTheTextAreasInTheSendInYourQuerySection(String name, String email, String subject, String description) {
  homePage.contactPageNegativeInformations(name,email,subject,description);
    }

  @And("Verify the failure alert message")
  public void verifyTheFailureAlertMessage() {
      homePage.contactPageSubmittedFailureAlertMessageIsDisplay();
  }


  @And("Wait two second")
  public void waitSecond() throws InterruptedException {
      Thread.sleep(2000);
  }

  @Then("Verify our location, call us, working hours is visible.")
  public void verifyOurLocationCallUsWorkingHoursIsVisible() {

  homePage.contactPageHoursCallUSWorkingHoursIsDisplay();
  }
}


