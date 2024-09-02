Simple Extensible Calculator
Overview
This project is a simple, extensible calculator implemented in Java using Spring Boot. The calculator supports basic operations such as addition, subtraction, multiplication, and division. The design adheres to key object-oriented principles, especially the Open-Closed Principle, making it easy to extend the calculator with new operations without modifying existing code.

Features
Basic Operations: Supports addition, subtraction, multiplication, and division.
Chaining Operations: Allows chaining multiple operations on a single value.
Extensibility: New operations can be added by simply implementing an interface and registering the new operation in the application context.
IoC Compatibility: Designed to work seamlessly with Spring Boot's Inversion of Control (IoC) container.
Graceful Error Handling: Handles unsupported operations and invalid inputs gracefully.