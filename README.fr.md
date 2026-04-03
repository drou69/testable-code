# Ce dépôt de code est dédié à la testabilité du code

## Le package "hardtotest" contient quelques mauvaises pratiques qui réduisent la testabilité:
| Mauvaise Pratique                                         | Classe                           |
|-----------------------------------------------------------|----------------------------------|
| Work in constructor                                       | hardtotest.ConnectionManagerTest |
| Deep Coupling (Demeter Law)                               | hardtotest.CustomerOrderTest     |
| Mixing new with logic                                     | hardtotest.OrderProcessorTest    |
| Static                                                    | hardtotest.PriceManagerTest      |
| Static Initialization                                     | hardtotest.MeatManagerTest       |
| Final in Method and Class                                 | hardtotest.OrderServiceTest      |
| Deep Inheritence                                          | hardtotest.RussianDollsTest      |
| Non Deterministic                                         | hardtotest.UserCreatorTest       |

## Le package "fragility.maintenance" contient quelques mauvaises pratiques qui augmente la fragilité des tests aux changements:
| Mauvaise Pratique             | Classe                                                       |
|-------------------------------|--------------------------------------------------------------|
| Reflection                    | fragility.maintenance.reflection.InvoiceServiceTest          |
| Mock                          | fragility.maintenance.mock.OrderServiceTest                  |
| CircularReasoning             | fragility.maintenance.circularreasoning.LoyaltyServiceTest   |
| Tests Leaks Into Prod Code    | fragility.maintenance.testleaksintoprodcode.OrderServiceTest |
| Using Concrete Types          | fragility.maintenance.usingconcretetypes.ReportGeneratorTest |
| Wrong Level of Abstraction    | fragility.maintenance.wronglevelofabstraction.TagServiceTest |

## Le package "fragility.idempotency" contient quelques mauvaises pratiques qui rendent les tests fragiles à l'échec pour de mauvaises raisons:
| Fragilité                                  | Classe                                          |
|--------------------------------------------|-------------------------------------------------|
| Global State                               | fragility.idempotency.PayementManagerTest       |
| Random                                     | fragility.idempotency.OrderServiceTest          |
| Time                                       | fragility.idempotency.LoyaltyServiceTest        |
| Precision                                  | fragility.idempotency.precision.CalculatorTest  |
| Order                                      | fragility.idempotency.order.UrgencyManagerTest  |
| Locale                                     | fragility.idempotency.locale.PriceFormatterTest |

## Le package "builders" contient un test avec une mise en place longue et fastidieuse:
| Mauvaise Pratique                                             | Classe                       |
|---------------------------------------------------------------|------------------------------|
| Long and heavy Arrange phase                                  | builders.CheckoutServiceTest |

## Le package "doubles" montre comment utilisé à bon escient les doublûres de tests:
| Doublûre de tests | Classe                              |
|-------------------|-------------------------------------|
| Dummy             | doubles.dummy.OrderServiceTest      |
| Fake              | doubles.fake.InventoryServiceTest   |
| Stub              | doubles.stub.DiscountServiceTest    |
| Spy               | doubles.spy.NotificationServiceTest |
| Mock              | doubles.mock.FraudCheckerTest       |
