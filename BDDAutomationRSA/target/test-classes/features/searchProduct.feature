Feature: Search and place order for the products

@task1
Scenario Outline: Search experience should be same for the product in both home and offers page 

Given user is on the landing page of the GreenKart application 
When user searches with the shortname "<Name>" and extracts actual name of the product
Then user searches with same shortname "<Name>" in the offers page 
And validate productname in offers page matches with landing Page  

Examples:
|Name|
|Tom |
|Beet|
