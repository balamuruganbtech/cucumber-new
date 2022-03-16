@template1
Feature: Title of your feature
	I want to data among step definition
	Scenario Outline: Title of your scenario outline
		Given I want to  write a step with <name>
		When I check for the <value> in step
		Then I verify the <status> in step
	 
	  Examples:
		 | name  | value | status  |
		 | test1 | 100   | success |
		 | test2 | 200   | success |
		 | test3 | 300   | failure |
		 | test4 | 400   | success |