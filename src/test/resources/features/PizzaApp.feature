@regression @smoke @ui
Feature:  Pizza application place order functionality

  @RTB-15 @POF-1
  Scenario: Validating successful place order
    Given user navigates to "PizzaAppURL" application
    When user creates pizza order with data
      | Pizza    | Small 6 Slices - no toppings |
      | Topping1 | Mushrooms                    |
      | Topping2 | Extra cheese                 |
      | Quantity | 1                            |
      | Name     | Patel Harsh                  |
      | Email    | patel@gmail.com              |
      | Phone    | 1234456789                   |
      | Payment  | Cash on Pickup               |
    Then user validates that order is created with message "Thank you for your order! TOTAL: 6.75 Small 6 Slices - no toppings"

