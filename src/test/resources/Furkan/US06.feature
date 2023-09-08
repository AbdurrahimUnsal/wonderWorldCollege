
Feature: As an administrator (admin), I want an admin panel to be available for performing administrative tasks, and I want to be able to log in to the admin panel with registered email and password.

  Scenario: TC01 It should be verified that the URL used for accessing the school panels is accessible

    Given Admin goes to "schoolPanelsUrl" school panels page
    Then Admin verifies that WONDER WORLD COLLEGE text is visible
    And Admin closes the page


  Scenario: TC02 On the panels page, it should be verified that there is a visible admin login button to enter the admin panel, and when clicked, it redirects to the ""sitelogin"" page.

    Given Admin goes to "schoolPanelsUrl" school panels page
    Then Admin verifies that ADMIN LOGIN button is visible
    Then Admin clicks ADMIN LOGIN button
    Then Admin verifies that Admin switches to "adminLoginUrl" admin login page
    Then Admin verifies that "adminLoginUrl" admin login page is visible
    And Admin closes the page


  Scenario: TC03 On the "sitelogin" page, there should be a login window on the left side and information about "What's New In Wonder World College" on the right side.

    Given Admin goes to "adminLoginUrl" admin login page
    Then Admin verifies that Admin Login window is visible
    Then Admin verifies that Whats New In Wonder World College is visible
    And Admin closes the page

  Scenario: TC04 On the "sitelogin" page, it should be verified that the login window displays "Admin login."

    Given Admin goes to "adminLoginUrl" admin login page
    Then Admin verifies that Admin Login text is visible
    And Admin closes the page

  Scenario: TC05 On the "sitelogin" page, it should be verified that the Username and Password text boxes and the SignIn button are visible and functional.

    Given Admin goes to "adminLoginUrl" admin login page
    Then Admin verifies Username and Password text box is visible and functional
    Then Admin verifies Sing In button is visible and functional
    And Admin closes the page


  Scenario: TC06 When clicking on the "Forgot password?" link, it should open a page with an email text box and a Submit button, and they should be visible and functional.

    Given Admin goes to "adminLoginUrl" admin login page
    Then Admin clicks Forgot Password button
    Then Admin navigates to Admin forgot password page
    Then Admin verifies Email text box and Submit button are visible and functional
    And Admin closes the page

  Scenario: TC07 On the "Forgot password" page, after entering an email address in the email text box and clicking the Submit button, it should be verified that an email is sent to the entered email address.
    Given Admin goes to "adminForgotPassword" admin forgot password page
    Then Admin enters "Email" and clicks Submit button
    Then Admin verifies that Please Check Your Email To Recover Your Password text is visible
    And Admin closes the page

  Scenario: TC08 When clicking on the "Admin Login" link on the "Forgot password" page, it should redirect to the "sitelogin" page.

    Given Admin goes to "adminForgotPassword" admin forgot password page
    Then Admin clicks Admin Login Button in admin forgot password page
    Then Admin verifies that Admin navigates to "adminLoginUrl" admin login page
    And Admin closes the page


  Scenario: TC09 When clicking on the "User login" link on the "sitelogin" page, it should redirect to the "userlogin" page.

    Given Admin goes to "adminLoginUrl" admin login page
    Then Admin clicks User Login Button
    Then Admin verifies that Admin navigates to "userLoginUrl" user login page
    And Admin closes the page

  Scenario: TC10 On the "sitelogin" page, there should be a link for returning to the Front Site, and when clicked, it should redirect to the homepage (anasayfa).

    Given Admin goes to "adminLoginUrl" admin login page
    Then Admin clicks Front Site Button
    Then Admin verifies that Admin switches to "homePage" home page
    And Admin closes the page

  Scenario: TC11 On the "sitelogin" page, it should be verified that after entering a system registered email and password in the text boxes and clicking the SignIn button, access to the relevant panel is granted.

    Given Admin goes to "adminLoginUrl" admin login page
    Then Admin enters a registered "Email" in Email text box
    Then Admin enters a registered "Password" in Password text box
    Then Admin clicks Sing In button
    Then Admin verifies that Admin Profile Icon is visible
    And Admin closes the page

  Scenario: TC12 On the "sitelogin" page, it should be verified that after entering an email and password that are not registered in the system and clicking the SignIn button, access to the panel should not be granted.

    Given Admin goes to "adminLoginUrl" admin login page
    Then Admin enters a "unregisteredEmail" unregistered Email in Email text box
    Then Admin enters a "unregisteredPassword" unregistered Password in Password text box
    Then Admin clicks Sing In button
    Then Admin verifies that Invalid Username Or Password text is visible
    And Admin closes the page

