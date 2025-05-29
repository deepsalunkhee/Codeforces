# Java Queue Collection - Complete Guide

## Overview

The Queue interface in Java is part of the Java Collections Framework and represents a collection designed for holding elements prior to processing. It follows the **FIFO (First-In-First-Out)** principle, though some implementations may have different ordering.

```java
import java.util.*;
import java.util.concurrent.*;
```

## Queue Interface Hierarchy

```
Collection
    ↓
  Queue
    ↓
├── Deque (Double-ended queue)
├── BlockingQueue (Thread-safe queues)
└── Other implementations
```

## Common Queue Implementations

### 1. LinkedList

```java
Queue<String> linkedQueue = new LinkedList<>();
```

### 2. ArrayDeque

```java
Queue<String> arrayQueue = new ArrayDeque<>();
```

### 3. PriorityQueue (Heap-based)

```java
Queue<String> priorityQueue = new PriorityQueue<>(); // Min Heap by default
Queue<String> maxHeapQueue = new PriorityQueue<>(Collections.reverseOrder()); // Max Heap
```

### 4. LinkedBlockingQueue (Thread-safe)

```java
Queue<String> blockingQueue = new LinkedBlockingQueue<>();
```

## Core Queue Methods

### 1. Insertion Operations

#### `add(E e)` - Throws exception on failure

```java
Queue<String> queue = new LinkedList<>();
queue.add("First");
queue.add("Second");
// Returns: true if successful
// Throws: IllegalStateException if capacity restricted and no space available
```

#### `offer(E e)` - Returns false on failure

```java
Queue<String> queue = new LinkedList<>();
boolean result = queue.offer("First");  // Returns true
boolean result2 = queue.offer("Second"); // Returns true
// Preferred method for capacity-restricted queues
```

### 2. Removal Operations

#### `remove()` - Throws exception if empty

```java
Queue<String> queue = new LinkedList<>();
queue.add("First");
queue.add("Second");

String removed = queue.remove(); // Returns "First"
// Throws: NoSuchElementException if queue is empty
```

#### `poll()` - Returns null if empty

```java
Queue<String> queue = new LinkedList<>();
queue.add("First");

String polled = queue.poll(); // Returns "First"
String polled2 = queue.poll(); // Returns null (queue is empty)
```

### 3. Examination Operations

#### `element()` - Throws exception if empty

```java
Queue<String> queue = new LinkedList<>();
queue.add("First");

String head = queue.element(); // Returns "First" without removing
// Throws: NoSuchElementException if queue is empty
```

#### `peek()` - Returns null if empty

```java
Queue<String> queue = new LinkedList<>();
queue.add("First");

String head = queue.peek(); // Returns "First" without removing
String head2 = queue.peek(); // Still returns "First"

Queue<String> emptyQueue = new LinkedList<>();
String nullHead = emptyQueue.peek(); // Returns null
```

## Heap Concepts in PriorityQueue

### What is a Heap?

A heap is a specialized binary tree-based data structure that satisfies the heap property. Java's PriorityQueue is implemented as a binary heap using an array representation.

### Min Heap vs Max Heap

#### Min Heap (Default PriorityQueue behavior)

- **Property**: Parent node is always smaller than or equal to its children
- **Root**: Contains the minimum element
- **Use case**: When you need to repeatedly access the smallest element

```java
// Min Heap - Natural ordering (ascending)
PriorityQueue<Integer> minHeap = new PriorityQueue<>();

minHeap.offer(15);
minHeap.offer(10);
minHeap.offer(20);
minHeap.offer(8);

System.out.println("Min Heap peek: " + minHeap.peek()); // Output: 8
```

#### Max Heap (Using Collections.reverseOrder())

- **Property**: Parent node is always greater than or equal to its children
- **Root**: Contains the maximum element
- **Use case**: When you need to repeatedly access the largest element

```java
// Max Heap - Reverse ordering (descending)
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

maxHeap.offer(15);
maxHeap.offer(10);
maxHeap.offer(20);
maxHeap.offer(8);

System.out.println("Max Heap peek: " + maxHeap.peek()); // Output: 20
```

### Heap Operations Time Complexity

|Operation|Time Complexity|Description|
|---|---|---|
|`offer(e)`|O(log n)|Insert element and maintain heap property|
|`poll()`|O(log n)|Remove root and re-heapify|
|`peek()`|O(1)|Access root element without removal|
|`remove(e)`|O(n)|Find and remove specific element|
|`contains(e)`|O(n)|Linear search through heap|

### Detailed Heap Examples

```java
public class HeapExamples {
    
    public static void demonstrateMinHeap() {
        System.out.println("=== MIN HEAP DEMONSTRATION ===");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Insert elements
        int[] elements = {50, 30, 20, 15, 10, 8, 16};
        System.out.println("Inserting elements: " + Arrays.toString(elements));
        
        for (int element : elements) {
            minHeap.offer(element);
            System.out.println("After inserting " + element + ": " + minHeap);
        }
        
        System.out.println("\nExtracting elements (ascending order):");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
    }
    
    public static void demonstrateMaxHeap() {
        System.out.println("\n=== MAX HEAP DEMONSTRATION ===");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Insert same elements
        int[] elements = {50, 30, 20, 15, 10, 8, 16};
        System.out.println("Inserting elements: " + Arrays.toString(elements));
        
        for (int element : elements) {
            maxHeap.offer(element);
            System.out.println("After inserting " + element + ": " + maxHeap);
        }
        
        System.out.println("\nExtracting elements (descending order):");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println();
    }
    
    public static void demonstrateCustomComparator() {
        System.out.println("\n=== CUSTOM COMPARATOR HEAP ===");
        
        // Min heap based on string length
        PriorityQueue<String> lengthMinHeap = new PriorityQueue<>(
            Comparator.comparing(String::length)
        );
        
        lengthMinHeap.offer("elephant");
        lengthMinHeap.offer("cat");
        lengthMinHeap.offer("dog");
        lengthMinHeap.offer("butterfly");
        
        System.out.println("String length min heap:");
        while (!lengthMinHeap.isEmpty()) {
            String word = lengthMinHeap.poll();
            System.out.println(word + " (length: " + word.length() + ")");
        }
        
        // Max heap based on string length
        PriorityQueue<String> lengthMaxHeap = new PriorityQueue<>(
            Comparator.comparing(String::length).reversed()
        );
        
        lengthMaxHeap.offer("elephant");
        lengthMaxHeap.offer("cat");
        lengthMaxHeap.offer("dog");
        lengthMaxHeap.offer("butterfly");
        
        System.out.println("\nString length max heap:");
        while (!lengthMaxHeap.isEmpty()) {
            String word = lengthMaxHeap.poll();
            System.out.println(word + " (length: " + word.length() + ")");
        }
    }
}
```

### Heap-based Problem Solving

#### 1. Finding K Largest Elements

```java
public static List<Integer> findKLargest(int[] nums, int k) {
    // Use min heap to keep track of k largest elements
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
    for (int num : nums) {
        minHeap.offer(num);
        if (minHeap.size() > k) {
            minHeap.poll(); // Remove smallest
        }
    }
    
    return new ArrayList<>(minHeap);
}

// Example usage
int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6};
List<Integer> largest3 = findKLargest(numbers, 3);
System.out.println("3 largest elements: " + largest3); // [4, 6, 9]
```

#### 2. Finding K Smallest Elements

```java
public static List<Integer> findKSmallest(int[] nums, int k) {
    // Use max heap to keep track of k smallest elements
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    
    for (int num : nums) {
        maxHeap.offer(num);
        if (maxHeap.size() > k) {
            maxHeap.poll(); // Remove largest
        }
    }
    
    return new ArrayList<>(maxHeap);
}

// Example usage
int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6};
List<Integer> smallest3 = findKSmallest(numbers, 3);
System.out.println("3 smallest elements: " + smallest3); // [3, 2, 1]
```

#### 3. Median Finder using Two Heaps

```java
public class MedianFinder {
    private PriorityQueue<Integer> maxHeap; // Left half (smaller elements)
    private PriorityQueue<Integer> minHeap; // Right half (larger elements)
    
    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Max heap
        minHeap = new PriorityQueue<>(); // Min heap
    }
    
    public void addNum(int num) {
        // Add to max heap first
        maxHeap.offer(num);
        
        // Balance: move largest from maxHeap to minHeap
        minHeap.offer(maxHeap.poll());
        
        // Ensure maxHeap has same or one more element than minHeap
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}

// Usage example
MedianFinder mf = new MedianFinder();
mf.addNum(1);
mf.addNum(2);
System.out.println("Median: " + mf.findMedian()); // 1.5
mf.addNum(3);
System.out.println("Median: " + mf.findMedian()); // 2.0
```

### Heap Properties and Characteristics

#### Complete Binary Tree Structure

- All levels are filled except possibly the last level
- Last level is filled from left to right
- Height is always O(log n)

#### Array Representation

PriorityQueue uses array-based representation where:

- Parent of node at index `i` is at index `(i-1)/2`
- Left child of node at index `i` is at index `2*i + 1`
- Right child of node at index `i` is at index `2*i + 2`

```java
// Visualizing heap structure
public static void printHeapStructure(PriorityQueue<Integer> heap) {
    Integer[] array = heap.toArray(new Integer[0]);
    System.out.println("Heap as array: " + Arrays.toString(array));
    
    // Print tree structure (simplified)
    if (array.length > 0) {
        System.out.println("Tree structure:");
        printLevel(array, 0, 0);
    }
}

private static void printLevel(Integer[] arr, int index, int level) {
    if (index >= arr.length) return;
    
    // Print current node with indentation
    for (int i = 0; i < level; i++) System.out.print("  ");
    System.out.println(arr[index]);
    
    // Print children
    printLevel(arr, 2 * index + 1, level + 1); // Left child
    printLevel(arr, 2 * index + 2, level + 1); // Right child
}
```

## Method Comparison Table

#### Use Min Heap when:

- Finding minimum elements efficiently
- Implementing Dijkstra's shortest path algorithm
- Task scheduling (shortest job first)
- Finding k largest elements (counter-intuitively)

#### Use Max Heap when:

- Finding maximum elements efficiently
- Implementing priority scheduling (highest priority first)
- Finding k smallest elements (counter-intuitively)
- Building max-heap based algorithms

### Best Practices for Heap Usage

````java
public class HeapBestPractices {
    
    // 1. Always specify comparator for non-primitive types
    public static PriorityQueue<Person> createPersonHeap() {
        return new PriorityQueue<>(Comparator.comparing(Person::getAge));
    }
    
    // 2. Use appropriate initial capacity for known data size
    public static PriorityQueue<Integer> createSizedHeap(int expectedSize) {
        return new PriorityQueue<>(expectedSize);
    }
    
    // 3. Check for null before operations
    public static void safeHeapOperations(PriorityQueue<Integer> heap) {
        if (!heap.isEmpty()) {
            Integer top = heap.peek();
            // Process top element
        }
        
        Integer polled = heap.poll(); // Safe - returns null if empty
        if (polled != null) {
            // Process polled element
        }
    }
    
    // 4. Use streams for heap operations when appropriate
    public static List<Integer> getTopK(int[] array, int k) {
        return Arrays.stream(array)
                    .boxed()
                    .collect(PriorityQueue::new, PriorityQueue::offer, PriorityQueue::addAll)
                    .stream()
                    .limit(k)
                    .collect(Collectors.toList());
    }
}

| Operation | Throws Exception | Returns Special Value |
|-----------|------------------|----------------------|
| Insert    | `add(e)`        | `offer(e)`           |
| Remove    | `remove()`      | `poll()`             |
| Examine   | `element()`     | `peek()`             |

## Complete Example with All Methods

```java
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        // Creating different types of queues
        demonstrateBasicQueue();
        demonstratePriorityQueue();
        demonstrateCapacityRestrictedQueue();
    }
    
    public static void demonstrateBasicQueue() {
        System.out.println("=== Basic Queue Operations ===");
        Queue<String> queue = new LinkedList<>();
        
        // Adding elements
        queue.add("First");
        queue.offer("Second");
        queue.offer("Third");
        
        System.out.println("Queue: " + queue);
        System.out.println("Size: " + queue.size());
        
        // Examining head element
        System.out.println("Head (peek): " + queue.peek());
        System.out.println("Head (element): " + queue.element());
        
        // Removing elements
        System.out.println("Removed (poll): " + queue.poll());
        System.out.println("Removed (remove): " + queue.remove());
        
        System.out.println("Queue after removals: " + queue);
        
        // Checking if queue is empty
        System.out.println("Is empty: " + queue.isEmpty());
        
        // Safe operations on potentially empty queue
        String polled = queue.poll(); // Returns remaining element
        String polledEmpty = queue.poll(); // Returns null
        
        System.out.println("Polled: " + polled);
        System.out.println("Polled from empty: " + polledEmpty);
    }
    
    public static void demonstratePriorityQueue() {
        System.out.println("\n=== Priority Queue (Min Heap) ===");
        Queue<Integer> minHeap = new PriorityQueue<>();
        
        // Adding elements (not in order)
        minHeap.offer(30);
        minHeap.offer(10);
        minHeap.offer(20);
        minHeap.offer(5);
        
        System.out.println("PriorityQueue (Min Heap): " + minHeap);
        System.out.println("Peek (minimum): " + minHeap.peek());
        
        // Elements come out in ascending order (smallest first)
        System.out.print("Min Heap extraction: ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
        
        // Max Heap demonstration
        demonstrateMaxHeap();
    }
    
    public static void demonstrateMaxHeap() {
        System.out.println("\n=== Priority Queue (Max Heap) ===");
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Adding same elements
        maxHeap.offer(30);
        maxHeap.offer(10);
        maxHeap.offer(20);
        maxHeap.offer(5);
        
        System.out.println("PriorityQueue (Max Heap): " + maxHeap);
        System.out.println("Peek (maximum): " + maxHeap.peek());
        
        // Elements come out in descending order (largest first)
        System.out.print("Max Heap extraction: ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println();
    }
    
    public static void demonstrateCapacityRestrictedQueue() {
        System.out.println("\n=== Capacity Restricted Queue ===");
        Queue<String> queue = new ArrayBlockingQueue<>(2);
        
        // Adding to capacity
        System.out.println("Offer 'A': " + queue.offer("A"));
        System.out.println("Offer 'B': " + queue.offer("B"));
        System.out.println("Offer 'C': " + queue.offer("C")); // Returns false
        
        try {
            queue.add("D"); // Throws exception
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println("Final queue: " + queue);
    }
}
````

## Inherited Methods from Collection Interface

### Size and Status Methods

```java
Queue<String> queue = new LinkedList<>();

// Size operations
int size = queue.size();
boolean isEmpty = queue.isEmpty();

// Bulk operations
queue.clear(); // Removes all elements
```

### Search Operations

```java
Queue<String> queue = new LinkedList<>();
queue.addAll(Arrays.asList("A", "B", "C"));

// Checking presence
boolean contains = queue.contains("B"); // true
boolean containsAll = queue.containsAll(Arrays.asList("A", "C")); // true
```

### Conversion Operations

```java
Queue<String> queue = new LinkedList<>();
queue.addAll(Arrays.asList("A", "B", "C"));

// To array
Object[] array = queue.toArray();
String[] stringArray = queue.toArray(new String[0]);

// Iteration
for (String item : queue) {
    System.out.println(item);
}

// Using iterator
Iterator<String> iter = queue.iterator();
while (iter.hasNext()) {
    System.out.println(iter.next());
}
```

## Best Practices

### 1. Choose the Right Implementation

```java
// For general purpose FIFO operations
Queue<String> general = new LinkedList<>();

// For priority-based processing
Queue<String> priority = new PriorityQueue<>();

// For high-performance scenarios
Queue<String> fast = new ArrayDeque<>();

// For thread-safe operations
Queue<String> threadSafe = new ConcurrentLinkedQueue<>();
```

### 2. Safe Queue Operations

```java
public class SafeQueueOperations {
    public static void safeProcess(Queue<String> queue) {
        // Always check before removal
        if (!queue.isEmpty()) {
            String item = queue.poll();
            // Process item
        }
        
        // Or use poll() which returns null safely
        String item;
        while ((item = queue.poll()) != null) {
            // Process item
        }
    }
    
    public static void safeExamine(Queue<String> queue) {
        // Safe examination
        String head = queue.peek();
        if (head != null) {
            // Process head without removing
        }
    }
}
```

### 3. Exception Handling

```java
public class QueueExceptionHandling {
    public static void handleExceptions(Queue<String> queue) {
        try {
            // Operations that may throw exceptions
            queue.add("item"); // May throw if capacity restricted
            String removed = queue.remove(); // Throws if empty
            String head = queue.element(); // Throws if empty
        } catch (IllegalStateException e) {
            System.out.println("Queue is full: " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("Queue is empty: " + e.getMessage());
        }
    }
}
```

## Performance Characteristics

|Implementation|Add/Offer|Remove/Poll|Peek/Element|Notes|
|---|---|---|---|---|
|LinkedList|O(1)|O(1)|O(1)|Good for frequent add/remove|
|ArrayDeque|O(1) amortized|O(1)|O(1)|Better performance than LinkedList|
|PriorityQueue|O(log n)|O(log n)|O(1)|Maintains order based on priority|

## Thread Safety

```java
// Thread-safe queue implementations
Queue<String> concurrent = new ConcurrentLinkedQueue<>();
Queue<String> blocking = new LinkedBlockingQueue<>();

// Making non-thread-safe queue thread-safe
Queue<String> synchronized = Collections.synchronizedQueue(new LinkedList<>());

// Usage in multithreaded environment
synchronized (synchronizedQueue) {
    // Iteration must be synchronized externally
    for (String item : synchronizedQueue) {
        System.out.println(item);
    }
}
```

## Common Use Cases

### 1. Task Processing

```java
Queue<Task> taskQueue = new LinkedList<>();

// Producer adds tasks
taskQueue.offer(new Task("Process file"));
taskQueue.offer(new Task("Send email"));

// Consumer processes tasks
while (!taskQueue.isEmpty()) {
    Task task = taskQueue.poll();
    task.execute();
}
```

### 2. BFS (Breadth-First Search)

```java
public void bfs(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    
    while (!queue.isEmpty()) {
        TreeNode node = queue.poll();
        // Process node
        
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
    }
}
```

### 3. Request Buffering

```java
Queue<HttpRequest> requestBuffer = new ArrayDeque<>();

// Buffer incoming requests
public void bufferRequest(HttpRequest request) {
    if (!requestBuffer.offer(request)) {
        // Handle buffer full scenario
        throw new RuntimeException("Request buffer is full");
    }
}

// Process buffered requests
public void processRequests() {
    HttpRequest request;
    while ((request = requestBuffer.poll()) != null) {
        handleRequest(request);
    }
}
```

## Summary

The Queue interface provides a clean abstraction for FIFO data structures with two sets of methods - one that throws exceptions and another that returns special values. Choose the appropriate implementation based on your specific needs: LinkedList for general use, ArrayDeque for performance, PriorityQueue for ordered processing, and BlockingQueue implementations for concurrent scenarios.