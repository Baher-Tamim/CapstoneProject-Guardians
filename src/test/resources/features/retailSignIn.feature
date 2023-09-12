@Sanity
Feature: Sign in Feature

  Background: User is on retail website
    Given User is on retail website
    When User click on Sign in option

  @signin
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'capstone.baher@tekschool.us' and password 'Capstone@123'
    And User click on login button
    Then User should be logged in into Account

  @createAccount
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name  | email                        | password     | confirmPassword |
      | Baher | capstone.baher1@tekschool.us | Capstone@123 | Capstone@123    |
      | Baher | capstone.baher2@tekschool.us | Capstone@123 | Capstone@123    |
      | Baher | capstone.baher3@tekschool.us | Capstone@123 | Capstone@123    |
    And User click on SignUp button
    Then User should be logged into account page
