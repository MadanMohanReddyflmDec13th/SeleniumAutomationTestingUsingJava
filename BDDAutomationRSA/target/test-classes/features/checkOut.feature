Feature: Validate same product is appearing in checkout page

@task2
Scenario Outline: Verify the same product name appears in the checkout page
Given user is on the landing page of the GreenKart application
When user searches with the shortname "<Name>" and extracts actual name of the product
And added "3" items of the selected product to cart 
Then the user proceeds to checkout and validate the "<Name>" items in checkout page 
And verify user has ability to enter promo code and place order
	
Examples:
| Name |
| Tom  |
