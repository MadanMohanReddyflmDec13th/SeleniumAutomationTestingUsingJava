Feature: To validate login functionality of Adactin hotel app

Scenario: To validate login using valid credentials

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When the user enters text "Madan Reddy" into textbox using xpath "//input[@name='username']" 
And user enters text "Madan123" into textbox using xpath "//input[@name='password']"
And user clicks on button using xpath "//input[@name='login']"
Then user verify the title to be "Adactin.com - Search Hotel"
   