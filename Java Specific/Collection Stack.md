
---

# Java Stack Collection - Complete Guide

## Overview

The **Stack** class in Java is part of the `java.util` package.  
It represents a **Last-In-First-Out (LIFO)** data structure, where the last element pushed is the first to be popped.

> 🔹 Internally, `Stack<E>` extends **Vector**, meaning it is synchronized by default.

```java
import java.util.Stack;
```

---

## Stack Class Hierarchy

```
Collection
   ↓
 List
   ↓
 Vector
   ↓
 Stack
```

---

## Creating a Stack

```java
Stack<Integer> stack = new Stack<>();
Stack<String> stringStack = new Stack<>();
```

---

## Core Stack Methods

### 1. Push (Insert at Top)

```java
Stack<String> stack = new Stack<>();
stack.push("A");
stack.push("B");
stack.push("C");

System.out.println(stack); // [A, B, C]
```

---

### 2. Pop (Remove from Top)

```java
String top = stack.pop(); 
System.out.println("Popped: " + top); // C
System.out.println(stack);            // [A, B]
```

- **Throws** `EmptyStackException` if the stack is empty.
    

---

### 3. Peek (Examine Top)

```java
String top = stack.peek();
System.out.println("Top: " + top); // B
System.out.println(stack);         // [A, B] (unchanged)
```

- **Throws** `EmptyStackException` if empty.
    

---

### 4. Search (Find Position)

```java
int pos = stack.search("A"); 
System.out.println(pos); // 2 (1-based position from top)
```

- Returns `-1` if element not found.
    

---

### 5. Check Empty

```java
boolean empty = stack.isEmpty(); // false
```

---

## Example Walkthrough

```java
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);      // [10, 20, 30]
        System.out.println("Peek: " + stack.peek()); // 30
        System.out.println("Pop: " + stack.pop());   // 30
        System.out.println("Stack after pop: " + stack); // [10, 20]
        System.out.println("Search 10: " + stack.search(10)); // 2
    }
}
```

---

## Performance Characteristics

|Operation|Time Complexity|Notes|
|---|---|---|
|`push()`|O(1)|Amortized|
|`pop()`|O(1)|Throws if empty|
|`peek()`|O(1)|Just returns top|
|`search()`|O(n)|Linear search|
|Iteration|O(n)|Left → Right order|

---

## Limitations of `Stack`

- Based on **Vector**, hence:
    
    - **Thread-safe (synchronized)** but slower in single-thread scenarios.
        
    - Rarely recommended for new code.
        

👉 Prefer **`ArrayDeque`** (non-thread-safe, faster) or **`LinkedList`** when implementing stacks.

```java
Deque<Integer> stack = new ArrayDeque<>();
stack.push(10);
stack.push(20);
System.out.println(stack.pop()); // 20
```

---

## Stack Use Cases

### 1. Expression Evaluation (Balanced Parentheses)

```java
public boolean isValidParentheses(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else {
            if (stack.isEmpty()) return false;
            char top = stack.pop();
            if ((c == ')' && top != '(') ||
                (c == '}' && top != '{') ||
                (c == ']' && top != '[')) {
                return false;
            }
        }
    }
    return stack.isEmpty();
}
```

---

### 2. Undo / Redo Functionality

```java
Stack<String> undo = new Stack<>();
Stack<String> redo = new Stack<>();

undo.push("Typed A");
undo.push("Typed B");

System.out.println("Undo: " + undo.pop()); // "Typed B"
redo.push("Typed B");
```

---

### 3. DFS (Depth-First Search)

```java
public void dfs(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()) {
        TreeNode node = stack.pop();
        // Process node

        if (node.right != null) stack.push(node.right);
        if (node.left != null) stack.push(node.left);
    }
}
```

---

## Best Practices

1. **Prefer `ArrayDeque` over Stack**
    
    ```java
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(1);
    stack.push(2);
    System.out.println(stack.pop()); // 2
    ```
    
2. **Check before popping/peeking**
    
    ```java
    if (!stack.isEmpty()) {
        System.out.println(stack.pop());
    }
    ```
    
3. **Use Generics**
    
    ```java
    Stack<String> stack = new Stack<>();
    ```
    

---

## Summary

- **Stack** is a **LIFO** structure (`push`, `pop`, `peek`).
    
- Internally extends **Vector**, hence synchronized but slower.
    
- **`ArrayDeque`** is usually preferred for stack-like operations.
    
- Common in **parsing, DFS, backtracking, undo/redo**.
    

---

