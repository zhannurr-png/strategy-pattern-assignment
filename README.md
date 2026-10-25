# Strategy Pattern Calculator
Zhannur Bakyt SE-2524
## Overview

This project demonstrates the Strategy Design Pattern in Java by implementing a simple calculator with interchangeable arithmetic operations.

Instead of using conditional statements to select an operation, the calculator delegates calculations to a strategy through a common interface. The active strategy can be changed at runtime without modifying the `Calculator` class.

## Features

- Addition
- Subtraction
- Multiplication
- Division

## Project Structure

```text
strategy-pattern-assignment/
|-- src/
|   |-- CalculationStrategy.java
|   |-- AddStrategy.java
|   |-- SubtractStrategy.java
|   |-- MultiplyStrategy.java
|   |-- DivideStrategy.java
|   |-- Calculator.java
|   |-- Main.java
|-- README.md
└-- report.md
```

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Open `src/Main.java`.
4. Run the `main()` method.

## Example Output

With the input values currently used in `Main.java`, the output is:

```text
Addition: 20.0
Subtraction: 12.0
Multiplication: 160.0
Division: 9.0
```

The output depends on the input values in `Main.java`. Division by zero is handled by `DivideStrategy`.

## Runtime Strategy Switching

The calculator is initialized with an addition strategy:

```java
Calculator calculator = new Calculator(new AddStrategy());
```

The active strategy can then be changed:

```java
calculator.setStrategy(new SubtractStrategy());
calculator.setStrategy(new MultiplyStrategy());
calculator.setStrategy(new DivideStrategy());
```

The `Calculator` class does not need to know how each operation is implemented. It simply calls `execute()` on the active strategy.

## How to Add a New Strategy

For example, a power operation can be added without modifying the existing `Calculator` class.

**Step 1. Create `PowerStrategy.java`.**

```java
public class PowerStrategy implements CalculationStrategy {

    @Override
    public double execute(double a, double b) {
        return Math.pow(a, b);
    }
}
```

**Step 2. Select the new strategy in `Main.java`.**

```java
calculator.setStrategy(new PowerStrategy());
System.out.println("Power: " + calculator.calculate(2, 3));
```

Output:

```text
Power: 8.0
```

The new operation reuses the existing `CalculationStrategy` interface. So no changes to `Calculator` or the existing strategy classes are required.