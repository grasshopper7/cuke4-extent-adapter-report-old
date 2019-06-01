Feature: Scenario Outlines feature file

  Scenario Outline: Scenario Outline Row <row_num>
    Given Write a 'given' step with precondition in '<scenario_num>'
    When Complete action in 'when' step in '<scenario_num>'
    Then Validate the outcome in 'then' step in '<scenario_num>'

    Examples: 
      | scenario_num         | row_num |
      | Scenario Outline One |       1 |
