# This repo is dedicated to testability

## The package "antipatterns" contains a few Anti Patterns that reduce Code Testability:
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
