Feature: Leaftaps Edit Lead Functionality

Scenario Outline: Edit Lead
    Given Click <Link> link
    Given Click Phone Tab
    Given Give Phone Number as <phoneNo>
    Given Click Find Lead Button
    And Click The First LeadId
    And Click <editLink> link
    And Update Company Name as <companyName>
    When Click Update Button
    Then Company Name Should be <companyName>
    
Examples: 
|Link|phoneNo|editLink|companyName|
|'Find Leads'|'99'|'Edit'|'ABC'|