
**Normal Scanner class**

- It is present in the util package
- For taking data in proper format we use normal Scanner class
- But this is not very fast and not recommended for cp

`static Scanner sc = new Scanner(System.in)`

- here system.in is something that takes input stream form the keyboard according to my current understanding

**Buffer Reader**

- Scanner uses regex internally to parse
- Buffer reader directly loads data in the memory

how to use

`BufferReader br= new BufferReader(new InputStreamReader(System.in))`

- `inputstreamreader` convers the byte based to char based (yes this makes thing slower, but again we make a a buffer reader so we can rad the thing directly)

using the `BufferReader`


`import java.io.*;

public class InputAllTypes {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader to read input from the keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // String
        System.out.print("Enter a string: ");
        String str = br.readLine();

        // Integer
        System.out.print("Enter an integer: ");
        int intVal = Integer.parseInt(br.readLine());

        // Float
        System.out.print("Enter a float: ");
        float floatVal = Float.parseFloat(br.readLine());

        // Double
        System.out.print("Enter a double: ");
        double doubleVal = Double.parseDouble(br.readLine());

        // Long
        System.out.print("Enter a long: ");
        long longVal = Long.parseLong(br.readLine());

        // Short
        System.out.print("Enter a short: ");
        short shortVal = Short.parseShort(br.readLine());

        // Byte
        System.out.print("Enter a byte: ");
        byte byteVal = Byte.parseByte(br.readLine());

        // Boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean boolVal = Boolean.parseBoolean(br.readLine());

        // Character (read a string and take the first character)
        System.out.print("Enter a character: ");
        char charVal = br.readLine().charAt(0);

        // Output all values
        System.out.println("\n--- Output ---");
        System.out.println("String: " + str);
        System.out.println("Integer: " + intVal);
        System.out.println("Float: " + floatVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("Long: " + longVal);
        System.out.println("Short: " + shortVal);
        System.out.println("Byte: " + byteVal);
        System.out.println("Boolean: " + boolVal);
        System.out.println("Character: " + charVal);
    }
}


To read an array using `BufferedReader` in Java, especially from standard input (`System.in`), you typically read a line, then split it into elements, and finally parse them into the required data type (like `int`, `double`, etc.).

---

### ✅ Example: Reading an `int` array using `BufferedReader`

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the size of the array (optional)
        System.out.print("Enter number of elements: ");
        int n = Integer.parseInt(br.readLine());

        // Read the array elements in a single line separated by spaces
        System.out.print("Enter elements: ");
        String[] input = br.readLine().split(" ");
        
        // Convert to int array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // Print the array
        System.out.println("Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---

### 📝 Notes:

- `br.readLine()` reads the entire line as a `String`.
    
- `.split(" ")` splits the string by spaces into a `String[]`.
    
- `Integer.parseInt()` or `Double.parseDouble()` is used to convert to numeric types.
    
- Always handle `IOException` using `try-catch` or `throws`.
    

---

Let me know if you want an example for other types like `double[]`, `String[]`, or multidimensional arrays.
`

