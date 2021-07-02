Feature: Hotel Booking In Adactin Application

@SanityTest
Scenario Outline: AAA
Given User Launch The Application
When User Enter The "<Username>" In Usernamefield
And User Enter The "<Password>" In Passwordfield
Then User Click On The Login Button And It Navigates To The Search Hotel


Examples:
|Username||Password|
|AAA||2345|
|DFGR||3457|
|sarandev88||sairam12$|


@SanityTest
Scenario:

When User Selects Location
And User Selects The Hotel
And User Selects Roomtype
And User Selects Required Number Of Rooms
And User Selects Adults In Room field
And User Selects Children In Room Field
Then User Click Search Button  And It Navigates To The  Select Hotel

@regressionTest
Scenario: Select  Hotel Page
When User Chooses Hotel From The Radio Button
Then  User Clicks On Continue Button And It Navigates To The Book A Hotel

@SanityTest
Scenario: Boook A Hotel
When User Enter Their First Name
And User Enters Their Last Name
And User Enters Billing Address
And User Enters  Credit Card Number
And User Enters Credit Card Type
And User Chooses Credit Card Expiry Month
 And User Chooses Credit Card Expiry Year
And User Chooses Cvv Number
Then User Clicks Booknow Button And It Navigates To The  Booking Confirmation

@regressionTest
Scenario: Booking Confirmation
Then User Clicks Booked Itinerary

@regressionTest
Scenario: Booked Itinerary
When Click Order Id Checkbox
Then User Clicks Logout Button





 














