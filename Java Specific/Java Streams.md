
# Java Streams - Complete Guide

## Overview

The **Stream API** in Java (introduced in **Java 8**) provides a functional approach to processing collections and sequences of data.

- Operates on **data pipelines**.
    
- Allows **declarative style** of programming (like SQL).
    
- Supports **filter-map-reduce** transformations.
    
- Does **not store data**; it processes data from sources (collections, arrays, I/O channels, etc.).
    

```java
import java.util.*;
import java.util.stream.*;
```

---

## Stream API Hierarchy

```
java.util.stream
    ↓
  BaseStream<T, S extends BaseStream<T, S>>
       ↓
   Stream<T>      (Object stream)
   IntStream      (Primitive int stream)
   LongStream     (Primitive long stream)
   DoubleStream   (Primitive double stream)
```

---

## Creating Streams

### 1. From Collections

```java
List<String> list = Arrays.asList("A", "B", "C");
Stream<String> stream = list.stream();
Stream<String> parallelStream = list.parallelStream();
```

### 2. From Arrays

```java
String[] arr = {"X", "Y", "Z"};
Stream<String> arrStream = Arrays.stream(arr);
```

### 3. Using `Stream.of()`

```java
Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
```

### 4. Infinite Streams

```java
Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2);
Stream<Double> randoms = Stream.generate(Math::random);
```

---

## Stream Operations

Streams have **two types of operations**:

1. **Intermediate Operations** (return Stream → lazy)
    
2. **Terminal Operations** (consume Stream → produce result)
    

---

### 1. Intermediate Operations

#### `filter(Predicate)`

Keeps elements that satisfy a condition.

```java
List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
nums.stream()
    .filter(n -> n % 2 == 0)
    .forEach(System.out::println); // 2, 4
```

#### `map(Function)`

Transforms elements.

```java
List<String> words = Arrays.asList("java", "stream");
words.stream()
     .map(String::toUpperCase)
     .forEach(System.out::println); // JAVA, STREAM
```

#### `flatMap(Function)`

Flattens nested structures.

```java
List<List<String>> nested = Arrays.asList(
    Arrays.asList("A", "B"),
    Arrays.asList("C", "D")
);

nested.stream()
      .flatMap(List::stream)
      .forEach(System.out::println); // A B C D
```

#### `distinct()`

Removes duplicates.

```java
Stream.of(1, 2, 2, 3)
      .distinct()
      .forEach(System.out::println); // 1, 2, 3
```

#### `sorted()`

Sorts elements.

```java
Stream.of(3, 1, 2)
      .sorted()
      .forEach(System.out::println); // 1, 2, 3
```

#### `limit(n)` and `skip(n)`

Restrict stream size.

```java
Stream.of(1, 2, 3, 4, 5)
      .skip(2)
      .limit(2)
      .forEach(System.out::println); // 3, 4
```

---

### 2. Terminal Operations

#### `forEach(Consumer)`

Iterates and consumes.

```java
nums.stream().forEach(System.out::println);
```

#### `collect(Collector)`

Collects into collections.

```java
List<Integer> evens = nums.stream()
                          .filter(n -> n % 2 == 0)
                          .collect(Collectors.toList());
```

#### `toArray()`

```java
Integer[] arr = nums.stream().toArray(Integer[]::new);
```

#### `reduce()`

Combines elements into one.

```java
int sum = nums.stream().reduce(0, Integer::sum); // 15
```

#### `count()`

```java
long cnt = nums.stream().count(); // 5
```

#### `min()` / `max()`

```java
Optional<Integer> min = nums.stream().min(Integer::compareTo);
Optional<Integer> max = nums.stream().max(Integer::compareTo);
```

#### `anyMatch()`, `allMatch()`, `noneMatch()`

```java
boolean anyEven = nums.stream().anyMatch(n -> n % 2 == 0); // true
boolean allEven = nums.stream().allMatch(n -> n % 2 == 0); // false
boolean noneNeg = nums.stream().noneMatch(n -> n < 0);     // true
```

#### `findFirst()` / `findAny()`

```java
Optional<Integer> first = nums.stream().findFirst();
```

---

## Primitive Streams

- **IntStream, LongStream, DoubleStream** → Avoid boxing/unboxing overhead.
    

```java
IntStream.range(1, 5).forEach(System.out::println); // 1,2,3,4
IntStream.of(1, 2, 3).sum(); // 6
```

---

## Parallel Streams

Streams can execute in parallel using `parallelStream()`.

```java
List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
int sum = list.parallelStream()
              .mapToInt(Integer::intValue)
              .sum();
System.out.println(sum); // 36
```

⚠️ Use carefully – parallelism overhead may slow down small tasks.

---

## Collectors Utility

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// To List
List<String> upper = names.stream()
                          .map(String::toUpperCase)
                          .collect(Collectors.toList());

// To Set
Set<String> set = names.stream()
                       .collect(Collectors.toSet());

// Joining
String joined = names.stream()
                     .collect(Collectors.joining(", ")); // "Alice, Bob, Charlie"

// Grouping
Map<Integer, List<String>> grouped = names.stream()
    .collect(Collectors.groupingBy(String::length));

// Partitioning
Map<Boolean, List<String>> partitioned = names.stream()
    .collect(Collectors.partitioningBy(s -> s.length() > 3));
```

---

## Performance Characteristics

|Operation|Time Complexity|Notes|
|---|---|---|
|`filter`|O(n)|Predicate test on each element|
|`map`|O(n)|Transform each element|
|`reduce`|O(n)|Depends on accumulator|
|`sorted`|O(n log n)|Sorting required|
|`distinct`|O(n) ~ O(n log n)|HashSet/TreeSet used internally|
|`forEach`|O(n)|Terminal traversal|

---

## Stream vs Collection

|Aspect|Collection|Stream|
|---|---|---|
|Storage|Stores elements|No storage (views)|
|Traversal|Multiple|One-time|
|Evaluation|Eager|Lazy|
|Mutability|Can modify|Immutable|
|Parallelism|Manual threads|Built-in parallel support|

---

## Use Cases

### 1. Filtering and Transformation

```java
List<String> names = Arrays.asList("apple", "banana", "cherry");
names.stream()
     .filter(s -> s.startsWith("b"))
     .map(String::toUpperCase)
     .forEach(System.out::println); // BANANA
```

### 2. Word Frequency Count

```java
String text = "java stream api java functional programming";
Map<String, Long> freq = Arrays.stream(text.split(" "))
    .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

System.out.println(freq);
// {java=2, stream=1, api=1, functional=1, programming=1}
```

### 3. Top N Elements

```java
List<Integer> top3 = nums.stream()
    .sorted(Comparator.reverseOrder())
    .limit(3)
    .collect(Collectors.toList());
```

### 4. Statistical Operations

```java
IntSummaryStatistics stats = IntStream.of(1, 2, 3, 4, 5).summaryStatistics();
System.out.println(stats.getAverage()); // 3.0
System.out.println(stats.getMax());     // 5
```

---

## Best Practices

1. **Use method references** (`Class::method`) where possible.
    
2. **Avoid stateful operations** inside streams (can cause bugs in parallel).
    
3. **Prefer primitive streams** (`IntStream`, etc.) for performance.
    
4. **Use collectors effectively** for grouping/partitioning.
    
5. **Don’t reuse streams** — create a new stream when needed.
    

---

## Summary

- **Streams** provide a **functional, lazy, pipeline-based** approach for data processing.
    
- Support **filter-map-reduce**, transformations, and collectors.
    
- **Intermediate operations** → return stream, lazy.
    
- **Terminal operations** → consume stream, produce result.
    
- For performance-critical apps, use **primitive streams** and **parallel streams** wisely.
    

---
