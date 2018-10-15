Feature: Any client - Order Product

  A client want to order a guitar on our store

  Background:
    Given clients exist:
      | id | firstName   | lastName  |
      | 1  | Adrienne    | REAULT    |
      | 2  | Roger       | MAILLOUX  |
      | 3  | Fleur       | LANTEIGNE |
    Given guitars exist:
      | id | model             | brand   | color          | price | code_currency |
      | 1  | KH White Zombie   | ESP LTD | BLK WZ Graphic | 1500  | EUR           |
      | 2  | Custom 24         | PRS     | Sunburst       | 699   | EUR           |
      | 3  | KH Demonology     | ESP LTD | BLK Graphic    | 1189  | EUR           |

  Scenario Outline: guitar available
    Given I'm authenticated as "<first_name_client>"
    And "<guitar_model>" is in number of "<stock_before>" in the stock
    When I try to order a "<guitar_model>" which is "<availability>"
    Then the order is register
    And the "<guitar_model>" is now in number of "<stock_after>" in the stock
    Examples:
      | first_name_client | guitar_model    | stock_before | availability | stock_after |
      | Fleur             | Custom 24       | 10           | true         | 9           |
      | Fleur             | KH Demonology   | 4            | true         | 3           |
      | Roger             | KH White Zombie | 6            | true         | 5           |
      | Adrienne          | Custom 24       | 9            | true         | 8           |