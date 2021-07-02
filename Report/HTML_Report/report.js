$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "AAA",
  "description": "",
  "id": "hotel-booking-in-adactin-application;aaa",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter The \"\u003cUsername\u003e\" In Usernamefield",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"\u003cPassword\u003e\" In Passwordfield",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click On The Login Button And It Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;aaa;",
  "rows": [
    {
      "cells": [
        "Username",
        "",
        "Password"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;aaa;;1"
    },
    {
      "cells": [
        "AAA",
        "",
        "2345"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;aaa;;2"
    },
    {
      "cells": [
        "DFGR",
        "",
        "3457"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;aaa;;3"
    },
    {
      "cells": [
        "sarandev88",
        "",
        "sairam12$"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-application;aaa;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "AAA",
  "description": "",
  "id": "hotel-booking-in-adactin-application;aaa;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter The \"AAA\" In Usernamefield",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"2345\" In Passwordfield",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click On The Login Button And It Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 8298133400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 16
    }
  ],
  "location": "Step_definition.user_Enter_The_In_Usernamefield(String)"
});
formatter.result({
  "duration": 2393557500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2345",
      "offset": 16
    }
  ],
  "location": "Step_definition.user_Enter_The_In_Passwordfield(String)"
});
formatter.result({
  "duration": 149515200,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel()"
});
formatter.result({
  "duration": 773433400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "AAA",
  "description": "",
  "id": "hotel-booking-in-adactin-application;aaa;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter The \"DFGR\" In Usernamefield",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"3457\" In Passwordfield",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click On The Login Button And It Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 433323800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DFGR",
      "offset": 16
    }
  ],
  "location": "Step_definition.user_Enter_The_In_Usernamefield(String)"
});
formatter.result({
  "duration": 138207800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3457",
      "offset": 16
    }
  ],
  "location": "Step_definition.user_Enter_The_In_Passwordfield(String)"
});
formatter.result({
  "duration": 138370300,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel()"
});
formatter.result({
  "duration": 502175800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "AAA",
  "description": "",
  "id": "hotel-booking-in-adactin-application;aaa;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter The \"sarandev88\" In Usernamefield",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter The \"sairam12$\" In Passwordfield",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click On The Login Button And It Navigates To The Search Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 381391400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sarandev88",
      "offset": 16
    }
  ],
  "location": "Step_definition.user_Enter_The_In_Usernamefield(String)"
});
formatter.result({
  "duration": 120525900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sairam12$",
      "offset": 16
    }
  ],
  "location": "Step_definition.user_Enter_The_In_Passwordfield(String)"
});
formatter.result({
  "duration": 108471900,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel()"
});
formatter.result({
  "duration": 14091085800,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User Selects Location",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User Selects The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Selects Roomtype",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Selects Required Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User Selects Adults In Room field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User Selects Children In Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Click Search Button  And It Navigates To The  Select Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Selects_Location()"
});
formatter.result({
  "duration": 1923266000,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Selects_The_Hotel()"
});
formatter.result({
  "duration": 151031500,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Selects_Roomtype()"
});
formatter.result({
  "duration": 160564600,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Selects_Required_Number_Of_Rooms()"
});
formatter.result({
  "duration": 161368000,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Selects_Adults_In_Room_field()"
});
formatter.result({
  "duration": 123475500,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Selects_Children_In_Room_Field()"
});
formatter.result({
  "duration": 123944000,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Click_Search_Button_And_It_Navigates_To_The_Select_Hotel()"
});
formatter.result({
  "duration": 938034600,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Select  Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select--hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "User Chooses Hotel From The Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User Clicks On Continue Button And It Navigates To The Book A Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Chooses_Hotel_From_The_Radio_Button()"
});
formatter.result({
  "duration": 92853400,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Clicks_On_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel()"
});
formatter.result({
  "duration": 870666300,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Boook A Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;boook-a-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User Enter Their First Name",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User Enters Their Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User Enters Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User Enters  Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User Enters Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "User Chooses Credit Card Expiry Month",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User Chooses Credit Card Expiry Year",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "User Chooses Cvv Number",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User Clicks Booknow Button And It Navigates To The  Booking Confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Enter_Their_First_Name()"
});
formatter.result({
  "duration": 757628900,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enters_Their_Last_Name()"
});
formatter.result({
  "duration": 102144000,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enters_Billing_Address()"
});
formatter.result({
  "duration": 167574700,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enters_Credit_Card_Number()"
});
formatter.result({
  "duration": 296376500,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enters_Credit_Card_Type()"
});
formatter.result({
  "duration": 249529800,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Chooses_Credit_Card_Expiry_Month()"
});
formatter.result({
  "duration": 596729500,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Chooses_Credit_Card_Expiry_Year()"
});
formatter.result({
  "duration": 131846100,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Chooses_Cvv_Number()"
});
formatter.result({
  "duration": 78970600,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Clicks_Booknow_Button_And_It_Navigates_To_The_Booking_Confirmation()"
});
formatter.result({
  "duration": 5141129200,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Booking Confirmation",
  "description": "",
  "id": "hotel-booking-in-adactin-application;booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "line": 48,
  "name": "User Clicks Booked Itinerary",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Clicks_Booked_Itinerary()"
});
formatter.result({
  "duration": 1451888900,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Booked Itinerary",
  "description": "",
  "id": "hotel-booking-in-adactin-application;booked-itinerary",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 50,
      "name": "@regressionTest"
    }
  ]
});
formatter.step({
  "line": 52,
  "name": "Click Order Id Checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "User Clicks Logout Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.click_Order_Id_Checkbox()"
});
formatter.result({
  "duration": 173178800,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Clicks_Logout_Button()"
});
formatter.result({
  "duration": 415249900,
  "status": "passed"
});
});