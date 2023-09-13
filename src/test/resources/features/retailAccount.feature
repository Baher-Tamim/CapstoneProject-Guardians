@Sanity
Feature: Retail Account Pageâ€‹

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'capstone.baher@tekschool.us' and password 'Capstone@123'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @updateInfo
  Scenario: Verify User can update Profile Information
    And User click on Account option
    And User update Name 'Capstone' and Phone 'phoneNumber'
    And User click on Update button
    Then user profile information should be updated

  @addPayment
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | Capstone   |               7 |           2032 |          789 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  @editPayment
  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | Capstone   |               7 |           2030 |          555 |
    And user click on Update Your Card button
    Then update message should be displayed 'Payment Method updated sucessfully'

  @removeCard
  Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then payment details should be removed

  @addAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city    | state      | zipCode |
      | United States | Capstone | phoneNumber |          1234 |  89 | Hayward | California | zipcode |
    And User click Add Your Address button
    Then address message should be displayed 'Address Added Successfully'

  #@editAddress
  #Scenario: Verify User can edit an Address added on account
  #And User click on edit address option
  #And user fill new address form with below informations
  #| country       | fullName | phoneNumber | streetAddress | apt | city    | state      | zipCode |
  #| United States | Capstone | phoneNumber |          1234 |  89 | Hayward | California | zipcode |
  #And User click update Your Address button
  #Then update address message should be displayed 'Address Updated Successfully'
 
  @removeAddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
