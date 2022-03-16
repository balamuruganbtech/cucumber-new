Feature: Structure test

	Background:
		Given I have this common for scenarios1
		Given I have this common for scenarios2
	
	@rule1	
	Rule: First rule
		
		Background:
			Given I have this common for first rule
			
		Scenario: Scenario1 of Rule1
			Given I want to write a step with precondition
			When I complete action
			Then I validate the outcomes
			
		Scenario: Scenario2 of Rule1
			Given I want to write a step with precondition
			When I complete action
			Then I validate the outcomes
			
	@rule2		
	Rule: Second rule
		
		Background:
			Given I have this common for second rule
			
		Scenario: Scenario1 of Rule2
			Given I want to write a step with precondition
			When I complete action
			Then I validate the outcomes
			
		Scenario: Scenario2 of Rule2
			Given I want to write a step with precondition
			When I complete action
			Then I validate the outcomes
			
	@rule3
	Rule: Third rule
		
		Background:
			Given I have this common for third rule
			
		Scenario: Scenario1 of Rule3
			Given I had 10 candies
			When I tasted 2 out of it
			Then I should have 8 remaining
			
		Scenario: Scenario2 of Rule3
			Given I had 10 candies
			When I tasted 5 out of it
			Then I should have 5 remaining
