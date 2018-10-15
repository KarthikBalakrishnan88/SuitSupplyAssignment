Feature: Order Custom Made Trouser
  As a customer
  In order to order me trouser of my custom choice
  I should be able to use the Custom made module of the web application

  Background:
    Given I navigate to the custom made trousers page

  Scenario: I should be able to see the default price and delivery overview on the page
    Given Im on the customise trouser page
    Then I should see the default price and delivery details as below
      | Delivery  | Price     | Return Ploicy               |
      | 3-4 WEEKS | € 170 EUR | FREE RETURNS ON CUSTOM MADE |
    And the Add to Bag button should be disabled

  Scenario Outline: I should be able to customise the Fabric of my trouser
    Given Im on the customise trouser page
    When I select the Fabric as "<Fabric>"
    Then in the details page the fabric is added as "Grey Check Wool Cashmere"
    And the default price is increased with "<Extra Price>"
    Examples:
      | Fabric                   | Extra Price |
      | Grey Check Wool Cashmere | 10 Eur      |
      | Light Brown Plain Wool   | 0 Eur       |

  Scenario Outline: I should be able to use the filter option to select my fabric
    Given Im on the customise trouser page
    When I select the color as "<color>"
    And design as "<design>"
    Then I should see the results "<Results>"
    Examples:
      | color | design | Results              |
      | Grey  | Stripe | More than one item   |
      | Black | Check  | Item not found error |

  Scenario: I should be able to filter my fabric using fabric code
    Given Im on the customise trouser page
    When I filter the fabric with Code as "404.598"
    Then I should see the fabric "Grey Stripe Flannel" in the results

  Scenario Outline: I should be able to customise the Fit
    Given Im on the customise trouser page
    And I select the Fabric as "Grey Stripe Flannel"
    When I select the Fit as "<Fit>"
    Then I should see in the overview the fit is updated as "<Fit>"
    Examples:
      | Fit        |
      | Brescia    |
      | Washington |

  Scenario Outline: I should be able to customise the Fit
    Given Im on the customise trouser page
    And I select the Fabric as "Grey Stripe Flannel"
    And I select the Fit as "Brescia"
    When I select the Turn up as "<TurnUp>"
    Then I should see the overview is updated with turnup as "<TurnUp>"
    Examples:
      | TurnUp          |
      | With Turn Up    |
      | Without Turn Up |

  Scenario Outline: I should be able to customise the belt loop
    Given Im on the customise trouser page
    And I select the Fabric as "Grey Stripe Flannel"
    And I select the Fit as "Brescia"
    And I select the Turn up as "With Turn Up"
    When I select the belt loop as "<Belt Loop>"
    Then I should see the overview is updated with belt loop as "<Belt Loop>"
    Examples:
      | Belt Loops     |
      | Belt Loops     |
      | Side Adjusters |

@Regression
    Scenario: I should be able to add my custom trouser to the bucket
      Given Im on the customise trouser page
      And I select the Fabric as "Grey Stripe Flannel"
      And I select the Fit as "Brescia"
      And I select the Turn up as "With Turn Up"
      And I select the belt loop as "Belt Loops"
      And I select the size as "42"
      When I click on Add to bag
      Then my order should be in the bucket


