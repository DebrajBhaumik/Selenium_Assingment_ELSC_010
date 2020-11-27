@tag
Feature: Create a new user and register for a course
Scenario Outline: Admin creating a new user to register for a course
Given I logged in as an admin user 
And click on the add a user link
And I am able to see Add a user page gets open
And I entered "<firstname>" & "<lastname>" & "<email>" & "<username>" & "<password>" 
When I click on the "<submit>" button
Then I am able to see user creation is successful
And I click on the "Administration" link
And I am able to see user courses page
And I click the "Add_users_to_course" link
And I am able see Enrolment by classes page
And I select the <user> created ealier from the user list drop down
And I select a course from the course list
When I click on the <Add to the course > button
Then I am able to see "The selected users are subscribed to the selected course" message 

Examples:
|firstname |lastname|email            |username|password|
|Manzoor   |Mehedi  |manzoor@gmail.com|manzoor91235 |manzoor|



