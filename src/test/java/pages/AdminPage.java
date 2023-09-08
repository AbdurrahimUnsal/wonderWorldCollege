package pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
public class AdminPage {
    public AdminPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    //                          --------------------------- BEGINNING OF FURKAN'S LCOATERS ---------------------------

    @FindBy(xpath = "//h1[normalize-space()='Wonder World College']")
    private WebElement schoolPanelsWonderWorldCollegeText;

    @FindBy(xpath = "//a[normalize-space()='Admin Login']")
    private WebElement schoolPanelsAdminLoginButton;

    @FindBy(xpath = "//div[@class='form-bottom']")
    private WebElement adminLoginAdminWindow;

    @FindBy(xpath = "(//h3[normalize-space()=\"What's New In Wonder World College\"])[1]")
    private WebElement adminLoginWonderWorldCollegeText;

    @FindBy(xpath = "//h3[normalize-space()='Admin Login']")
    private WebElement adminLoginAdminLoginText;

    @FindBy(xpath = "//input[@id='form-username']")
    private WebElement adminLoginUsernameTextBox;

    @FindBy(xpath = "//input[@id='form-password']")
    private WebElement adminLoginPasswordTextBox;

    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    private WebElement adminLoginSingInButton;

    @FindBy(xpath = "//p[normalize-space()='The Username field is required.']")
    private WebElement adminLoginUsernameFieldIsRequiredWarning;

    @FindBy(xpath = "//p[normalize-space()='The Password field is required.']")
    private WebElement adminLoginPasswordFieldIsRequiredWarning;

    @FindBy(xpath = "//a[normalize-space()='Forgot Password?']")
    private WebElement adminLoginForgotPasswordButton;

    @FindBy(xpath = "//input[@id='form-username']")
    private WebElement adminLoginForgotPasswordPageEmailTextBox;

    @FindBy(xpath = "//p[normalize-space()='The Email field is required.']")
    private WebElement adminLoginForgotPasswordPageEmailFieldWarning;

    @FindBy(xpath = "//button[normalize-space()='Submit']")
    private WebElement adminLoginForgotPasswordPageSubmitButton;

    @FindBy(xpath = "//a[normalize-space()='Admin Login']")
    private WebElement adminLoginForgotPasswordPageAdminLoginButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement adminLoginForgotPasswordPageCheckYourEmailAlert;

    @FindBy(xpath = "//a[normalize-space()='Front Site']")
    private WebElement adminLoginUserLoginButton;

    @FindBy(xpath = "//a[normalize-space()='User Login']")
    private WebElement adminLoginFrontSiteButton;

    @FindBy(xpath = "//img[@class='topuser-image']")
    private WebElement adminDashboardAdminProfileIcon;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement adminLoginInvalidUsernameOrPasswordAlert;


        //                          --------------------------- END OF FURKAN'S LOCATERS ---------------------------








        //                          --------------------------- BEGINNING OF FURKAN METHODS ---------------------------


    public void schoolPanelsWonderWorldCollegeTextIsVisible() {
        Assert.assertTrue(schoolPanelsWonderWorldCollegeText.isDisplayed());
    }
    public void goToUrl(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    public void closeDriver() {
        Driver.closeDriver();
    }
    public void schoolPanelsAdminLoginButtonIsVisible() {
        Assert.assertTrue(schoolPanelsAdminLoginButton.isDisplayed());
    }
    public void schoolPanelsAdminLoginButtonClicks() {
        schoolPanelsAdminLoginButton.click();
    }
    public void navigatesToUrl(String url){
        Driver.getDriver().navigate().to(ConfigReader.getProperty(url));
    }
    public void verifyingUrl(String url) {
        String expectedUrl = ConfigReader.getProperty(url);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
    public void adminLoginPageAdminWindowIsVisible() {
        Assert.assertTrue(adminLoginAdminWindow.isDisplayed());
    }
    public void adminLoginWonderWorldCollegeTextIsVisible() {
        Assert.assertTrue(adminLoginWonderWorldCollegeText.isDisplayed());
    }
    public void adminLoginAdminLoginTextIsVisible() {
        Assert.assertTrue(adminLoginAdminLoginText.isDisplayed());
    }
    public void adminLoginUsernameAndPasswordTextBoxIsVisibleAndFunctional() {
        Assert.assertTrue(adminLoginUsernameTextBox.isDisplayed());
        Assert.assertTrue(adminLoginPasswordTextBox.isDisplayed());
        adminLoginSingInButton.click();
        Assert.assertTrue(adminLoginPasswordFieldIsRequiredWarning.isDisplayed());
        Assert.assertTrue(adminLoginPasswordFieldIsRequiredWarning.isDisplayed());
    }
    public void adminLoginSignInButtonIsVisibleAndFunctional() {
        Assert.assertTrue(adminLoginSingInButton.isDisplayed());
        adminLoginSingInButton.click();
        Assert.assertTrue(adminLoginPasswordFieldIsRequiredWarning.isDisplayed());
        Assert.assertTrue(adminLoginPasswordFieldIsRequiredWarning.isDisplayed());
    }
    public void adminLoginForgotPasswordButtonClicks() {
        adminLoginForgotPasswordButton.click();
    }
    public void navigatesToForward(){
        Driver.getDriver().navigate().forward();
    }
    public void adminLoginForgotPasswordPageUsernameTextBoxAndSubmitButtonAreVisibleAndFunctional() {
        Assert.assertTrue(adminLoginForgotPasswordPageEmailTextBox.isDisplayed());
        Assert.assertTrue(adminLoginForgotPasswordPageSubmitButton.isDisplayed());
        adminLoginForgotPasswordPageSubmitButton.click();
        Assert.assertTrue(adminLoginForgotPasswordPageEmailFieldWarning.isDisplayed());
    }
    public void adminLoginForgotPasswordPageEmailEnterAndClickSubmitButton(String email){
        adminLoginForgotPasswordPageEmailTextBox.sendKeys(ConfigReader.getProperty(email));
        adminLoginForgotPasswordPageSubmitButton.click();
    }
    public void adminLoginForgotPasswordPageAdminLoginButtonClicks() {
        adminLoginForgotPasswordPageAdminLoginButton.click();
    }
    public void adminLoginForgotPasswordPageCheckYourEmailAlert(){
        Assert.assertTrue(adminLoginForgotPasswordPageCheckYourEmailAlert.isDisplayed());
    }
    public void adminLoginUserLoginButtonClicks() {
        adminLoginUserLoginButton.click();
    }
    public void adminLoginFrontSiteButtonClicks() {
        adminLoginFrontSiteButton.click();
    }
    public void adminLoginEnterRegisteredEmail(String email){
        adminLoginUsernameTextBox.sendKeys(ConfigReader.getProperty(email));
    }
    public void adminLoginEnterRegisteredPassword(String password){
        adminLoginPasswordTextBox.sendKeys(ConfigReader.getProperty(password));
    }
    public void adminLoginSingInButtonClicks() {
        adminLoginSingInButton.click();
    }
    public void verifyAdminProfileIcon(){
        Assert.assertTrue(adminDashboardAdminProfileIcon.isDisplayed());
    }
    public void adminLoginEnterUnRegisteredEmail(String email){
        adminLoginUsernameTextBox.sendKeys(ConfigReader.getProperty(email));
    }
    public void adminLoginEnterUnRegisteredPassword(String password){
        adminLoginPasswordTextBox.sendKeys(ConfigReader.getProperty(password));
    }
    public void verifyAdminLoginInvalidUsernameOrPasswordAlert(){
        Assert.assertTrue(adminLoginInvalidUsernameOrPasswordAlert.isDisplayed());

    }
//                          --------------------------- BEGINNING OF FURKAN'S METHODS ---------------------------
}
