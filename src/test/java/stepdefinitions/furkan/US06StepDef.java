package stepdefinitions.furkan;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US06StepDef {

    AdminPage adminPage = new AdminPage();

    @Given("Admin goes to {string} school panels page")
    public void adminGoesToSchoolPanelsPage(String url) {
        adminPage.goToUrl(url);
    }

    @Then("Admin verifies that WONDER WORLD COLLEGE text is visible")
    public void adminVerifiesThatWONDERWORLDCOLLEGETextIsVisible() {
        adminPage.schoolPanelsWonderWorldCollegeTextIsVisible();
    }

    @And("Admin closes the page")
    public void adminClosesThePage() {
        adminPage.closeDriver();
    }

    @Then("Admin verifies that ADMIN LOGIN button is visible")
    public void adminVerifiesThatADMINLOGINButtonIsVisible() {
        adminPage.schoolPanelsAdminLoginButtonIsVisible();
    }

    @Then("Admin clicks ADMIN LOGIN button")
    public void adminClicksADMINLOGINButton() {
        adminPage.schoolPanelsAdminLoginButtonClicks();
    }

    @Then("Admin verifies that Admin switches to {string} admin login page")
    public void adminVerifiesThatAdminSwitchesToAdminLoginPage(String url) {
        adminPage.navigatesToUrl(url);
    }

    @Then("Admin verifies that {string} admin login page is visible")
    public void adminVerifiesThatAdminLoginPageIsVisible(String url) {
        adminPage.verifyingUrl(url);

    }

    @Given("Admin goes to {string} admin login page")
    public void adminGoesToAdminLoginPage(String url) {
        adminPage.goToUrl(url);
    }

    @Then("Admin verifies that Admin Login window is visible")
    public void adminVerifiesThatAdminLoginWindowIsVisible() {
        adminPage.adminLoginPageAdminWindowIsVisible();
    }

    @Then("Admin verifies that Whats New In Wonder World College is visible")
    public void adminVerifiesThatWhatsNewInWonderWorldCollegeIsVisible() {
        adminPage.adminLoginWonderWorldCollegeTextIsVisible();
    }

    @Then("Admin verifies that Admin Login text is visible")
    public void adminVerifiesThatAdminLoginTextIsVisible() {
        adminPage.adminLoginAdminLoginTextIsVisible();

    }

    @Then("Admin verifies Username and Password text box is visible and functional")
    public void adminVerifiesUsernameandPasswordTextBoxIsVisibleAndFunctional() {
        adminPage.adminLoginUsernameAndPasswordTextBoxIsVisibleAndFunctional();
    }


    @Then("Admin verifies Sing In button is visible and functional")
    public void adminVerifiesSingInButtonIsVisibleAndFunctional() {
        adminPage.adminLoginSignInButtonIsVisibleAndFunctional();
    }

    @Then("Admin clicks Forgot Password button")
    public void adminClicksForgotPasswordButton() {
        adminPage.adminLoginForgotPasswordButtonClicks();
    }

    @Then("Admin navigates to Admin forgot password page")
    public void adminNavigatesToAdminForgotPasswordPage() {
        adminPage.navigatesToForward();

    }

    @Then("Admin verifies Email text box and Submit button are visible and functional")
    public void adminVerifiesEmailTextBoxAndSubmitButtonAreVisibleAndFunctional() {
        adminPage.adminLoginForgotPasswordPageUsernameTextBoxAndSubmitButtonAreVisibleAndFunctional();

    }


    @Given("Admin goes to {string} admin forgot password page")
    public void adminGoesToAdminForgotPasswordPage(String url) {
        adminPage.goToUrl(url);
    }

    @Then("Admin enters {string} and clicks Submit button")
    public void adminEntersAndClicksSubmitButton(String email) {
        adminPage.adminLoginForgotPasswordPageEmailEnterAndClickSubmitButton(email);
    }

    @Then("Admin verifies that Please Check Your Email To Recover Your Password text is visible")
    public void adminVerifiesThatPleaseCheckYourEmailToRecoverYourPasswordTextIsVisible() {
        adminPage.adminLoginForgotPasswordPageCheckYourEmailAlert();
    }

    @Then("Admin clicks Admin Login Button in admin forgot password page")
    public void adminClicksAdminLoginButtonInAdminForgotPasswordPage() {
        adminPage.adminLoginForgotPasswordPageAdminLoginButtonClicks();
    }

    @Then("Admin verifies that Admin navigates to {string} admin login page")
    public void adminVerifiesThatAdminNavigatesToAdminLoginPage(String url) {
        adminPage.navigatesToForward();
        adminPage.verifyingUrl(url);
    }

    @Then("Admin clicks User Login Button")
    public void adminClicksUserLoginButton() {
        adminPage.adminLoginUserLoginButtonClicks();

    }

    @Then("Admin verifies that Admin navigates to {string} user login page")
    public void adminVerifiesThatAdminNavigatesToUserLoginPage(String url) {
        adminPage.navigatesToUrl(url);
        adminPage.verifyingUrl(url);
    }

    @Then("Admin clicks Front Site Button")
    public void adminClicksFrontSiteButton() {
        adminPage.adminLoginFrontSiteButtonClicks();
    }

    @Then("Admin verifies that Admin switches to {string} home page")
    public void adminVerifiesThatAdminSwitchesToHomePage(String url) {
        adminPage.navigatesToUrl(url);
        adminPage.verifyingUrl(url);
    }

    @Then("Admin enters a registered {string} in Email text box")
    public void adminEntersARegisteredInEmailTextBox(String email) {
        adminPage.adminLoginEnterRegisteredEmail(email);

    }

    @Then("Admin enters a registered {string} in Password text box")
    public void adminEntersARegisteredInPasswordTextBox(String password) {
        adminPage.adminLoginEnterRegisteredPassword(password);
    }

    @Then("Admin clicks Sing In button")
    public void adminClicksSingInButton() {
        adminPage.adminLoginSingInButtonClicks();

    }

    @Then("Admin verifies that Admin Profile Icon is visible")
    public void adminVerifiesThatAdminProfileIconIsVisible() {
        adminPage.verifyAdminProfileIcon();

    }

    @Then("Admin enters a {string} unregistered Email in Email text box")
    public void adminEntersAUnregisteredEmailInEmailTextBox(String unEmail) {
        adminPage.adminLoginEnterUnRegisteredEmail(unEmail);

    }

    @Then("Admin enters a {string} unregistered Password in Password text box")
    public void adminEntersAUnregisteredPasswordInPasswordTextBox(String unPassword) {
        adminPage.adminLoginEnterUnRegisteredPassword(unPassword);
    }

    @Then("Admin verifies that Invalid Username Or Password text is visible")
    public void adminVerifiesThatInvalidUsernameOrPasswordTextIsVisible() {
        adminPage.verifyAdminLoginInvalidUsernameOrPasswordAlert();

    }


}
