

#### Filling an array

```
import java.util.Arrays;

int[] numbers = new int[5];
Arrays.fill(numbers, 42);  // fills entire array with 42

```

- here we have used Arrays framework
- we can also fill till specific index using this method


#### Sorting arrays

- using Arrays.sort()
```
int[] numbers = {5, 3, 8, 1, 2};
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));  // Output: [1, 2, 3, 5, 8]

```


- in reverse order
```
Integer[] numbers = {5, 3, 8, 1, 2};
Arrays.sort(numbers, Collections.reverseOrder());
System.out.println(Arrays.toString(numbers));  // Output: [8, 5, 3, 2, 1]

```

- using lamda
## Example: Sorting Strings by Length Using Lambda

```java
import java.util.Arrays;

public class LambdaSortExample {
    public static void main(String[] args) {
        String[] fruits = {"Pear", "Apple", "Kiwi", "Banana"};

        // Sort array using lambda comparator that compares by length
        Arrays.sort(fruits, (s1, s2) -> {
            int diff = s1.length() - s2.length();
            System.out.println("Comparing \"" + s1 + "\" and \"" + s2 + "\" -> " + diff);
            return diff;  // negative, zero, or positive result
        });

        System.out.println("Sorted array: " + Arrays.toString(fruits));
    }
}
```

---

## What happens here?

- The lambda `(s1, s2) -> { ... }` is called repeatedly by `Arrays.sort`.
    
- It compares two strings by length.
    
- It returns:
    
    - **Negative** value → means `s1` is shorter, so `s1` should come **before** `s2`.
        
    - **Zero** → lengths equal, so their order is unchanged.
        
    - **Positive** value → means `s1` is longer, so `s1` should come **after** `s2`.
        

---

## Sample Output (with debug print):

```
Comparing "Apple" and "Pear" -> 1
Comparing "Kiwi" and "Apple" -> -1
Comparing "Kiwi" and "Pear" -> 0
Comparing "Banana" and "Apple" -> 2
Comparing "Banana" and "Kiwi" -> 2
Sorted array: [Kiwi, Pear, Apple, Banana]
```

---

### Explanation of output lines:

- `"Apple" vs "Pear"`: `5 - 4 = 1` (positive) → Apple is longer, so it should come **after** Pear.
    
- `"Kiwi" vs "Apple"`: `4 - 5 = -1` (negative) → Kiwi is shorter, so it should come **before** Apple.
    
- `"Kiwi" vs "Pear"`: `4 - 4 = 0` (zero) → equal length, no change in order.
    
- And so on...
    

---

# Final Sorted Array:

`[Kiwi, Pear, Apple, Banana]` — sorted by string length ascending.

