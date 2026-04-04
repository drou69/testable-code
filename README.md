# This repo is dedicated to testability

## The package "hardtotest" contains a few Anti Patterns that reduce Code Testability:
| Anti Pattern                         | Class |
|--------------------------------------| --- |
| Work in constructor                  | hardtotest.ConnectionManagerTest |
| Deep Coupling (Demeter Law)          | hardtotest.CustomerOrderTest |
| Mixing new with logic                | hardtotest.OrderProcessorTest |
| Static                               | hardtotest.PriceManagerTest |
| Static Initialization                | hardtotest.MeatManagerTest |
| Final in Method and Class            | hardtotest.OrderServiceTest |
| Deep Inheritence                     | hardtotest.RussianDollsTest |

## The package "fragility.maintenance" contains a few Anti Patterns that increase Test Fragility to change:
| Anti Pattern                         | Class |
|--------------------------------------| --- |
| Reflection                           | fragility.maintenance.reflection.InvoiceServiceTest |
| Mock                                 | fragility.maintenance.mock.OrderServiceTest |
| CircularReasoning                    | fragility.maintenance.circularreasoning.LoyaltyServiceTest |
| Tests Leaks Into Prod Code           | fragility.maintenance.testleaksintoprodcode.OrderServiceTest |
| Using Concrete Types                 | fragility.maintenance.usingconcretetypes.ReportGeneratorTest |
| Wrong Level of Abstraction           | fragility.maintenance.wronglevelofabstraction.TagServiceTest |

## The package "fragility.idempotency" contains a few Anti Patterns that increase Test Fragility in failling for the wrong reasons:
| Fragility                            | Class |
|--------------------------------------| --- |
| Global State                         | fragility.idempotency.PayementManagerTest |
| Random                               | fragility.idempotency.OrderServiceTest |
| Time                                 | fragility.idempotency.LoyaltyServiceTest |
| Precision                            | fragility.idempotency.precision.CalculatorTest |
| Order                                | fragility.idempotency.order.UrgencyManagerTest |
| Locale                               | fragility.idempotency.locale.PriceFormatterTest |

## The package "builders" contains a test with a long and heavy Arrange phase:
| Anti Pattern                         | Class |
|--------------------------------------| --- |
| Long and heavy Arrange phase         | builders.CheckoutServiceTest |

## The package "doubles" shows how to use Test Doubles:
| Test Double                          | Class |
|--------------------------------------| --- |
| Dummy                                | doubles.dummy.OrderServiceTest |
| Fake                                 | doubles.fake.InventoryServiceTest |
| Stub                                 | doubles.stub.DiscountServiceTest |
| Spy                                  | doubles.spy.NotificationServiceTest |
| Mock                                 | doubles.mock.FraudCheckerTest |
