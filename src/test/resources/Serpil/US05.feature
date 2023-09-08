Feature:US05 As a user, I want a "Contact" page on the website with contact information so that
  I can get in touch with the school administration.
  Background:
    Given User navigates to "wonderWorldUrl" Site
    Then Click the Contact from the nav-bar

  Scenario: TC01 When the 'Contact' menu title in the top bar of the homepage is clicked, it should redirect to the 'Contact' page.

     And Verify that the Contact menu title is visible and clickable.
     Then close the page

    Scenario:TC02 On the 'Contact' page, it should be verified that the 'Send In Your Query' section contains visible and editable text boxes for Name, Email, Subject, and Description.

      And Verify inside the send query section: name, Email,Subject, Description text boxes is visible.
      Then close the page

  Scenario: TC03 - Verify Successful Query Submission
    And entering valid data in the text areas in the Send In Your Query section
    And clicking the Submit button
    And Verify the alert message
    And close the page

  Scenario Outline: TC04 Verify Query Submission Failure
    And entering invalid data "<name>", "<email>","<subject>","<description>"in the text areas in the Send In Your Query section
    And clicking the Submit button
    And Verify the failure alert message
    And Wait two second
    And close the page
    Examples:
      | name       |  email       |  subject | description              |
      |            |  s@gmail.com | hello    |  New student registration|
      |  Vicky     |  s@gmail.com |          |  New student registration|
      |  Vicky     |              | hello    |  New student registration|
    Scenario: TC05 On the 'Contact' page, it should be verified that the information for 'Our Location', 'Call Us', and 'Working Hours' is visible.

       Then Verify our location, call us, working hours is visible.
       And  close the page




