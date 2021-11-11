Feature: leaftaps CreateLead functionality

#Background:
#Given Open the Chrome Browser
#And Load the application url 'http://leaftaps.com/opentaps'

Scenario Outline: Create Lead With Mandatory Details
Given Click on <createLeadLink> link
Given Enter Company Name as <companyName>
And Enter First Name as <firstName>
And Enter Last Name as <lastName>
And Enter Phone Number as <phoneNo>
When Click Submit Button
Then Title page should contains with <expTitle>

Examples: 
|createLeadLink|companyName|firstName|lastName|phoneNo|expTitle|
|'Create Lead'|'TestLeaf'|'Stefi'|'R'|'99'|'View Lead'| 