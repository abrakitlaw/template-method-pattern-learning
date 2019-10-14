# Template Method Pattern
Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain
steps of an algorithm without changing of algorithm's structure.

Problem: Two different components have significant similarities, but demonstrate no reuse of common interface or implementation. If a change
common to both components become necessary, duplicate effort must be expanded.

![Template Method Pattern](/src/image/template-method-pattern.png)

## Hollywood Principle - Don't call us, we'll call you.
With the Hollywood Principle, we allow low-level components to hook themselves into a system,
but the high level components determine when they are needed, and how.
In other words, the high level components give the low-level components a "don't call us, we'll call you" treatment.

![Hollywood Principle](/src/image/hollywood-principle.png)
