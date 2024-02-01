Feature: Login page Automation of saucedemo app 

Scenario Outline: check login is successful with valid creds 
Given User is on login page 
When User enters valid username and password
And Clicks on Login Button 
Then User is navigated to home page 
And close the browser 

Examples: 
| username                  | password |
| standard_user             | secret_sauce |

