Feature: BookAClass functionality

Scenario Outline: BAC

Given Open url  with default creditional
When I type username as <username>
When I type password as <password>
When I click at login button
Then Verify home page


Examples: Testing
|username|password|
|test|test|
