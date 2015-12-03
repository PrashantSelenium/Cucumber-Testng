Feature: Login functionality

Scenario Outline: Login

Given I open the browser
When I type username as <username>
When I type password as <password>
When I click at login button
Then Verify home page


Examples: Testing
|username|password|
|myeqtestautomation25@gmail.com|equinox1|

Scenario Outline: InvalidLogin

Given I open the browser
When I type username as <username>
When I type password as <password>
When I click at login button
Then Verify home page not appear


Examples: Testing
|username|password|
|myeqtestautomation25@gmail.com|equinox12|


