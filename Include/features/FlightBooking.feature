Feature: Book the flight based on the user selection
Scenario Outline: User close the marking window

Given User navigated to the cebu Home page
When User click on the close option of the Marketing window
Then Marketing Window should get closed
Then Click on Agree
And Select <Country> and <City>
Then Enter <ToCountry> and <ToCity>
Then Select the <DepartDate>
And Select Return <rDate>
And Click on Select dates button 
Then Enter the child <count>
Then Click on Search flight
And select Depart Flight
And select Return Flight
Then select the fare <Bundle>
And click on Continue
Then click on Got it
And enter the Title <Title>
And enter Firstname <firstName>
Then enter Lastname <lastName>
Then Enter Date of Birth <DD> <MM> <YYYY>
Then Enter Nationality <Nationality>
Then Close the browser


Examples:
|Country |City                     |ToCountry  |ToCity|DepartDate|rDate|count|Bundle        |Title|firstName      |lastName       |DD|MM     |YYYY|Nationality|
|Singapore|Singapore Changi Airport|Philippines|Manila|15        |18   |1    |okay with fare|Mr   |Test First Name|Test Last Name |04|January|2000|Afghanistan|
