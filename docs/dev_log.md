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

## June 11, 2026: Bogie Specialization & Capacity Tracking (UC7 - UC9)

Designed specific bogie categories and tracking mechanisms:
- **UC7**: Created passenger subclasses (`Sleeper`, `ACChair`, `FirstClass`).
- **UC8**: Created goods subclasses (`Rectangular`, `Cylindrical`).
- **UC9**: Implemented capacity tracking to manage and monitor seats/cargo volume within each bogie.

## June 12, 2026: Constraints, Checked Exceptions & Validations (UC10 - UC14)

Focused on application robustness and input integrity:
- **UC10 & UC11**: Added cargo assignment to goods bogies with strict safety constraints (e.g., hazardous cargo rules).
- **UC12**: Introduced checked exception handling for data verification.
- **UC13 & UC14**: Implemented strict validation logic in constructors to prevent the instantiation of invalid bogie objects.

## June 13, 2026: Runtime Exceptions & Sorting (UC15 - UC17)

Refined exception strategies and implemented sorting algorithms:
- **UC15**: Created custom runtime exception `CargoSafetyException` to handle unsafe operations dynamically.
- **UC16**: Implemented a manual Bubble Sort algorithm to sort passenger bogies by capacity.
- **UC17**: Used `Arrays.sort()` with custom sorters (`BogieNameSorter`, `PassengerBogieSorter`) for optimized sorting.
