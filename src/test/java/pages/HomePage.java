package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // Pay Attention !!!!
    // I will create locators as private
    // Then I will create methods to read them (to click,to send key, isDisplayed)


    @FindBy(xpath = "//a[@class='logo']//img")
    private WebElement wonderworldLogo;

    @FindBy(xpath = "(//a[normalize-space()='Home'])[1]")
    private WebElement homeButtonMainPage;
    @FindBy(xpath = "(//a[normalize-space()='Online Admission'])[1]")
    private WebElement onlineAdmissionButtonMainPage;
    @FindBy(xpath = "(//a[normalize-space()='Exam Result'])[1]")
    private WebElement examResultButtonMainPage;
    @FindBy(xpath = "(//a[normalize-space()='About Us'])[1]")
    private WebElement aboutUsButtonMainPage;
    @FindBy(xpath = "(//a[normalize-space()='Academics'])[1]")
    private WebElement academicsButtonMainPage;

    @FindBy(xpath = "//a[normalize-space()='Facilities']")
    private WebElement facilitiesButtonMainPage;
    @FindBy(xpath = "//a[normalize-space()='School Uniform']")
    private WebElement schoolUniformButtonMainPage;
    @FindBy(xpath = "//a[normalize-space()='Principal Message']")
    private WebElement principalMessageButtonMainPage;
    @FindBy(xpath = "//a[normalize-space()='Know Us']")
    private WebElement knowUsButtonMainPage;
    @FindBy(xpath = "//a[normalize-space()='Approach']")
    private WebElement approachButtonMainPage;
    @FindBy(xpath = "//a[normalize-space()='Teacher']")
    private WebElement teacherButtonMainPage;
    @FindBy(xpath = "//a[normalize-space()='Houses & Mentoring']")
    private WebElement houseMentoringButtonMainPage;
    @FindBy(xpath = "//a[normalize-space()='Student Council']")
    private WebElement studentCouncilButtonMainPage;
    @FindBy(xpath = "//li[@class=' ']//a[normalize-space()='Course']")
    private WebElement courseButtonMainPage;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[normalize-space()='Gallery']")
    private WebElement galleryButtonMainPage;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[normalize-space()='News']")
    private WebElement newsButtonMainPage;
    @FindBy(xpath = "//a[@href='https://wonderworldcollege.com/page/contact-us'][normalize-space()='Contact']")
    private WebElement contactButtonMainPage;

    @FindBy(xpath = "(//div[@class='newstab'])[1]")
    private WebElement newsTabHomePage;

    @FindBy(xpath = "(//marquee[@behavior='scroll'])[1]")
    private WebElement scrollTextHomePage;

    //*******S.D*****
    @FindBy(xpath = "//section[@class='contact']//p")
    private WebElement contactPageVerifyText;
    //(//input[@id='name'])[2]
    @FindBy(xpath = "(//input[@id='name'])[2]")
    private WebElement nameContactPageTextBox;
    @FindBy(xpath = "(//input[@id='email'])[3]")
    private WebElement emailContactPageTextBox;
    @FindBy(xpath = "(//input[@id='subject'])[1]")
    private WebElement subjectContactPageTextBox;
    @FindBy(xpath = "//textarea[@id='description']")
    private WebElement descriptionContactPageTextBox;
    @FindBy(xpath = "(//input[@name='submit'])[1]")
    private WebElement contactPageSubmitButton;
    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement contactPageSuccessfullySubmitAlertMessage;
    @FindBy(xpath = "//div[@class='col-md-12 alert alert-danger']")
    private WebElement contactPageFailureAlert;
    @FindBy(xpath = "(//div[@class='contact-item'])[1]")
    private WebElement ourLocationContactPage;
    @FindBy(xpath = "(//div[@class='contact-item'])[2]")
    private WebElement callUsContactPage;
    @FindBy(xpath = "(//div[@class='contact-item'])[3]")
    private WebElement workingHoursContactPage;


    //******************************************** METHODS *********************************************************

    public void contactButtonMainPageClick(){
        contactButtonMainPage.click();
    }


    public void scrollTextHomePageIsDisplayed() {
        Assert.assertTrue(scrollTextHomePage.isDisplayed());
    }
    public void newsTabHomePageIsDisplayed() {
        Assert.assertTrue(newsTabHomePage.isDisplayed());
    }
    public void wonderworldLogoIsDisplayed() {
        Assert.assertTrue(wonderworldLogo.isDisplayed());
    }

    public void homeButtonMainPageIsDisplayed() {
        Assert.assertTrue(homeButtonMainPage.isDisplayed());
    }

    public void onlineAdmissionButtonMainPageIsDisplayed() {
        Assert.assertTrue(onlineAdmissionButtonMainPage.isDisplayed());
    }

    public void examResultButtonMainPageIsDisplayed() {
        Assert.assertTrue(examResultButtonMainPage.isDisplayed());
    }
    public void  aboutUsButtonMainPageIsDisplayed() {
        Assert.assertTrue(aboutUsButtonMainPage.isDisplayed());
    }

    public void academicsButtonMainPageClick() {
        academicsButtonMainPage.click();
    }
    public void academicsButtonMainPageIsDisplayed() {
        Assert.assertTrue(academicsButtonMainPage.isDisplayed());
    }
    public void facilitiesButtonMainPageIsDisplayed() {
        Assert.assertTrue(facilitiesButtonMainPage.isDisplayed());
    }

    public void schoolUniformButtonMainPageIsDisplayed() {
        Assert.assertTrue(schoolUniformButtonMainPage.isDisplayed());
    }
    public void principalMessageButtonMainPageIsDisplayed() {
        Assert.assertTrue(principalMessageButtonMainPage.isDisplayed());
    }
    public void knowUsButtonMainPageIsDisplayed() {
        Assert.assertTrue(knowUsButtonMainPage.isDisplayed());
    }
    public void approachButtonMainPageIsDisplayed() {
        Assert.assertTrue(approachButtonMainPage.isDisplayed());
    }
    public void teacherButtonMainPageIsDisplayed() {
        Assert.assertTrue(teacherButtonMainPage.isDisplayed());
    }
    public void houseMentoringButtonMainPageIsDisplayed() {
        Assert.assertTrue(houseMentoringButtonMainPage.isDisplayed());
    }
    public void studentCouncilButtonMainPageIsDisplayed() {
        Assert.assertTrue(studentCouncilButtonMainPage.isDisplayed());
    }
    public void courseButtonMainPageIsDisplayed() {
        Assert.assertTrue(courseButtonMainPage.isDisplayed());
    }

    public void galleryButtonMainPageIsDisplayed() {
        Assert.assertTrue(galleryButtonMainPage.isDisplayed());
    }
    public void newsButtonMainPageIsDisplayed() {
        Assert.assertTrue(newsButtonMainPage.isDisplayed());
    }
    public void contactButtonMainPageIsDisplayed() {
        Assert.assertTrue(contactButtonMainPage.isDisplayed());
    }

    //****S.D******
    public void contactPageTextIsDisplayed(){
        Assert.assertTrue(contactPageVerifyText.isDisplayed());
    }
    public void contactPageTextBoxesIsVisible(){
        Assert.assertTrue(nameContactPageTextBox.isDisplayed());
        nameContactPageTextBox.sendKeys("Sezen");
        nameContactPageTextBox.clear();
        Assert.assertTrue( emailContactPageTextBox.isDisplayed());
        emailContactPageTextBox.sendKeys("sezen@gmail.com");
        emailContactPageTextBox.clear();
        Assert.assertTrue( subjectContactPageTextBox.isDisplayed());
        subjectContactPageTextBox.sendKeys("Hello");
        subjectContactPageTextBox.clear();
        Assert.assertTrue(descriptionContactPageTextBox.isDisplayed());

    }
    public void contactPageSuccessfullyMessageWhenEntersRightInformations(){
        nameContactPageTextBox.sendKeys("Vicky");
        emailContactPageTextBox.sendKeys("vicky@gmail.com");
        subjectContactPageTextBox.sendKeys("Hello");
        contactPageSubmitButton.click();


    }
    public void contactPageSubmittedSuccessfullyAlertMessageIsDisplay(){
        Assert.assertTrue(contactPageSuccessfullySubmitAlertMessage.isDisplayed());
        //System.out.println(contactPageSuccessfullySubmitAlertMessage.getText());

    }
    public void contactPageNegativeInformations(String name , String email, String subject, String description){

        nameContactPageTextBox.sendKeys(name);
        emailContactPageTextBox.sendKeys(email);
        subjectContactPageTextBox.sendKeys(subject);
        descriptionContactPageTextBox.sendKeys(description);
        contactPageSubmitButton.click();



    }
    public void contactPageSubmittedFailureAlertMessageIsDisplay(){
        Assert.assertTrue(contactPageFailureAlert.isDisplayed());
        //System.out.println(contactPageSuccessfullySubmitAlertMessage.getText());

    }
    public void contactPageHoursCallUSWorkingHoursIsDisplay(){
        System.out.println(ourLocationContactPage.getText());
        Assert.assertTrue( callUsContactPage.isDisplayed());
        Assert.assertTrue( workingHoursContactPage.isDisplayed());


    }



}
