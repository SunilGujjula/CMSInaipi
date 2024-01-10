Feature: CMSinaipi

@Login
Scenario: Successful Login with Valid Credentials
  Given User open url "https://inaipi.ae/v2/login"
  When User enter the email "sangeeth@galadariauto.com"
  When User enter the password "123456"
  Then Click on Login button
  
@Customer
Scenario: Successful add the customer details
  Given User click on the customer
  When User have to add the customer 
  Then User have to text the customer name
  And User have to text the mobile number
  And User have to text the secoundary number
  Then User have to text the Email
  Then User have to text the Customer Address
  Then User have to click on apply button
  
@Customer  
Scenario: successful edit and delete buttons
  Given User text on customer name
  When User click on the search button
  And User click on edit button
  And User text on last name
  Then User click on update button

  
#@Ticket 
#Scenario: Successful Add Ticket details
  #Given User click on Ticket functionality
  #Then User click on Add Ticket button
  #And User Text on mobile number
  #Then User click on search button
  #When User click on radio button
  #Then User click on submit button
  #And User select the case type
  #And User select the complaint type
  #And User select the complaint sub type
  #Then User select the channel
  #Then User Text the Title
  #Then User click on create button
  #
@Ticket 
Scenario: Successful filters Ticket details
  Given User click on Ticket functionalitys
  When User select the filters 
  Then User select the from date
  And User select the today date 
  When User select the priority
  Then User click on apply buttons
  
  
@Reports
Scenario: Successful Add reports details 
  Given User click on Reports functionality
  When User click on Ticket Reports
  Then User click on filters
  And User select the date
  And User select the status 
  Then User click on Apply button
  
@Reports
Scenario: Successful Audit reports details 
  Given User click on Report
  When User click on Audit Reports
  Then User click on filter
  And User select on date
  Then User click on Apply
  
@Reports
Scenario: Successful Sla reports details 
  Given User click on Reports function
  When User click on SLA Reports
  Then User click on filterss
  And User select the Todate
  And User select the Select levels 
  Then User click on Applys
  
#@Reports
#Scenario: Successful complaint reports details   
  #Given User click on Report funct
  #When User click on Complaint Reports
 #
#@Reports
#Scenario: Successful Agent work balance reports details  
  #Given User click on the Reports functionality
  #When User click on Agent work balance Reports
  #
#@Reports 
#Scenario: Successful Department workbalance reports details  
  #Given User click on Report functions
  #When User click on Department work balance Reports
 
@Reports
Scenario: Successful Ticket history reports details  
  Given User click Report functionality
  When User click on Ticket history Reports
  Then User click on filts
  And User search the ticketid
  Then User click on applys buttons
  
  
@Reports 
Scenario: Successful service complaint reports
  Given User click on reports
  When User click on service complaint reports
  Then User click on filters button 
  And User select on january month 
  Then User select the facility field
  Then User select the department field
  Then User click on apply button
  
@Reports 
Scenario: Successful Monthly Case Status Report
  Given User click on monthly reports
  When User click on Monthly Case Status reports 
  
 
@KB
Scenario: Successful Add KB reports details  
  Given User click on Knowledgebase
  When User click on Create KB
  Then User click on Create KnowledgeBase
  And User Text on Title 
  And User select the arrow
  And User select the group
  And User Text on Description
  Then User click on Create buttons
  
@KB
Scenario: Successful  KB view details  
  Given User click on Knowledge base
  When User click on Create KB view
  Then User click on kb filters
  And User select the kb category 
  And User select the kb group
  Then User click on Apply btn
 
 @Settings 
  Scenario: Successfull add the category details
  Given User click on settings
  When User click on category 
  Then User click on Add category
  And User Text on category
  Then User click on submits
  
  @Settings
  Scenario: Successfull add the group details
  Given User click on setting
  When User click on group
  Then User click on Add group
  And User select category
  And User text on Group
  Then User click on the create button
  
  #@Settings
  #Scenario: Successfull add the facility details
  #Given User click on set
  #When User click on facility 
  #Then User click on Add facility
  #And User Text on facility
  #Then User click on creats
  #
  #@Settings
  #Scenario: Successfull add the casetype details
  #Given User click on the setting
  #When User click on casetype 
  #Then User click on Add casetype
  #And User Text on casetype
  #And User Text on casetype label
  #Then User click on creat
  #
  #@Settings
  #Scenario: Successfull add the channel details 
  #Given User click on seting
  #When User click on channel 
  #Then User click on Add channel
  #And User Text on channel
  #Then User click on create bnt
  #
  #@Settings
  #Scenario: Successfull add the department details 
  #Given User click the setting
  #When User click on department 
  #Then User click on Add department
  #And User select the facility
  #And User Text on department
  #Then User click on create buttonn
  #
  #@Settings
  #Scenario: Successfull add the call reason
  #Given User click sitting
  #When User click on call reason
  #Then User click on Add call reason
  #And User text on call reason
  #Then User click on submit buton
  #
  #@Settings
  #Scenario: Successfull add the complaint
  #Given User click sitting complaint
  #When User click on complaint
  #Then User click on Add complaint
  #And User text on complaint
  #Then User click on submit buttons
  #
#@Settings
#Scenario: Successfull add the sub type complaint
  #Given User click sitting complaint sub type
  #When User click on complaint sub
  #Then User click on Add complaint button 
  #Then User select on complaints
  #And User text on complaint sub type
  #Then User click on submit
    
  
@Logout 
Scenario: Successful Logout 
  Given User click on profile 
  Then User click on Logout button
  
  
  