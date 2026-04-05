# This repo is dedicated to testability

## The package "hardtotest" contains a few Anti Patterns that reduce Code Testability:
| Anti Pattern                         | Class |
|--------------------------------------| --- |
| Mixing new with logic                | exercice1.OrderProcessorTest |
| Work in constructor                  | exercice2.ConnectionManagerTest |
| Static Initialization                | exercice3.MeatManagerTest |
| Static calls                         | exercice4.PriceManagerTest |
| Final on Methods and Classes         | exercice5.OrderServiceTest |
| Deep Coupling (Demeter Law)          | exercice6.CartManagerTest |
| Deep Inheritence                     | exercice7.RussianDollsTest |

## The package "fragility.maintenance" contains a few Anti Patterns that increase Test Fragility to change:
| Anti Pattern                         | Class |
|--------------------------------------| --- |
| Reflection                           | reflection.InvoiceServiceTest |
| Mock                                 | mock.OrderServiceTest |
| CircularReasoning                    | circularreasoning.LoyaltyServiceTest |
| Tests Leaks Into Prod Code           | testleaksintoprodcode.WineManagerTest |
| Using Concrete Types                 | usingconcretetypes.ReportGeneratorTest |
| Wrong Level of Abstraction           | wronglevelofabstraction.TagServiceTest |

## The package "fragility.idempotency" contains a few Anti Patterns that increase Test Fragility in failling for the wrong reasons:
| Fragility                            | Class |
|--------------------------------------| --- |
| Global State                         | globalstate.PayementManagerTest |
| Random                               | random.BingoMachineTest |
| Time                                 | time.UserCreatorTest |
| Precision                            | precision.CalculatorTest |
| Order                                | order.UrgencyManagerTest |
| Locale                               | locale.PriceFormatterTest |

## The package "builders" contains a test with a long and heavy Arrange phase:
| Anti Pattern                         | Class |
|--------------------------------------| --- |
| Long and heavy Arrange phase         | CheckoutServiceTest |

## The package "doubles" shows how to use Test Doubles:
| Test Double                          | Class |
|--------------------------------------| --- |
| Dummy                                | dummy.OrderServiceTest |
| Fake                                 | fake.InventoryServiceTest |
| Stub                                 | stub.DiscountServiceTest |
| Spy                                  | spy.NotificationServiceTest |
| Mock                                 | mock.FraudCheckerTest |

## The package "sociable" shows the power of sociable testing:
| Anti Pattern                                 | Class |
|----------------------------------------------| --- |
| Bad things can happen when we mock a friend  | OrderServiceTest |
