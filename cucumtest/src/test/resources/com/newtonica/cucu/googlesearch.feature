@imp
Feature: Search web using duckduckgo

	@ddg
  Scenario: Search web for something using duckduckgo
    Given I am on duckduckgo home page
    When I search for "funny"
    Then title should start with "funny"
	
	@google
	Scenario: Search web for something using google
    Given I am on google home page
    When I search for "funny"
    Then title should start with "funny"