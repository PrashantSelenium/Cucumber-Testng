Feature: Login functionality

Scenario Outline: Login

Given I open the browser
When I type username as <username>
When I type password as <password>
When I click at login button
Then Verify home page


Examples: Testing
|username|password|
|test|test|
|sgl.rohit@gmail.com|rohit@way2|