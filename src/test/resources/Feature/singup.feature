@tag
Feature: Validating the signing up in the demo application
Scenario Outline: creation of a user in the demo appliation
Given user should have launched the application & present on home screen
And sign up link is clicked 
And registered page gets open
And I click on the taech course radio buttion
When valid details are entered "<firstname>" & "<lastname>" & "<email>" & "<username>" & "<password>" & "<cpassword>" & "<phonenumber>"  
And clicked on register link
Then home screen with  newly crated user name should get diplayed

Examples:
|firstname |lastname|email            |username|password|cpassword|phonenumber|
|Manzoor   |Mehedi  |manzoor@gmail.com|manzoor91235 |manzoor |manzoor  |9876543210 |

