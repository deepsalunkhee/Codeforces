# Java Set Interface - Complete Guide

## 1. Introduction to Set Interface

The Set interface extends the Collection interface and represents a collection that contains **no duplicate elements**. It models the mathematical set abstraction and is one of the core interfaces in Java Collections Framework.

### Key Characteristics:

- **No Duplicates**: Cannot contain duplicate elements
- **At most one null**: Can contain at most one null element
- **Mathematical Set**: Models mathematical set abstraction
- **Unordered**: Most implementations don't guarantee order (except specific ones)

## 2. Set Interface Declaration

```java
public interface Set<E> extends Collection<E> {
    // Inherits all methods from Collection interface
    // Adds no new methods, but refines the contract
    boolean add(E e);           // Returns false if element already exists
    boolean remove(Object o);   // Removes element if present
    boolean contains(Object o); // Checks if element exists
    int size();                 // Returns number of elements
    boolean isEmpty();          // Checks if set is empty
    Iterator<E> iterator();     // Returns iterator
    Object[] toArray();         // Converts to array
}
```

## 3. Set Implementations

### 3.1 HashSet

- **Implementation**: Hash table (HashMap internally)
- **Ordering**: No guaranteed order
- **Performance**: O(1) for basic operations (add, remove, contains)
- **Null Values**: Allows one null element
- **Thread Safety**: Not synchronized

```java
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating HashSet
        Set<String> hashSet = new HashSet<>();
        
        // Adding elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate - won't be added
        hashSet.add(null);    // Null allowed
        
        System.out.println("HashSet: " + hashSet);
        System.out.println("Size: " + hashSet.size());
        
        // Checking if element exists
        System.out.println("Contains Apple: " + hashSet.contains("Apple"));
        System.out.println("Contains Grape: " + hashSet.contains("Grape"));
        
        // Removing element
        hashSet.remove("Banana");
        System.out.println("After removing Banana: " + hashSet);
        
        // Iterating through HashSet
        System.out.println("Iterating through HashSet:");
        for (String fruit : hashSet) {
            System.out.println("- " + fruit);
        }
    }
}
```

**Output:**

```
HashSet: [null, Apple, Orange, Banana]
Size: 4
Contains Apple: true
Contains Grape: false
After removing Banana: [null, Apple, Orange]
Iterating through HashSet:
- null
- Apple
- Orange
```

### 3.2 LinkedHashSet

- **Implementation**: Hash table with linked list
- **Ordering**: Maintains insertion order
- **Performance**: Slightly slower than HashSet due to linked list overhead
- **Null Values**: Allows one null element
- **Thread Safety**: Not synchronized

```java
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        
        // Adding elements
        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(50);
        linkedHashSet.add(20);
        linkedHashSet.add(10); // Duplicate - won't be added
        
        System.out.println("LinkedHashSet: " + linkedHashSet);
        
        // Maintains insertion order
        System.out.println("Insertion order maintained:");
        for (Integer num : linkedHashSet) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Converting to Array
        Integer[] array = linkedHashSet.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(array));
        
        // Bulk operations
        Set<Integer> otherSet = new HashSet<>(Arrays.asList(20, 40, 60));
        linkedHashSet.addAll(otherSet);
        System.out.println("After addAll: " + linkedHashSet);
    }
}
```

**Output:**

```
LinkedHashSet: [30, 10, 50, 20]
Insertion order maintained:
30 10 50 20 
Array: [30, 10, 50, 20]
After addAll: [30, 10, 50, 20, 40, 60]
```

### 3.3 TreeSet

- **Implementation**: Red-Black tree (self-balancing BST)
- **Ordering**: Maintains sorted order (natural or custom)
- **Performance**: O(log n) for basic operations
- **Null Values**: Does not allow null elements
- **Thread Safety**: Not synchronized
- **Requirements**: Elements must be Comparable or provide Comparator

```java
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating TreeSet with natural ordering
        Set<String> treeSet = new TreeSet<>();
        
        treeSet.add("Zebra");
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Banana");
        // treeSet.add(null); // This would throw NullPointerException
        
        System.out.println("TreeSet (natural order): " + treeSet);
        
        // TreeSet with custom comparator
        Set<String> customTreeSet = new TreeSet<>(
            (s1, s2) -> s2.compareTo(s1) // Reverse order
        );
        
        customTreeSet.add("Zebra");
        customTreeSet.add("Apple");
        customTreeSet.add("Mango");
        customTreeSet.add("Banana");
        
        System.out.println("TreeSet (reverse order): " + customTreeSet);
        
        // TreeSet specific methods (casting required)
        TreeSet<Integer> numberSet = new TreeSet<>();
        numberSet.addAll(Arrays.asList(50, 30, 70, 20, 60, 40));
        
        System.out.println("Number TreeSet: " + numberSet);
        System.out.println("First element: " + numberSet.first());
        System.out.println("Last element: " + numberSet.last());
        System.out.println("Lower than 45: " + numberSet.lower(45));
        System.out.println("Higher than 45: " + numberSet.higher(45));
        System.out.println("Floor of 45: " + numberSet.floor(45));
        System.out.println("Ceiling of 45: " + numberSet.ceiling(45));
        
        // SubSet operations
        System.out.println("SubSet (30 to 60): " + numberSet.subSet(30, 60));
        System.out.println("HeadSet (< 50): " + numberSet.headSet(50));
        System.out.println("TailSet (>= 50): " + numberSet.tailSet(50));
    }
}
```

**Output:**

```
TreeSet (natural order): [Apple, Banana, Mango, Zebra]
TreeSet (reverse order): [Zebra, Mango, Banana, Apple]
Number TreeSet: [20, 30, 40, 50, 60, 70]
First element: 20
Last element: 70
Lower than 45: 40
Higher than 45: 50
Floor of 45: 40
Ceiling of 45: 50
SubSet (30 to 60): [30, 40, 50]
HeadSet (< 50): [20, 30, 40]
TailSet (>= 50): [50, 60, 70]
```

## 4. Set Operations

### 4.1 Basic Set Operations

```java
import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(Arrays.asList("C", "D", "E", "F"));
        
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        
        // Union (all elements from both sets)
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);
        
        // Intersection (common elements)
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
        
        // Difference (elements in set1 but not in set2)
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + difference);
        
        // Symmetric Difference (elements in either set but not in both)
        Set<String> symDifference = new HashSet<>(union);
        symDifference.removeAll(intersection);
        System.out.println("Symmetric Difference: " + symDifference);
        
        // Check if subset
        Set<String> subset = new HashSet<>(Arrays.asList("C", "D"));
        System.out.println("Is subset of set1: " + set1.containsAll(subset));
        System.out.println("Is subset of set2: " + set2.containsAll(subset));
    }
}
```

**Output:**

```
Set 1: [A, B, C, D]
Set 2: [C, D, E, F]
Union: [A, B, C, D, E, F]
Intersection: [C, D]
Difference (set1 - set2): [A, B]
Symmetric Difference: [A, B, E, F]
Is subset of set1: true
Is subset of set2: true
```

## 5. Performance Comparison

|Operation|HashSet|LinkedHashSet|TreeSet|
|---|---|---|---|
|Add|O(1)|O(1)|O(log n)|
|Remove|O(1)|O(1)|O(log n)|
|Contains|O(1)|O(1)|O(log n)|
|Iteration|O(n)|O(n)|O(n)|
|Memory|Low|Medium|High|

## 6. When to Use Which Set Implementation

### Use HashSet when:

- You need fastest performance for basic operations
- Order doesn't matter
- No sorting required

### Use LinkedHashSet when:

- You need to maintain insertion order
- Moderate performance is acceptable
- Predictable iteration order required

### Use TreeSet when:

- You need elements in sorted order
- You need NavigableSet operations (first, last, lower, higher, etc.)
- Logarithmic performance is acceptable

## 7. Common Pitfalls and Best Practices

### 7.1 Mutable Objects in Set

```java
import java.util.*;

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Proper equals and hashCode implementation
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
    
    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
    
    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class MutableObjectsInSet {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();
        
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Jane", 30);
        
        personSet.add(person1);
        personSet.add(person2);
        
        System.out.println("Original set: " + personSet);
        System.out.println("Contains John(25): " + personSet.contains(new Person("John", 25)));
        
        // Modifying object after adding to set - DANGEROUS!
        person1.setAge(35);
        
        System.out.println("After modifying person1: " + personSet);
        System.out.println("Contains John(25): " + personSet.contains(new Person("John", 25)));
        System.out.println("Contains John(35): " + personSet.contains(new Person("John", 35)));
        
        // The set is now in inconsistent state!
    }
}
```

### 7.2 Best Practices

```java
import java.util.*;

public class SetBestPractices {
    public static void main(String[] args) {
        // 1. Use interface reference
        Set<String> goodSet = new HashSet<>(); // Good
        // HashSet<String> badSet = new HashSet<>(); // Less flexible
        
        // 2. Initialize with capacity if size is known
        Set<String> efficientSet = new HashSet<>(100); // Good for large datasets
        
        // 3. Use factory methods for small sets (Java 9+)
        Set<String> immutableSet = Set.of("A", "B", "C");
        System.out.println("Immutable set: " + immutableSet);
        
        // 4. Check for null before operations
        Set<String> nullSafeSet = new HashSet<>();
        String element = null;
        if (element != null) {
            nullSafeSet.add(element);
        }
        
        // 5. Use isEmpty() instead of size() == 0
        if (nullSafeSet.isEmpty()) { // Good
            System.out.println("Set is empty");
        }
        
        // 6. Use enhanced for-loop for iteration
        Set<Integer> numbers = new TreeSet<>(Arrays.asList(3, 1, 4, 1, 5));
        for (Integer num : numbers) { // Good
            System.out.print(num + " ");
        }
        System.out.println();
        
        // 7. Use streams for complex operations (Java 8+)
        Set<String> fruits = new HashSet<>(Arrays.asList("apple", "banana", "cherry", "date"));
        
        // Filter and collect
        Set<String> longFruits = fruits.stream()
            .filter(fruit -> fruit.length() > 5)
            .collect(Collectors.toSet());
        System.out.println("Long fruit names: " + longFruits);
        
        // Convert to uppercase
        Set<String> upperFruits = fruits.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toSet());
        System.out.println("Uppercase fruits: " + upperFruits);
    }
}
```

**Output:**

```
Immutable set: [A, B, C]
Set is empty
1 3 4 5 
Long fruit names: [banana, cherry]
Uppercase fruits: [APPLE, BANANA, CHERRY, DATE]
```

## 8. Thread Safety Considerations

```java
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafetyExample {
    public static void main(String[] args) {
        // Not thread-safe
        Set<String> unsafeSet = new HashSet<>();
        
        // Thread-safe options:
        
        // 1. Collections.synchronizedSet()
        Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet<>());
        
        // 2. ConcurrentHashMap.newKeySet() (Java 8+)
        Set<String> concurrentSet = ConcurrentHashMap.newKeySet();
        
        // 3. Copy-on-write for read-heavy scenarios
        Set<String> cowSet = Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap<>());
        
        System.out.println("Thread-safe set options demonstrated");
    }
}
```

This comprehensive guide covers all aspects of the Set interface in Java, from basic usage to advanced concepts and best practices.