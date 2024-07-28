Feature: Free CRM Login Feature
Scenario Outline: Free Crm Login Test Scenario
Given user is already in login page
When title of login page is Cogmento CRM
Then user enters username as <username> and pswrd as <password>
Then user click on loginBtn
Examples: 
|username|password|
|"saba@123"|"1234"|
|"saba@231"|"4321"|