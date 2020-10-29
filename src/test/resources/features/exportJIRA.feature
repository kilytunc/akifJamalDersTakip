Feature: 

	#As a truck driver I should be able to access Vehicle Costs page
	@EUG15-185
	Scenario: Track Driver access Vehicle Costs page
		Given user login as driver
		And user navigate to Vehicle Cost page
		When should be able to see all cars' cost informations on the Vehicle Costs
		Then confirm all cars..
		