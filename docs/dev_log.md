# Developer Log - Train Consist Management App

A journal documenting the progressive implementation, design decisions, and learnings across Use Cases UC1 to UC20.

## June 1, 2026: Foundation & Basic Class Design (UC1 - UC4)

Today, we focused on setting up the foundation of the Train Consist Management application. Key accomplishments:
- **UC1 & UC2**: Designed the core domain objects (`Bogie`, `Engine`, and `Train`).
- **UC3**: Utilized constructors to initialize bogies with unique IDs and properties.
- **UC4**: Enforced encapsulation by making fields private and exposing them through getters/setters.

## June 2, 2026: Inheritance & Polymorphism (UC5 - UC6)

Extended the base bogie design to support specialized behaviors:
- **UC5**: Introduced `PassengerBogie` and `GoodsBogie` subclasses extending the base `Bogie` class.
- **UC6**: Implemented polymorphism by overriding `toString()` and custom display methods, allowing the train consist to render different bogie types dynamically.
