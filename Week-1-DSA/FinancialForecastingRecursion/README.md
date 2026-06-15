# Financial Forecasting using Recursion

## Objective
To build a simple financial forecasting tool using recursion that predicts future value based on an initial amount and a constant growth rate.

---

## Concept of Recursion
Recursion is a programming technique where a function calls itself to solve smaller instances of the same problem.

It helps simplify problems that can be broken down into repetitive subproblems.

---

## Problem Approach

We calculate future value using the formula:

Future Value = Previous Value × (1 + Growth Rate)

Instead of using loops, we apply recursion:

- Base Case: When years = 0, return initial value
- Recursive Case: Call function for (years - 1) and apply growth rate

---

## Algorithm

1. Start with initial value, growth rate, and number of years
2. If years == 0, return initial value
3. Else, recursively calculate previous year's value
4. Multiply it by (1 + growth rate)
5. Return final computed value

---

## Time Complexity
- Time Complexity: O(n)
  (one function call per year)

- Space Complexity: O(n)
  (due to recursive call stack)

---

## Optimization Note
This recursive solution recalculates values for each year.

It can be optimized using:
- Memoization (caching results)
- Iterative approach (loop-based calculation)

---

## Conclusion
Recursion provides a clean and simple way to model financial growth problems, but iterative solutions are more efficient for large inputs.