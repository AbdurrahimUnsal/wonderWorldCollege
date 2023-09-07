Feature:US01 As a user, I want to be able to access the website to use it.

  @US01
  Scenario: TC01 The user should be able to access the website from the browser using the given URL.
    Given User navigates to "wonderWorldUrl" Site
    Then  homepage should be visible
    And   close the page