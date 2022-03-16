Feature: Step Arguments
@args1
	Scenario: I wants to pass some data to step1
		Given I have data in table with 1 column
	  
		 | City    |
		 | Chennai |
		 | Mumbai  |
		 
@args2
	Scenario: I wants to pass some data to step2
		Given I have data in table with 2 column
	  
		 | City    | Number |
		 | Chennai | 1      |
		 | Mumbai  | 2      |
		 
@args3
	Scenario: I wants to pass some data to step3
		Given I have data in table with 3 column
	  
		 | City    | Number | Mobile |
		 | Chennai | 1      | 72     |
		 | Mumbai  | 2      | 82     |
		 
@args4
	Scenario: I wants to pass some data to step4
		Given I have data in table with 4 column
	  
		 | UserId    | Name  | Mobile |Country|
		 | 1         | Test1 | 72     | IN    |
		 | 2         | Test2 | 82     | USA   |
		 		 
@args5
	Scenario: I wants to pass some data to step6
		Given I have 3 red t-shirts

@args6		
	  Scenario:  I wants to pass data to step using docstring as json 
	  Given I have a json data in doc string
	  """
	  	  	{"userId":"test1","passwd":"testpass"}
	  	  	{"userId":"test1","passwd":"testpass2"}
	  """
	   