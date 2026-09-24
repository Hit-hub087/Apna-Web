# Apna-Web

A Java learning repository with standalone examples for arrays/subarrays and constructor usage.

## Project structure

```text
src/main/java/com/apnaweb/
├── Main.java
├── arrays/
│   ├── BinarySearch.java
│   ├── BinomialCoefficient.java
│   ├── JaggedArray.java
│   ├── KadaneAlgorithm.java
│   ├── LargestAndSmallestNumber.java
│   ├── LinearSearch.java
│   ├── MaximumSubarrayBruteForce.java
│   ├── MaximumSubarrayPrefixSum.java
│   ├── PairArray.java
│   ├── Patterns.java
│   └── Subarray.java
└── constructors/
    ├── ConstructorOverloading.java
    └── ParameterizedConstructor.java
```

## Prerequisites

- Java 17+
- Maven 3.8+ (optional but recommended)

## Compile

With Maven:

```bash
mvn clean compile
```

Without Maven:

```bash
mkdir -p out
javac -d out $(find src/main/java -name "*.java")
```

## Run examples

Run the main class:

```bash
java -cp target/classes com.apnaweb.Main
```

Run individual examples:

```bash
java -cp target/classes com.apnaweb.arrays.BinarySearch
java -cp target/classes com.apnaweb.arrays.KadaneAlgorithm
java -cp target/classes com.apnaweb.constructors.UseParacons
```
