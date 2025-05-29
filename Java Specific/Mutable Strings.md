
# Java Mutable String Classes - Complete Guide

## Overview

Java provides three main classes for handling strings:

- **String** - Immutable string class
- **StringBuilder** - Mutable string class (not thread-safe)
- **StringBuffer** - Mutable string class (thread-safe)

## String Class (Immutable)

### Characteristics

- **Immutable**: Once created, cannot be modified
- **Thread-safe**: Due to immutability
- **Memory overhead**: Creates new objects for concatenation
- **String pool**: Literals stored in string pool for memory efficiency

### Key Problems with String

```java
public class StringProblems {
    public static void main(String[] args) {
        // Problem 1: Memory waste due to immutability
        String str = "Hello";
        str = str + " World";  // Creates new String object
        str = str + "!";       // Creates another new String object
        
        // Problem 2: Performance issue in loops
        String result = "";
        for (int i = 0; i < 1000; i++) {
            result += i + " ";  // Creates 1000 new String objects!
        }
        System.out.println("Final result length: " + result.length());
    }
}
```

## StringBuilder Class (Mutable)

### Characteristics

- **Mutable**: Can modify content without creating new objects
- **Not thread-safe**: Faster but not suitable for multi-threaded environments
- **Dynamic capacity**: Automatically grows as needed
- **Introduced**: Java 1.5

### Constructor Examples

```java
public class StringBuilderConstructors {
    public static void main(String[] args) {
        // Default constructor - initial capacity 16
        StringBuilder sb1 = new StringBuilder();
        System.out.println("Default capacity: " + sb1.capacity());
        
        // Constructor with initial capacity
        StringBuilder sb2 = new StringBuilder(50);
        System.out.println("Custom capacity: " + sb2.capacity());
        
        // Constructor with initial string
        StringBuilder sb3 = new StringBuilder("Hello");
        System.out.println("With string - capacity: " + sb3.capacity() + 
                          ", length: " + sb3.length());
        
        // Constructor with CharSequence
        StringBuilder sb4 = new StringBuilder(sb3);
        System.out.println("From CharSequence: " + sb4.toString());
    }
}
```

### Core Methods with Examples

#### 1. append() Methods

```java
public class StringBuilderAppend {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Start");
        
        // Append different data types
        sb.append(" - String");           // String
        sb.append(123);                   // int
        sb.append(45.67);                 // double
        sb.append(true);                  // boolean
        sb.append('X');                   // char
        sb.append(new char[]{'A','B','C'}); // char array
        
        System.out.println("Result: " + sb.toString());
        
        // Method chaining
        StringBuilder chained = new StringBuilder()
            .append("Method")
            .append(" ")
            .append("Chaining")
            .append(" ")
            .append("Example");
        
        System.out.println("Chained: " + chained.toString());
    }
}
```

#### 2. insert() Methods

```java
public class StringBuilderInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        
        // Insert at specific position
        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb.toString());
        
        // Insert different data types
        sb.insert(0, 2023);              // Insert number at beginning
        sb.insert(sb.length(), "!");     // Insert at end
        
        System.out.println("Final: " + sb.toString());
        
        // Insert char array
        char[] chars = {'[', ']'};
        StringBuilder sb2 = new StringBuilder("Content");
        sb2.insert(0, '[').insert(sb2.length(), ']');
        System.out.println("With brackets: " + sb2.toString());
    }
}
```

#### 3. delete() and deleteCharAt() Methods

```java
public class StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Beautiful World");
        
        // Delete range of characters
        sb.delete(5, 15);  // Removes " Beautiful"
        System.out.println("After delete: " + sb.toString());
        
        // Delete single character
        StringBuilder sb2 = new StringBuilder("Programming");
        sb2.deleteCharAt(0);  // Remove first character
        System.out.println("After deleteCharAt: " + sb2.toString());
        
        // Delete from specific position to end
        StringBuilder sb3 = new StringBuilder("Hello World 123");
        sb3.delete(11, sb3.length());  // Remove " 123"
        System.out.println("Partial delete: " + sb3.toString());
    }
}
```

#### 4. replace() Method

```java
public class StringBuilderReplace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        
        // Replace range with new string
        sb.replace(6, 11, "Universe");
        System.out.println("After replace: " + sb.toString());
        
        // Replace with longer string
        StringBuilder sb2 = new StringBuilder("Hi");
        sb2.replace(0, 2, "Hello Everyone");
        System.out.println("Longer replacement: " + sb2.toString());
        
        // Replace with shorter string
        StringBuilder sb3 = new StringBuilder("Good Morning Everyone");
        sb3.replace(5, 21, "Day");
        System.out.println("Shorter replacement: " + sb3.toString());
    }
}
```

#### 5. reverse() Method

```java
public class StringBuilderReverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.reverse();
        System.out.println("Reversed: " + sb.toString());
        
        // Palindrome check example
        String word = "racecar";
        StringBuilder sb2 = new StringBuilder(word);
        String reversed = sb2.reverse().toString();
        System.out.println(word + " is palindrome: " + word.equals(reversed));
        
        // Number reversal
        StringBuilder sb3 = new StringBuilder("12345");
        System.out.println("Original: 12345, Reversed: " + sb3.reverse().toString());
    }
}
```

#### 6. Capacity Management Methods

```java
public class StringBuilderCapacity {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        System.out.println("Initial - Length: " + sb.length() + 
                          ", Capacity: " + sb.capacity());
        
        // Add content to trigger capacity increase
        for (int i = 0; i < 20; i++) {
            sb.append("X");
            if (i == 15 || i == 16 || i == 19) {
                System.out.println("After adding " + (i+1) + " chars - " +
                                  "Length: " + sb.length() + 
                                  ", Capacity: " + sb.capacity());
            }
        }
        
        // Manual capacity management
        StringBuilder sb2 = new StringBuilder();
        sb2.ensureCapacity(50);
        System.out.println("After ensureCapacity(50): " + sb2.capacity());
        
        // Trim to size
        sb2.append("Small text");
        sb2.trimToSize();
        System.out.println("After trimToSize - Length: " + sb2.length() + 
                          ", Capacity: " + sb2.capacity());
    }
}
```

#### 7. Character Access Methods

```java
public class StringBuilderCharAccess {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Programming");
        
        // Get character at index
        char ch = sb.charAt(3);
        System.out.println("Character at index 3: " + ch);
        
        // Set character at index
        sb.setCharAt(0, 'p');  // Change 'P' to 'p'
        System.out.println("After setCharAt: " + sb.toString());
        
        // Get characters in range
        char[] chars = new char[4];
        sb.getChars(2, 6, chars, 0);  // Copy "ogra" to chars array
        System.out.println("Extracted chars: " + new String(chars));
        
        // Index operations
        int index1 = sb.indexOf("gram");
        int index2 = sb.lastIndexOf("g");
        System.out.println("indexOf 'gram': " + index1);
        System.out.println("lastIndexOf 'g': " + index2);
    }
}
```

#### 8. Substring Methods

```java
public class StringBuilderSubstring {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java Programming");
        
        // Substring from index to end
        String sub1 = sb.substring(5);
        System.out.println("Substring from 5: " + sub1);
        
        // Substring with start and end index
        String sub2 = sb.substring(0, 4);
        System.out.println("Substring 0 to 4: " + sub2);
        
        // SubSequence (returns CharSequence)
        CharSequence subSeq = sb.subSequence(5, 16);
        System.out.println("SubSequence 5 to 16: " + subSeq);
        
        // Note: These methods return String/CharSequence, not StringBuilder
        System.out.println("Original StringBuilder unchanged: " + sb.toString());
    }
}
```

## StringBuffer Class (Thread-Safe Mutable)

### Characteristics

- **Mutable**: Like StringBuilder
- **Thread-safe**: All methods are synchronized
- **Performance**: Slower than StringBuilder due to synchronization
- **Legacy**: Available since Java 1.0

### StringBuffer Examples

```java
public class StringBufferExamples {
    public static void main(String[] args) {
        // All StringBuilder methods work with StringBuffer
        StringBuffer sb = new StringBuffer("StringBuffer");
        
        // Append operations
        sb.append(" is");
        sb.append(" thread-safe");
        System.out.println("Result: " + sb.toString());
        
        // Insert operation
        sb.insert(12, " also");
        System.out.println("After insert: " + sb.toString());
        
        // Delete operation
        sb.delete(12, 17);  // Remove " also"
        System.out.println("After delete: " + sb.toString());
        
        // Thread-safe demonstration
        demonstrateThreadSafety();
    }
    
    public static void demonstrateThreadSafety() {
        StringBuffer threadSafeSB = new StringBuffer();
        StringBuilder notThreadSafeSB = new StringBuilder();
        
        // Multiple threads modifying StringBuffer (safe)
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                threadSafeSB.append("A");
            }
        });
        
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                threadSafeSB.append("B");
            }
        });
        
        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            
            System.out.println("StringBuffer final length: " + threadSafeSB.length());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```

## Performance Comparison

### Benchmark Example

```java
public class PerformanceComparison {
    public static void main(String[] args) {
        int iterations = 50000;
        
        // String concatenation (slow)
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        long stringTime = System.currentTimeMillis() - startTime;
        
        // StringBuilder (fast)
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        String sbResult = sb.toString();
        long sbTime = System.currentTimeMillis() - startTime;
        
        // StringBuffer (slower than StringBuilder)
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append("a");
        }
        String sbfResult = sbf.toString();
        long sbfTime = System.currentTimeMillis() - startTime;
        
        System.out.println("Performance Comparison for " + iterations + " iterations:");
        System.out.println("String concatenation: " + stringTime + " ms");
        System.out.println("StringBuilder: " + sbTime + " ms");
        System.out.println("StringBuffer: " + sbfTime + " ms");
        
        System.out.println("\nSpeed improvement:");
        System.out.println("StringBuilder is " + (stringTime/sbTime) + "x faster than String");
        System.out.println("StringBuilder is " + (sbfTime/sbTime) + "x faster than StringBuffer");
    }
}
```

## Comparison Table

|Feature|String|StringBuilder|StringBuffer|
|---|---|---|---|
|**Mutability**|Immutable|Mutable|Mutable|
|**Thread Safety**|Yes (immutable)|No|Yes (synchronized)|
|**Performance**|Slow for concatenation|Fast|Moderate|
|**Memory Usage**|High (creates new objects)|Low|Low|
|**When to Use**|Few modifications|Single-threaded, many modifications|Multi-threaded, many modifications|
|**Introduced**|Java 1.0|Java 1.5|Java 1.0|

## Best Practices and Use Cases

### When to Use String

```java
public class StringUseCases {
    public static void main(String[] args) {
        // Use String when:
        
        // 1. Content doesn't change
        String constant = "Hello World";
        
        // 2. Few concatenations
        String greeting = "Hello" + " " + "World";
        
        // 3. Method parameters and return values
        processString("Input string");
        
        // 4. String literals and constants
        final String ERROR_MESSAGE = "Error occurred";
    }
    
    public static void processString(String input) {
        System.out.println("Processing: " + input);
    }
}
```

### When to Use StringBuilder

```java
public class StringBuilderUseCases {
    public static void main(String[] args) {
        // Use StringBuilder when:
        
        // 1. Many string modifications in single thread
        StringBuilder html = new StringBuilder();
        html.append("<html>")
            .append("<body>")
            .append("<h1>Title</h1>")
            .append("</body>")
            .append("</html>");
        
        // 2. Building strings in loops
        StringBuilder csv = new StringBuilder();
        String[] data = {"Name", "Age", "City"};
        for (int i = 0; i < data.length; i++) {
            csv.append(data[i]);
            if (i < data.length - 1) csv.append(",");
        }
        
        // 3. Dynamic string building
        StringBuilder query = buildDynamicQuery("users", 
            new String[]{"name", "email"}, 
            "age > 18");
        
        System.out.println("HTML: " + html.toString());
        System.out.println("CSV: " + csv.toString());
        System.out.println("Query: " + query.toString());
    }
    
    public static StringBuilder buildDynamicQuery(String table, 
                                                 String[] columns, 
                                                 String condition) {
        StringBuilder query = new StringBuilder("SELECT ");
        
        for (int i = 0; i < columns.length; i++) {
            query.append(columns[i]);
            if (i < columns.length - 1) query.append(", ");
        }
        
        query.append(" FROM ").append(table);
        
        if (condition != null && !condition.isEmpty()) {
            query.append(" WHERE ").append(condition);
        }
        
        return query;
    }
}
```

### When to Use StringBuffer

```java
public class StringBufferUseCases {
    public static void main(String[] args) {
        // Use StringBuffer when:
        
        // 1. Multi-threaded environment with shared string building
        StringBuffer sharedBuffer = new StringBuffer();
        
        Thread producer1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                sharedBuffer.append("P1-").append(i).append(" ");
            }
        });
        
        Thread producer2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                sharedBuffer.append("P2-").append(i).append(" ");
            }
        });
        
        try {
            producer1.start();
            producer2.start();
            producer1.join();
            producer2.join();
            
            System.out.println("Shared buffer length: " + sharedBuffer.length());
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // 2. Legacy code compatibility
        processLegacyStringBuffer(sharedBuffer);
    }
    
    public static void processLegacyStringBuffer(StringBuffer buffer) {
        // Some legacy method that expects StringBuffer
        buffer.append(" [PROCESSED]");
        System.out.println("Legacy processing completed");
    }
}
```

## Common Methods Summary

### StringBuilder/StringBuffer Method Reference

```java
public class MethodReference {
    public static void demonstrateAllMethods() {
        StringBuilder sb = new StringBuilder("Sample");
        
        // Construction and basic info
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        
        // Modification methods
        sb.append(" Text");                    // Add to end
        sb.insert(6, "New ");                  // Insert at position
        sb.delete(6, 10);                      // Delete range
        sb.deleteCharAt(sb.length()-1);        // Delete single char
        sb.replace(0, 6, "Example");           // Replace range
        sb.reverse();                          // Reverse content
        
        // Access methods
        char ch = sb.charAt(0);                // Get character
        sb.setCharAt(0, 'e');                  // Set character
        
        // Search methods
        int pos1 = sb.indexOf("x");            // Find first occurrence
        int pos2 = sb.lastIndexOf("e");        // Find last occurrence
        
        // Extraction methods
        String sub = sb.substring(1, 4);       // Extract substring
        CharSequence seq = sb.subSequence(0, 3); // Extract sequence
        
        // Capacity management
        sb.ensureCapacity(50);                 // Ensure minimum capacity
        sb.trimToSize();                       // Reduce capacity to length
        
        // Conversion
        String result = sb.toString();         // Convert to String
        
        System.out.println("Final result: " + result);
    }
}
```

## Memory Management and Internals

### Understanding Capacity Growth

```java
public class CapacityDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        System.out.println("Capacity growth demonstration:");
        System.out.println("Initial capacity: " + sb.capacity());
        
        // Capacity growth formula: (oldCapacity * 2) + 2
        for (int i = 1; i <= 50; i++) {
            sb.append("X");
            
            if (i == 16 || i == 34) {  // Points where capacity typically grows
                System.out.println("After " + i + " chars - " +
                                  "Length: " + sb.length() + 
                                  ", Capacity: " + sb.capacity());
            }
        }
        
        // Optimal capacity setting
        StringBuilder optimized = new StringBuilder(100);  // If you know approximate size
        System.out.println("Optimized initial capacity: " + optimized.capacity());
    }
}
```

This comprehensive guide covers all aspects of mutable string classes in Java, providing practical examples and best practices for effective usage.