# Java List Collection - Complete Guide

## Overview

The List interface in Java is part of the Java Collections Framework and extends the Collection interface. It represents an ordered collection (sequence) that allows duplicate elements and provides positional access to elements.

## Key Characteristics

- **Ordered**: Elements maintain their insertion order
- **Indexed**: Elements can be accessed by their position (0-based indexing)
- **Duplicates Allowed**: Same elements can appear multiple times
- **Null Values**: Most implementations allow null values

## Common Implementations

- **ArrayList**: Resizable array implementation (most commonly used)
- **LinkedList**: Doubly-linked list implementation
- **Vector**: Synchronized version of ArrayList (legacy)
- **Stack**: Extends Vector, LIFO operations

## Declaration and Initialization

```java
import java.util.*;

// Different ways to declare a List
List<String> list1 = new ArrayList<>();
List<Integer> list2 = new LinkedList<>();
ArrayList<String> list3 = new ArrayList<>();

// Initialize with values
List<String> colors = Arrays.asList("Red", "Green", "Blue");
List<Integer> numbers = List.of(1, 2, 3, 4, 5); // Java 9+
```

## Core List Methods with Examples

### 1. Adding Elements

```java
List<String> fruits = new ArrayList<>();

// add(element) - adds to end
fruits.add("Apple");
fruits.add("Banana");
System.out.println(fruits); // [Apple, Banana]

// add(index, element) - adds at specific position
fruits.add(1, "Orange");
System.out.println(fruits); // [Apple, Orange, Banana]

// addAll(collection) - adds all elements from another collection
List<String> moreFruits = Arrays.asList("Mango", "Grapes");
fruits.addAll(moreFruits);
System.out.println(fruits); // [Apple, Orange, Banana, Mango, Grapes]

// addAll(index, collection) - adds all at specific position
fruits.addAll(2, Arrays.asList("Kiwi", "Peach"));
System.out.println(fruits); // [Apple, Orange, Kiwi, Peach, Banana, Mango, Grapes]
```

### 2. Accessing Elements

```java
List<String> animals = Arrays.asList("Cat", "Dog", "Bird", "Fish");

// get(index) - retrieve element at index
String firstAnimal = animals.get(0);
System.out.println("First: " + firstAnimal); // First: Cat

// indexOf(element) - first occurrence index
int dogIndex = animals.indexOf("Dog");
System.out.println("Dog at index: " + dogIndex); // Dog at index: 1

// lastIndexOf(element) - last occurrence index
animals = Arrays.asList("Cat", "Dog", "Bird", "Dog", "Fish");
int lastDogIndex = animals.lastIndexOf("Dog");
System.out.println("Last Dog at: " + lastDogIndex); // Last Dog at: 3

// contains(element) - check if element exists
boolean hasBird = animals.contains("Bird");
System.out.println("Has Bird: " + hasBird); // Has Bird: true
```

### 3. Modifying Elements

```java
List<String> cities = new ArrayList<>(Arrays.asList("Paris", "London", "Tokyo"));

// set(index, element) - replace element at index
String oldCity = cities.set(1, "Berlin");
System.out.println("Replaced: " + oldCity); // Replaced: London
System.out.println(cities); // [Paris, Berlin, Tokyo]

// Collections.replaceAll() - replace all occurrences
cities = new ArrayList<>(Arrays.asList("A", "B", "A", "C"));
Collections.replaceAll(cities, "A", "X");
System.out.println(cities); // [X, B, X, C]
```

### 4. Removing Elements

```java
List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 3));

// remove(index) - remove by position
Integer removed = numbers.remove(2);
System.out.println("Removed: " + removed); // Removed: 3
System.out.println(numbers); // [1, 2, 4, 5, 3]

// remove(object) - remove first occurrence
boolean wasRemoved = numbers.remove(Integer.valueOf(3));
System.out.println("Was removed: " + wasRemoved); // Was removed: true
System.out.println(numbers); // [1, 2, 4, 5]

// removeAll(collection) - remove all matching elements
numbers.removeAll(Arrays.asList(2, 4));
System.out.println(numbers); // [1, 5]

// retainAll(collection) - keep only matching elements
numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
numbers.retainAll(Arrays.asList(2, 4, 6));
System.out.println(numbers); // [2, 4]

// clear() - remove all elements
numbers.clear();
System.out.println("After clear: " + numbers); // After clear: []
```

### 5. Size and Capacity Operations

```java
List<String> items = new ArrayList<>();
items.addAll(Arrays.asList("A", "B", "C"));

// size() - number of elements
System.out.println("Size: " + items.size()); // Size: 3

// isEmpty() - check if list is empty
System.out.println("Is empty: " + items.isEmpty()); // Is empty: false

// For ArrayList specific - capacity management
ArrayList<String> arrayList = new ArrayList<>(10); // initial capacity
arrayList.ensureCapacity(20); // ensure minimum capacity
arrayList.trimToSize(); // reduce capacity to current size
```

### 6. Sublists and Views

```java
List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

// subList(fromIndex, toIndex) - returns view of portion
List<Integer> sublist = numbers.subList(3, 7);
System.out.println("Sublist: " + sublist); // Sublist: [3, 4, 5, 6]

// Note: subList returns a view, changes affect original
List<Integer> mutableList = new ArrayList<>(numbers);
List<Integer> mutableSub = mutableList.subList(2, 5);
mutableSub.clear(); // removes elements from original list
System.out.println("After sublist clear: " + mutableList); 
// After sublist clear: [0, 1, 5, 6, 7, 8, 9]
```

### 7. Conversion Operations

```java
List<String> stringList = Arrays.asList("apple", "banana", "cherry");

// toArray() - convert to Object array
Object[] objArray = stringList.toArray();

// toArray(T[] array) - convert to typed array
String[] stringArray = stringList.toArray(new String[0]);
System.out.println(Arrays.toString(stringArray)); // [apple, banana, cherry]

// Convert to other collections
Set<String> set = new HashSet<>(stringList);
Queue<String> queue = new LinkedList<>(stringList);
```

### 8. Iteration Methods

```java
List<String> colors = Arrays.asList("Red", "Green", "Blue");

// Traditional for loop
for (int i = 0; i < colors.size(); i++) {
    System.out.println(i + ": " + colors.get(i));
}

// Enhanced for loop
for (String color : colors) {
    System.out.println(color);
}

// Iterator
Iterator<String> iterator = colors.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}

// ListIterator (bidirectional)
ListIterator<String> listIterator = colors.listIterator();
while (listIterator.hasNext()) {
    System.out.println("Forward: " + listIterator.next());
}
while (listIterator.hasPrevious()) {
    System.out.println("Backward: " + listIterator.previous());
}

// Java 8 Streams and forEach
colors.forEach(System.out::println);
colors.stream().filter(c -> c.length() > 3).forEach(System.out::println);
```

### 9. Sorting and Searching

```java
List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));

// Collections.sort() - natural ordering
Collections.sort(numbers);
System.out.println("Sorted: " + numbers); // Sorted: [1, 2, 5, 8, 9]

// Collections.sort() with Comparator
List<String> words = new ArrayList<>(Arrays.asList("apple", "Banana", "cherry"));
Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
System.out.println("Case insensitive sort: " + words); // [apple, Banana, cherry]

// Collections.reverse()
Collections.reverse(numbers);
System.out.println("Reversed: " + numbers); // Reversed: [9, 8, 5, 2, 1]

// Collections.shuffle()
Collections.shuffle(numbers);
System.out.println("Shuffled: " + numbers);

// Collections.binarySearch() - requires sorted list
numbers = Arrays.asList(1, 3, 5, 7, 9);
int index = Collections.binarySearch(numbers, 5);
System.out.println("Binary search for 5: " + index); // Binary search for 5: 2
```

## Custom Sorting Methods

### 1. Using Comparator Interface

```java
// Custom class for demonstration
class Student {
    private String name;
    private int age;
    private double gpa;
    
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    
    @Override
    public String toString() {
        return String.format("Student{name='%s', age=%d, gpa=%.1f}", name, age, gpa);
    }
}

List<Student> students = Arrays.asList(
    new Student("Alice", 22, 3.8),
    new Student("Bob", 20, 3.2),
    new Student("Charlie", 21, 3.9),
    new Student("Diana", 20, 3.6)
);

// Sort by age using anonymous Comparator
Collections.sort(students, new Comparator<Student>() {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
});
System.out.println("Sorted by age: " + students);

// Sort by GPA in descending order
Collections.sort(students, new Comparator<Student>() {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa()); // Note: s2, s1 for descending
    }
});
System.out.println("Sorted by GPA (desc): " + students);
```

### 2. Lambda Expressions (Java 8+)

```java
List<Student> students = Arrays.asList(
    new Student("Alice", 22, 3.8),
    new Student("Bob", 20, 3.2),
    new Student("Charlie", 21, 3.9),
    new Student("Diana", 20, 3.6)
);

// Sort by name using lambda
Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
System.out.println("Sorted by name: " + students);

// Sort by age using lambda
Collections.sort(students, (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));

// Sort by GPA descending using lambda
Collections.sort(students, (s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
```

### 3. Method References and Comparator Static Methods

```java
List<Student> students = Arrays.asList(
    new Student("Alice", 22, 3.8),
    new Student("Bob", 20, 3.2),
    new Student("Charlie", 21, 3.9),
    new Student("Diana", 20, 3.6)
);

// Using Comparator.comparing() with method reference
Collections.sort(students, Comparator.comparing(Student::getName));
System.out.println("Sorted by name: " + students);

// Sort by age
Collections.sort(students, Comparator.comparing(Student::getAge));

// Sort by GPA in descending order
Collections.sort(students, Comparator.comparing(Student::getGpa).reversed());

// Sort by age, then by name (multiple criteria)
Collections.sort(students, Comparator.comparing(Student::getAge)
                                    .thenComparing(Student::getName));

// Sort by age descending, then by GPA ascending
Collections.sort(students, Comparator.comparing(Student::getAge).reversed()
                                    .thenComparing(Student::getGpa));
```

### 4. List.sort() Method (Java 8+)

```java
List<Student> students = new ArrayList<>(Arrays.asList(
    new Student("Alice", 22, 3.8),
    new Student("Bob", 20, 3.2),
    new Student("Charlie", 21, 3.9),
    new Student("Diana", 20, 3.6)
));

// Using List.sort() instead of Collections.sort()
students.sort(Comparator.comparing(Student::getName));
students.sort(Comparator.comparing(Student::getAge).reversed());
students.sort(Comparator.comparing(Student::getGpa).thenComparing(Student::getName));
```

### 5. Implementing Comparable Interface

```java
class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private double salary;
    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    // Natural ordering by salary
    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }
    
    // Getters and toString...
    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }
    
    @Override
    public String toString() {
        return String.format("Employee{name='%s', id=%d, salary=%.1f}", name, id, salary);
    }
}

List<Employee> employees = new ArrayList<>(Arrays.asList(
    new Employee("John", 101, 50000),
    new Employee("Jane", 102, 75000),
    new Employee("Mike", 103, 60000)
));

// Natural sorting using Comparable
Collections.sort(employees);
System.out.println("Sorted by salary: " + employees);

// Override natural sorting with custom Comparator
employees.sort(Comparator.comparing(Employee::getName));
System.out.println("Sorted by name: " + employees);
```

### 6. Complex Custom Sorting Examples

```java
List<Student> students = Arrays.asList(
    new Student("Alice", 22, 3.8),
    new Student("Bob", 20, 3.2),
    new Student("Charlie", 21, 3.9),
    new Student("Diana", 20, 3.6),
    new Student("Eve", 22, 3.8)
);

// Sort by multiple criteria: age desc, then GPA desc, then name asc
students.sort(Comparator.comparing(Student::getAge).reversed()
                        .thenComparing(Student::getGpa).reversed()
                        .thenComparing(Student::getName));

// Custom sorting with null handling
List<String> names = Arrays.asList("Alice", null, "Bob", "Charlie", null);
names.sort(Comparator.nullsFirst(String::compareTo));
System.out.println("Nulls first: " + names); // [null, null, Alice, Bob, Charlie]

names.sort(Comparator.nullsLast(String::compareTo));
System.out.println("Nulls last: " + names); // [Alice, Bob, Charlie, null, null]

// Sort strings by length, then alphabetically
List<String> words = Arrays.asList("apple", "pie", "a", "application", "test");
words.sort(Comparator.comparing(String::length)
                     .thenComparing(String::compareTo));
System.out.println("By length then alphabetically: " + words);
// [a, pie, apple, test, application]

// Custom comparator for case-insensitive sorting with special rules
List<String> items = Arrays.asList("Apple", "banana", "Cherry", "date");
items.sort((s1, s2) -> {
    // Custom logic: case-insensitive, but uppercase letters come first
    String lower1 = s1.toLowerCase();
    String lower2 = s2.toLowerCase();
    int result = lower1.compareTo(lower2);
    if (result == 0) {
        // If same ignoring case, uppercase comes first
        return s1.compareTo(s2);
    }
    return result;
});
```

### 7. Sorting with Stream API (Java 8+)

```java
List<Student> students = Arrays.asList(
    new Student("Alice", 22, 3.8),
    new Student("Bob", 20, 3.2),
    new Student("Charlie", 21, 3.9)
);

// Sort and collect to new list
List<Student> sortedByGPA = students.stream()
    .sorted(Comparator.comparing(Student::getGpa).reversed())
    .collect(Collectors.toList());

// Sort with filtering
List<Student> topStudents = students.stream()
    .filter(s -> s.getGpa() > 3.5)
    .sorted(Comparator.comparing(Student::getGpa).reversed())
    .collect(Collectors.toList());

// Get top 2 students by GPA
List<Student> top2 = students.stream()
    .sorted(Comparator.comparing(Student::getGpa).reversed())
    .limit(2)
    .collect(Collectors.toList());
```

### 8. Performance Considerations for Custom Sorting

```java
// For large lists, consider performance implications

// Bad: Creating new objects in comparator
List<String> words = Arrays.asList("apple", "banana", "cherry");
words.sort((s1, s2) -> new StringBuilder(s1).reverse().toString()
                         .compareTo(new StringBuilder(s2).reverse().toString()));

// Better: Cache expensive operations
Map<String, String> reversedCache = new HashMap<>();
words.sort((s1, s2) -> {
    String rev1 = reversedCache.computeIfAbsent(s1, s -> new StringBuilder(s).reverse().toString());
    String rev2 = reversedCache.computeIfAbsent(s2, s -> new StringBuilder(s).reverse().toString());
    return rev1.compareTo(rev2);
});

// Best: Pre-compute values if sorting multiple times
class WordWithReversed {
    String original;
    String reversed;
    
    WordWithReversed(String word) {
        this.original = word;
        this.reversed = new StringBuilder(word).reverse().toString();
    }
}
```

### 10. List Comparison and Equality

```java
List<String> list1 = Arrays.asList("A", "B", "C");
List<String> list2 = Arrays.asList("A", "B", "C");
List<String> list3 = Arrays.asList("C", "B", "A");

// equals() - checks content and order
System.out.println("list1.equals(list2): " + list1.equals(list2)); // true
System.out.println("list1.equals(list3): " + list1.equals(list3)); // false

// hashCode() - consistent with equals
System.out.println("list1.hashCode(): " + list1.hashCode());
System.out.println("list2.hashCode(): " + list2.hashCode()); // same as list1
```

## Performance Characteristics

### ArrayList

- **Access by index**: O(1)
- **Add/Remove at end**: O(1) amortized
- **Add/Remove at beginning/middle**: O(n)
- **Search**: O(n)

### LinkedList

- **Access by index**: O(n)
- **Add/Remove at beginning/end**: O(1)
- **Add/Remove at middle**: O(n) to find position, O(1) to modify
- **Search**: O(n)

## Best Practices

```java
// 1. Use interface type for declarations
List<String> list = new ArrayList<>(); // Good
ArrayList<String> list2 = new ArrayList<>(); // Less flexible

// 2. Initialize with capacity if size is known
List<String> largeList = new ArrayList<>(1000);

// 3. Use appropriate implementation
List<String> frequentInsertions = new LinkedList<>(); // Better for frequent insertions
List<String> randomAccess = new ArrayList<>(); // Better for random access

// 4. Be careful with subList modifications
List<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
List<Integer> sub = original.subList(1, 4);
// sub.clear(); // This would modify original list

// 5. Use Collections utility methods
List<String> immutableList = Collections.unmodifiableList(Arrays.asList("A", "B"));
List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
```

## Common Pitfalls

```java
// 1. ConcurrentModificationException
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
// Wrong way - will throw exception
/*
for (String item : list) {
    if (item.equals("B")) {
        list.remove(item); // ConcurrentModificationException
    }
}
*/

// Correct way - use iterator
Iterator<String> iter = list.iterator();
while (iter.hasNext()) {
    if (iter.next().equals("B")) {
        iter.remove(); // Safe removal
    }
}

// 2. Primitive vs Object removal
List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
nums.remove(1); // Removes element at index 1 (value 2)
nums.remove(Integer.valueOf(1)); // Removes first occurrence of value 1

// 3. Null handling
List<String> nullList = new ArrayList<>();
nullList.add(null);
System.out.println(nullList.contains(null)); // true
System.out.println(nullList.indexOf(null)); // 0
```

## Thread Safety

- **ArrayList, LinkedList**: Not thread-safe
- **Vector**: Thread-safe (synchronized methods)
- **Collections.synchronizedList()**: Creates thread-safe wrapper
- **CopyOnWriteArrayList**: Thread-safe, optimized for read-heavy scenarios

```java
// Thread-safe alternatives
List<String> threadSafeList = Collections.synchronizedList(new ArrayList<>());
List<String> copyOnWriteList = new CopyOnWriteArrayList<>();
```