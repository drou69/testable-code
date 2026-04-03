# This repo is dedicated to testability

## The package "hard_to_test" contains a few Anti Patterns that reduce Code Testability:
| Anti Pattern                         | Class |
|--------------------------------------| --- |
| Work in constructor                  | ConnectionManager |
| Deep Coupling (Demeter Law)          | CustomerOrder |
| Mixing new with logic                | OrderProcessor |
| Singleton Pattern                    | PayementManager |
| Global State                         | PayementManagerWithState |
| Static                               | PriceManager |
| Final in Method and Class            | OrderService |
| Deep Inheritence                     | RussianDolls |
| Non Deterministic                    | UserCreator |

## The package "fragility" contains a few Anti Patterns that increase test fragility to change:
| Anti Pattern                         | Class |
|--------------------------------------| --- |
| Reflection                           | InvoiceServiceTest |
| Mock                                 | mock.OrderServiceTest |
| CircularReasoning                    | LoyaltyServiceTest |
| Tell Don't Ask                       | telldontask.OrderServiceTest |
| Using Concrete Types                 | ReportGeneratorTest |
| Wrong Level of Abstraction           | TagServiceTest |
