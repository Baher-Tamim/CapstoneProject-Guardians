@End2End
Feature: Retail Order Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'kobi@tekschool.us' and password 'Password@123'
    And User click on login button
    And User should be logged in into Account

  @addItem
  Scenario: Verify User can add an item to cart
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  @addOrderWithAddress
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    And User changes the category to the 'Electronics'
    And User searchs for an item 'Apex Legends'
    And User clicks on Search icon
    And User clicks on item
    And User selects quantity '5'
    And User clicks add to Cart button
    Then the carts icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a confirmation message should be displayed 'Order Placed Successfully'

  @orderCancellation
  Scenario: Verify User can cancel the order
    And User click on Orders section
    And User click on first order in list
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on Cancel Order button
    Then a cancelation message should be displayed 'Your Order Has Been Cancelled'

  @addOrderWithAddress
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    And User changes the category to the 'Electronics'
    And User searchs for an item 'Apex Legends'
    And User clicks on Search icon
    And User clicks on item
    And User selects quantity '3'
    And User clicks add to Cart button
    Then the carts icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a confirmation message should be displayed 'Order Placed, Thanks'

  @returnOrder
  Scenario: Verify User can Return the order
    And User clicks on Orders section
    And User clicks on first order in list
    And User clicks on Return Items button
    And User selects the Return Reason 'Item damaged'
    And User selects the drop off service 'FedEx'
    And User clicks on Return Order button
    Then the cancelation message should be displayed 'Return was successful'

  @addReview
  Scenario: Verify User can write a review on order placed
    And User click on the Orders section
    And User click on the first order in list
    And User click on Review button
    And User write Review headline 'headline value' and 'review text'
    And User click Add your Review button
    Then a review message should be displayed 'Your review was added successfully'
