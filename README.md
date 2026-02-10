# Java Full Stack Development - Learning Journey

## About
This repository tracks my progress learning Java Full Stack Development with Codegnan IT Solutions.

## Package Structure
All programs use `com.codegnan` as the base package following industry standards.

## Week 1: Java Basics
- Day 1: Environment Setup, I/O Operations, Git Basics
  - HelloWorld.java - First Java program
  - PersonalBioApp.java - CLI biographical data collector
- Day 2: Variables, Operators
  - Calculator.java - Basic arithmetic operations
- Day 3: Control Structures
  - EligibilityChecker.java - Age-based eligibility

## How to Compile and Run
```bash
# Navigate to src directory
cd src

# Compile
javac com/java/Fundamentals/HelloWorld.java

# Run
java com.codegnan.day1.HelloWorld


### 3.11 Git Best Practices for Java Development

**1. Commit Frequently**
```bash
# ✅ Good: Logical, small commits
git commit -m "Add Scanner input handling"
git commit -m "Fix buffer issue in age input"
git commit -m "Add formatted output display"

# ❌ Bad: One huge commit
git commit -m "Completed entire PersonalBioApp"
