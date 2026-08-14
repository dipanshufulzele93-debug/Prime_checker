# Test Execution Results

**Date:** 2026-08-14  
**Runtime:** Java SE (JDK 8+)  
**Test Type:** Console Input/Output Verification

---

## 1. PrimeChecker (`src/PrimeChecker.java`)

| Test Case | Input (`num`) | Console Output | Status |
| :--- | :--- | :--- | :--- |
| Zero | `0` | `0 is not a prime number.` | **PASS** |
| Edge case (One) | `1` | `1 is not a prime number.` | **PASS** |
| Smallest Prime | `2` | `2 is a prime number.` | **PASS** |
| Odd Prime | `17` | `17 is a prime number.` | **PASS** |
| Composite Number | `24` | `24 is not a prime number.` | **PASS** |
| Large Prime | `97` | `97 is a prime number.` | **PASS** |

---

## 2. FibonacciGenerator (`src/FibonacciGenerator.java`)

| Test Case | Input (`n`) | Console Output | Status |
| :--- | :--- | :--- | :--- |
| Single term | `1` | `0` | **PASS** |
| Two terms | `2` | `0 1` | **PASS** |
| Five terms | `5` | `0 1 1 2 3` | **PASS** |
| Ten terms | `10` | `0 1 1 2 3 5 8 13 21 34` | **PASS** |