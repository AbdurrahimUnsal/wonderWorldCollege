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




}
