README.md
# MCON 364 – Functional Programming Micro Project
## Smart Data Processing Engine

---

## Overview

In this assignment, you will build a small **functional data processing engine** using modern Java (Java 21).

This micro-project integrates:

- Functional interfaces
  - `Supplier`
  - `Predicate`
  - `Function`
  - `Consumer`
- Lambda expressions
- Functional interface chaining
- `Optional`
- Switch expressions
- Pattern matching for switch (Java 21)
- Generic methods


---

##  Learning Objectives

By completing this assignment, you will be able to:

- Pass behavior as data
- Design reusable generic pipelines
- Chain functional interfaces
- Use `Optional` correctly instead of `null`
- Apply Java 21 pattern matching in switch expressions
- Compose transformations cleanly and safely

---

##  Conceptual Goal

Everything in this project revolves around one idea:

> **Behavior can be injected into a system.**

Instead of hardcoding logic inside loops, we supply rules and transformations as functional parameters.

This is the foundation of:

- Streams
- Modern APIs
- Clean architecture
- Functional-style Java

---

## Part 1 In class exercise:
Implement all the TODO in the FunctionalInterfaceExercises.java file.

## Part 2 Homework:
Implement all the TODOs in the SmartDataEngine.java file.

## Repository Structure

```
func_prog/
├── README.md                                        # This file
├── pom.xml                                          # Maven configuration
├── .gitignore                                       # Git ignore file
└── src/
    ├── main/java/edu/touro/las/mcon364/func_prog/
    │   ├── demo/
    │   │   └── Demo.java                            # Working examples
    │   ├── exercises/
    │   │   └── FunctionalInterfaceExercises.java    # In-class exercises
    │   └── homework/
    │       └── SmartDataEngine.java                 # Homework project
    └── test/java/edu/touro/las/mcon364/func_prog/
        └── homework/
            └── SmartDataEngineTest.java             # Tests for homework
```

