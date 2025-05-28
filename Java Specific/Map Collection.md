
# Java Collections Map Interface - Detailed Notes

## Overview

The Map interface in Java represents a collection of key-value pairs where each key is unique. It's part of the Java Collections Framework and provides a way to store and retrieve data based on unique identifiers (keys).

## Key Characteristics

- **Key-Value Pairs**: Each entry consists of a unique key and its associated value
- **No Duplicate Keys**: Keys must be unique, but values can be duplicated
- **Null Handling**: Depends on the implementation (HashMap allows one null key, TreeMap doesn't)
- **Not a Collection**: Map doesn't extend the Collection interface directly

## Common Map Implementations

### HashMap

- **Hash table based implementation**
- **O(1) average time complexity** for basic operations
- **Allows one null key and multiple null values**
- **Not synchronized** (not thread-safe)

```java
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Adding elements
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);
        hashMap.put("orange", 15);
        hashMap.put(null, 5); // null key allowed
        
        System.out.println("HashMap: " + hashMap);
        // Output: HashMap: {null=5, orange=15, banana=20, apple=10}
        
        // Accessing elements
        System.out.println("Value for 'apple': " + hashMap.get("apple"));
        
        // Check if key exists
        if (hashMap.containsKey("banana")) {
            System.out.println("Banana count: " + hashMap.get("banana"));
        }
    }
}
```

### LinkedHashMap

- **Maintains insertion order**
- **Hash table + doubly-linked list implementation**
- **Slightly slower than HashMap** due to maintaining order

```java
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        
        linkedHashMap.put("first", "One");
        linkedHashMap.put("second", "Two");
        linkedHashMap.put("third", "Three");
        
        // Maintains insertion order
        System.out.println("LinkedHashMap: " + linkedHashMap);
        // Output: LinkedHashMap: {first=One, second=Two, third=Three}
        
        // Iterating maintains order
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
```

### TreeMap

- **Red-Black tree implementation**
- **Sorted by keys** (natural ordering or custom comparator)
- **O(log n) time complexity** for basic operations
- **No null keys allowed**

```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Double> treeMap = new TreeMap<>();
        
        treeMap.put("zebra", 95.5);
        treeMap.put("apple", 85.0);
        treeMap.put("mango", 90.5);
        treeMap.put("banana", 88.0);
        
        // Automatically sorted by keys
        System.out.println("TreeMap: " + treeMap);
        // Output: TreeMap: {apple=85.0, banana=88.0, mango=90.5, zebra=95.5}
        
        // TreeMap specific methods
        System.out.println("First key: " + ((TreeMap<String, Double>) treeMap).firstKey());
        System.out.println("Last key: " + ((TreeMap<String, Double>) treeMap).lastKey());
    }
}
```

## Essential Map Methods

```java
import java.util.*;

public class MapMethodsExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        
        // Basic operations
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        // Get value by key
        String value = map.get(2);
        System.out.println("Value for key 2: " + value);
        
        // Check if key/value exists
        boolean hasKey = map.containsKey(3);
        boolean hasValue = map.containsValue("Two");
        System.out.println("Contains key 3: " + hasKey);
        System.out.println("Contains value 'Two': " + hasValue);
        
        // Remove element
        String removed = map.remove(1);
        System.out.println("Removed: " + removed);
        
        // Size and empty check
        System.out.println("Size: " + map.size());
        System.out.println("Is empty: " + map.isEmpty());
        
        // Replace methods (Java 8+)
        map.replace(2, "TWO");
        map.putIfAbsent(4, "Four");
        
        System.out.println("Final map: " + map);
    }
}
```

## Iteration Techniques

```java
import java.util.*;

public class MapIterationExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 25);
        map.put("Python", 30);
        map.put("JavaScript", 28);
        
        // Method 1: Enhanced for loop with entrySet()
        System.out.println("Method 1 - Entry Set:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        // Method 2: Iterate over keys
        System.out.println("\nMethod 2 - Key Set:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        
        // Method 3: Iterate over values
        System.out.println("\nMethod 3 - Values:");
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }
        
        // Method 4: Using forEach (Java 8+)
        System.out.println("\nMethod 4 - forEach:");
        map.forEach((key, value) -> 
            System.out.println(key + " => " + value));
        
        // Method 5: Using Streams (Java 8+)
        System.out.println("\nMethod 5 - Streams:");
        map.entrySet().stream()
           .filter(entry -> entry.getValue() > 27)
           .forEach(entry -> 
               System.out.println(entry.getKey() + " has " + entry.getValue() + " years"));
    }
}
```

## Advanced Map Operations (Java 8+)

```java
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AdvancedMapOperations {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 92);
        scores.put("Charlie", 78);
        
        // compute() - compute value for a key
        scores.compute("Alice", (key, val) -> val == null ? 1 : val + 10);
        System.out.println("After compute: " + scores);
        
        // computeIfAbsent() - compute if key is absent
        scores.computeIfAbsent("David", key -> 80);
        System.out.println("After computeIfAbsent: " + scores);
        
        // computeIfPresent() - compute if key is present
        scores.computeIfPresent("Bob", (key, val) -> val + 5);
        System.out.println("After computeIfPresent: " + scores);
        
        // merge() - merge values
        Map<String, Integer> newScores = Map.of("Alice", 15, "Eve", 88);
        newScores.forEach((key, value) -> 
            scores.merge(key, value, Integer::sum));
        System.out.println("After merge: " + scores);
        
        // getOrDefault() - return default if key not found
        int defaultScore = scores.getOrDefault("Frank", 0);
        System.out.println("Frank's score (default): " + defaultScore);
    }
}
```

## Practical Example: Word Frequency Counter

```java
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "java is powerful java is versatile java programming is fun";
        String[] words = text.toLowerCase().split("\\s+");
        
        // Method 1: Traditional approach
        Map<String, Integer> frequency1 = new HashMap<>();
        for (String word : words) {
            frequency1.put(word, frequency1.getOrDefault(word, 0) + 1);
        }
        
        // Method 2: Using merge()
        Map<String, Integer> frequency2 = new HashMap<>();
        for (String word : words) {
            frequency2.merge(word, 1, Integer::sum);
        }
        
        // Method 3: Using streams
        Map<String, Long> frequency3 = Arrays.stream(words)
            .collect(Collectors.groupingBy(
                Function.identity(), 
                Collectors.counting()
            ));
        
        System.out.println("Word frequencies: " + frequency1);
        
        // Find most frequent word
        String mostFrequent = frequency1.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("No words found");
        
        System.out.println("Most frequent word: " + mostFrequent);
    }
}
```

## Map Performance Comparison

|Operation|HashMap|LinkedHashMap|TreeMap|
|---|---|---|---|
|get()|O(1)|O(1)|O(log n)|
|put()|O(1)|O(1)|O(log n)|
|remove()|O(1)|O(1)|O(log n)|
|Ordering|No|Insertion|Sorted|
|Null keys|1 allowed|1 allowed|Not allowed|

## Best Practices

1. **Choose the right implementation**:
    
    - Use HashMap for general-purpose mapping
    - Use LinkedHashMap when insertion order matters
    - Use TreeMap when sorted order is required
2. **Initialize with appropriate capacity**:
    

```java
// Better performance for known size
Map<String, Integer> map = new HashMap<>(16);
```

3. **Use proper equals() and hashCode()** for custom key objects:

```java
public class Person {
    private String name;
    private int age;
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
```

4. **Handle null values safely**:

```java
// Safe way to handle potential null values
String value = map.getOrDefault(key, "default");
```

Maps are fundamental data structures in Java that provide efficient key-based data access and are essential for many algorithms and applications. Understanding their different implementations and when to use each one is crucial for writing efficient Java programs.