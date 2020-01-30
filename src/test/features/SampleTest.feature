Feature: Login Functionality Feature

In order to ensure Login Functionality works,
I want to run the cucumber test to verify it is working

Scenario Outline: Login Functionality

Given user navigates to SOFTWARETETINGHELP.COM
When user logs in using Username as "<USER>" and Password "<PASSWORD>"
Then login should be successful

Examples:
|USER|PASSWORD|
|anupam|sinha|
|ritika|siddharth|

