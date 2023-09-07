package stepdefinitions.Abdurrahim;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class US02StepDef {

        HomePage homePage = new HomePage();

        @Then("the site logo should be visible")
        public void the_site_logo_should_be_visible() {
            homePage.wonderworldLogoIsDisplayed();
        }

        @Then("the Home  button should be visible")
        public void the_home_button_should_be_visible() {
            homePage.homeButtonMainPageIsDisplayed();
        }

        @Then("the Online Admission button should be visible")
        public void the_online_admission_button_should_be_visible() {
            homePage.onlineAdmissionButtonMainPageIsDisplayed();
        }

        @Then("the Exam Result button should be visible")
        public void the_exam_result_button_should_be_visible() {
            homePage.examResultButtonMainPageIsDisplayed();
        }

        @Then("the About Us button should be visible")
        public void the_about_us_button_should_be_visible() {
            homePage.aboutUsButtonMainPageIsDisplayed();
        }

        @Then("the Academics button and its elements should be visible")
        public void the_academics_button_and_its_elements_should_be_visible() {
            homePage.academicsButtonMainPageIsDisplayed();
            homePage.academicsButtonMainPageClick();
            homePage.facilitiesButtonMainPageIsDisplayed();
            homePage.schoolUniformButtonMainPageIsDisplayed();
            homePage.principalMessageButtonMainPageIsDisplayed();
            homePage.knowUsButtonMainPageIsDisplayed();
            homePage.approachButtonMainPageIsDisplayed();
            homePage.teacherButtonMainPageIsDisplayed();
            homePage.houseMentoringButtonMainPageIsDisplayed();
            homePage.studentCouncilButtonMainPageIsDisplayed();
        }

        @Then("the Course button should be visible")
        public void the_course_button_should_be_visible() {
            homePage.courseButtonMainPageIsDisplayed();
        }

        @Then("the Gallery button should be visible")
        public void the_galery_button_should_be_visible() {
            homePage.galleryButtonMainPageIsDisplayed();
        }

        @Then("the News button should be visible")
        public void the_news_button_should_be_visible() {
            homePage.newsButtonMainPageIsDisplayed();
        }

        @Then("the Contact button should be visible")
        public void the_contact_button_should_be_visible() {
            homePage.contactButtonMainPageIsDisplayed();
        }
        @When("find scrolling texts on the top bar")
        public void find_scrolling_texts_on_the_top_bar() {

        }
        @Then("verify the visibility of scrolling text on the top bar")
        public void verify_the_visibility_of_scrolling_text_on_the_top_bar() {

        }
        @Then("close the page")
        public void close_the_page() {

        }

    }

