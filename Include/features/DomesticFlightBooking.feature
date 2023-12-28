Feature: Book the flight based on the user selection
Scenario Outline: [Member][Anonymous] Verify that user is able to book a domestic flight without addons and using gobasic fare bundle

Given User navigated to the cebu Home page
When User click on the close option of the Marketing window and cookies banner
Then Login to CEBU based on user type <userType>,<Email>,<Password>
And Search the flight <Country>,<City>,<ToCountry>,<ToCity>,<DepartDate>,<rDate>,<count>,<tripTypes>
And Choose the return and depart flights 
Then select the fare <Bundle>
And Enter Guest Details<userType>,<FlightType>,<Title>,<firstName>,<lastName>,<DD>,<MM>,<YYYY>,<Nationality>,<CTitle>,<CfirstName>,<ClastName>,<CDD>,<CMM>,<CYYYY>,<CNationality>,<mobileNumber>,<email>,<CountryCode>
Then Add Addons<addOns>
And Click on Continue button in Add ons Page
Then Click on Proceed Anyway<FlightType>,<addOns>
And consent Agreement in booking summary
Then Make the payment<cardNumber>,<cardFName>,<cardLName>,<cvv>,<address>,<Ccity>,<CzipCode>
And Enter otp<otp>
Then Verify Confirmation Message
Then Close the browser

Examples: 
|userType    |FlightType      |addOns |Email                 |Password |Country   |City                     |ToCountry  |ToCity |DepartDate|rDate|count|Bundle        |Title|firstName      |lastName       |DD|MM     |YYYY|Nationality|CTitle|CfirstName      |ClastName       |CDD|CMM     |CYYYY|CNationality|CountryCode|mobileNumber|email            |cardNumber      |cardFName|cardLName|cvv|address        |Ccity  |CzipCode|otp   |tripTypes |



