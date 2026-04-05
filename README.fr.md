# Ce dépôt de code est dédié à la testabilité du code

## Le package "hardtotest" contient quelques mauvaises pratiques qui réduisent la testabilité:
| Mauvaise Pratique                            | Classe                           |
|----------------------------------------------|----------------------------------|
| Mélanger logique d'affaire et instantiation  | exercice1.OrderProcessorTest |
| Logique dans le constructeur                 | exercice2.ConnectionManagerTest |
| Initialisation statique                      | exercice3.MeatManagerTest |
| Appel static                                 | exercice4.PriceManagerTest |
| Classe et méthode finales                    | exercice5.OrderServiceTest |
| Couplage profond (Loie de Demeter)           | exercice6.CartManagerTest |
| Héritage profond                             | exercice7.RussianDollsTest |

## Le package "fragility.maintenance" contient quelques mauvaises pratiques qui augmente la fragilité des tests aux changements:
| Mauvaise Pratique                             | Classe                                                       |
|-----------------------------------------------|--------------------------------------------------------------|
| Reflection                                    | reflection.InvoiceServiceTest |
| Mock                                          | mock.OrderServiceTest |
| CircularReasoning                             | circularreasoning.LoyaltyServiceTest |
| Le code de test déborde dans le code de prod  | testleaksintoprodcode.WineManagerTest |
| Utilisation de types concrets                 | usingconcretetypes.ReportGeneratorTest |
| Mauvais niveau d'abstraction                  | wronglevelofabstraction.TagServiceTest |

## Le package "fragility.idempotency" contient quelques mauvaises pratiques qui rendent les tests fragiles à l'échec pour de mauvaises raisons:
| Fragilité                            | Classe                                          |
|--------------------------------------|-------------------------------------------------|
| État global                          | globalstate.PayementManagerTest |
| Aléatoire                            | random.BingoMachineTest |
| Temps                                | time.UserCreatorTest |
| Précision                            | precision.CalculatorTest |
| Ordre                                | order.UrgencyManagerTest |
| Localisation                         | locale.PriceFormatterTest |

## Le package "builders" contient un test avec une mise en place longue et fastidieuse:
| Mauvaise Pratique                                             | Classe                       |
|---------------------------------------------------------------|------------------------------|
| Mise en place longue et fastidieuse                           | builders.CheckoutServiceTest |

## Le package "doubles" montre comment utilisé à bon escient les doublûres de tests:
| Doublûre de tests | Classe                              |
|-------------------|-------------------------------------|
| Dummy             | doubles.dummy.OrderServiceTest      |
| Fake              | doubles.fake.InventoryServiceTest   |
| Stub              | doubles.stub.DiscountServiceTest    |
| Spy               | doubles.spy.NotificationServiceTest |
| Mock              | doubles.mock.FraudCheckerTest       |

## The package "sociable" shows the power of sociable testing:
| Mauvaise Pratique                                        | Class |
|----------------------------------------------------------| --- |
| De mauvaise choses peuvent arriver quand on mock un ami  | OrderServiceTest |
