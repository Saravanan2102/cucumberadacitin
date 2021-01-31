Feature: check the hotel page
Scenario Outline: chech the hotel details and book the room
Given   user enter to login page "<userName>" and "<Password>" 
And user enter the room details "<firstName>" and "<lastName>" and "<billing Address>" and "<creditcard no>" and "<cvv number>"
And user enter the room type
When enter the personal details
When submit the button
Then verifying the success msg

Examples:
|firstName|Password|firstName|lastName|billing Address|creditcard no|cvv number|
|Kannansiva|kannan2003|Saran|K|12OMR|9876543210912345|121|