# Comparing C++ and Java



# Basic Java 
```Java

import java.util*;
import java.io*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

Explanation of the code:
- `import java.util*;` is used to import the util package of Java to use the Scanner class.
- `import java.io*;` is used to import the io package of Java to use the BufferedReader class.
- `public class Main` is the class name and it should be the same as the file name.
- `public static void main(String[] args)` is the main method of the Java program.
- `System.out.println("Hello World");` is used to print the output to the console.

### Java Input and Output
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
    }
}
```

Explanation of the code:
- `Scanner sc = new Scanner(System.in);` is used to take input from the user.
- `int n = sc.nextInt();` is used to read an integer from the user.
- `System.out.println(n);` is used to print the integer to the console.

### Java Data Types
```Java
public class Main {
    public static void main(String[] args) {
        int a = 10;
        double b = 10.5;
        long c = 1000000000;
        float d = 10.5f;
        char c = 'A';
        String s = "Hello";
        boolean d = true;
    }
}
```

Explanation of the code:
- `int a = 10;` is used to declare an integer variable.
- `double b = 10.5;` is used to declare a double variable.
- `long c = 1000000000;` is used to declare a long variable.
- `float d = 10.5f;` is used to declare a float variable.
- `char c = 'A';` is used to declare a character variable.
- `String s = "Hello";` is used to declare a string variable.
- `boolean d = true;` is used to declare a boolean variable.



