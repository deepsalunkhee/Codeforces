# A High level comparison of C++ and Java

### Origins and resons for creation
- C++ was created by Bjarne Stroustrup in 1979 at Bell Labs.
- Java was created by James Gosling in 1991 at Sun Microsystems.
- C++ was created to add object-oriented features to the C language.
- Java was created to provide a platform-independent language for developing software.
- C++ is a compiled language i.e. the code is converted into machine code before execution.
- Java is combination of both compiled and interpreted language i.e. the code is first compiled into byte code and then interpreted by the JVM.
- C++ is used for system programming, game development, and other performance-critical applications.
- Java is used for developing web applications, mobile applications, and enterprise applications.

### comparing the structure of the codes

#### Basic C++
```C++
#include <iostream>

int main() {
    std::cout << "Hello World" << std::endl;
    return 0;
}
```

Explanation of the code:
- `#include <iostream>` is used to include the iostream header file which contains the input/output stream functions.
- `int main()` is the main function of the C++ program.
- `std::cout << "Hello World" << std::endl;` is used to print the output to the console.
- `return 0;` is used to return a value from the main function.


#### Basic Java 
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


### Difference in the architecture of the languages

#### C++
- C++ is a statically typed language i.e. the data types of variables are known at compile time.
- C++ supports multiple inheritance i.e. a class can inheritance from multiple classes.
- C++ uses pointers to manage memory allocation and deallocation.
- C++ has a preprocessor that processes the source code before compilation.
- C++ has a rich set of libraries for various functionalities.
- '#include' is used to include the header files in C++,these header files contain the declarations of functions and classes.

#### java
- Java is a dynamically typed language i.e. the data types of variables are known at runtime.
- Java does not support multiple inheritance but supports multiple interfaces.
- Java uses garbage collection to manage memory allocation and deallocation.
- Java does not have a preprocessor.
- Java has a rich set of libraries for various functionalities.
- 'import' is used to import the packages in Java, these packages contain the classes and interfaces.

### Input and Output in C++ and java

#### C++ Input and Output
```C++
#include <iostream>

int main() {
    int n;
    std::cin >> n;
    std::cout << n << std::endl;
    return 0;
}
```

Explanation of the code:
- `std::cin >> n;` is used to read an integer from the user.
- `std::cout << n << std::endl;` is used to print the integer to the console.

#### Java Input and Output
```Java
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

### Data Types in C++ and java

#### C++ Data Types
```C++
int a = 10;
double b = 10.5;
long c = 1000000000;
float d = 10.5f;
char c = 'A';
std::string s = "Hello";
bool d = true;
```

#### Java Data Types
```java
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

# Comparing various Data structure & other components of the code in c++ and Java


### Arrays in C++ and java

#### C++ Arrays
```C++
#include <iostream>
using namespace std;

int main() {
    int arr[5] = {1, 2, 3, 4, 5};
    for(int i = 0; i < 5; i++) {
        cout << arr[i] << " ";
    }
    return 0;
}
```

- Functions related to array in c++
```C++
#include <iostream>
using namespace std;

int main() {
    int arr[5] = {1, 2, 3, 4, 5};
    cout << "Size of array: " << sizeof(arr) / sizeof(arr[0]) << endl;
    cout << "First element: " << arr[0] << endl;
    cout << "Last element: " << arr[4] << endl;
    return 0;
}
```

#### Java Arrays
```java
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

- Functions related to array in java
```Java
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //arry size
        System.out.println("Size of array: " + arr.length);
        //first element
        System.out.println("First element: " + arr[0]);
        //last element
        System.out.println("Last element: " + arr[arr.length - 1]);  
               
    }
}
```

### vectors in C++ and ArrayList in Java

#### C++ Vectors
```C++
#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> v = {1, 2, 3, 4, 5};
    for(int i = 0; i < v.size(); i++) {
        cout << v[i] << " ";
    }
    return 0;
}
```

- Functions related to vectors in c++
```C++
#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> v = {1, 2, 3, 4, 5};
    //basic functions
    v.push_back(6);
    v.pop_back();
    cout << "Size of vector: " << v.size() << endl;
    cout << "First element: " << v.front() << endl;
    cout << "Last element: " << v.back() << endl;
    //some more Functions
    v.insert(v.begin() + 2, 10);//insert at index 2
    v.erase(v.begin() + 3);//erase at index 3 
    v.clear();//clear the vectors
    //sorting
    sort(v.begin(), v.end());
    //sorting in descending order
    sort(v.rbegin(), v.rend());
    //sort using comparator
    sort(v.begin(), v.end(), greater<int>());
    //custom comparator
    sort(v.begin(), v.end(), [](int a, int b) {
        return a > b;
    });
    //reverse the vector
    reverse(v.begin(), v.end());

    //creating a vector of size 5 and all elements are 0
    vector<int> v1(5, 0);
    
    //creating a 2d vector
    vector<vector<int>> v2(5, vector<int>(5, 0));
    


    
    return 0;
}
```

#### Java ArrayList
```Java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
```

- Functions related to ArrayList in java
```java
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //basic functions
        list.add(6);
        list.remove(list.size() - 1);
        System.out.println("Size of list: " + list.size());
        System.out.println("First element: " + list.get(0));
        System.out.println("Last element: " + list.get(list.size() - 1));
        //some more Functions
        list.add(2, 10);//insert at index 2
        list.remove(3);//erase at index 3
        list.clear();//clear the list
        //sorting
        Collections.sort(list);
        //sorting in descending order
        Collections.sort(list, Collections.reverseOrder());
        //sort using comparator
        Collections.sort(list, Collections.reverseOrder());
        //custom comparator
        Collections.sort(list, (a, b) -> b - a);
        //the above does following : 
        //if a > b then return -1 
        //if a < b then return 1
        //if a == b then return 0
        //when we get -1 then a will be placed before
        //when we get 1 then b will be placed before
        //when we get 0 then no change

        //reverse the list
        Collections.reverse(list);

        //creating a list of size 5 and all elements are 0
        ArrayList<Integer> list1 = new ArrayList<>(Collections.nCopies(5, 0));
        
        //creating a 2d list1
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            list2.add(new ArrayList<>(Collections.nCopies(5, 0)));
        }
        // the list will look like this        
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        //accessing the elements
        System.out.println(list2.get(0).get(0));
        
    }
}
```

#### List in Java
```java
import java.util.List;
import java.util.ArrayList;
    
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
```

- Functions related to List in java
```Java
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //basic functions
        list.add(6);
        list.remove(list.size() - 1);
        System.out.println("Size of list: " + list.size());
        System.out.println("First element: " + list.get(0));
        System.out.println("Last element: " + list.get(list.size() - 1));
        //some more Functions
        list.add(2, 10);//insert at index 2
        list.remove(3);//erase at index 3
        list.clear();//clear the list
        //sorting
        Collections.sort(list);
        //sorting in descending order
        Collections.sort(list, Collections.reverseOrder());
        //sort using comparator
        Collections.sort(list, Collections.reverseOrder());
        //custom comparator
        Collections.sort(list, (a, b) -> b - a);
        //the above does following : 
        //if a > b then return -1 
        //if a < b then return 1
        //if a == b then return 0
        //when we get -1 then a will be placed before
        //when we get 1 then b will be placed before
        //when we get 0 then no change

        //reverse the list
        Collections.reverse(list);

        //creating a list of size 5 and all elements are 0
        List<Integer> list1 = new ArrayList<>(Collections.nCopies(5, 0));
        
        //creating a 2d list1
        List<List<Integer>> list2 = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            list2.add(new ArrayList<>(Collections.nCopies(5, 0)));
        }
        // the list will look like this
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0
        // 0 0 0 0 0

        //accessing the elements
        System.out.println(list2.get(0).get(0));
        
    }
}
```
##### Difference between List and ArrayList
- List is an interface in Java that extends the Collection interface.
- ArrayList is a class in Java that implements the List interface.
- List is an ordered collection of elements that allows duplicate elements.
- ArrayList is an ordered collection of elements that allows duplicate elements and provides random access to elements.
- List can be implemented by other classes like LinkedList, Vector, and Stack.
- ArrayList is implemented by the ArrayList class.
- use List when you want to create a list of elements without specifying the implementation class.
- use ArrayList when you want to create an ArrayList of elements.

### strings in C++ and Java

#### C++ Strings
```C++

#include <iostream>
#include <string>
using namespace std;

int main() {
    string s = "Hello World";
    cout << s << endl;
    return 0;
}
```

- Functions related to strings in c++
```C++
#include <iostream>
#include <string>
using namespace std;

int main() {
    string s = "Hello World";
    //basic functions
    cout << "Size of string: " << s.size() << endl;
    cout << "First character: " << s[0] << endl;
    cout << "Last character: " << s[s.size() - 1] << endl;
    //some more Functions
    s.push_back('!');
    //or 
    s += "!";
    s.pop_back();
    s.insert(5, " ");//insert at index 5
    s.erase(5, 1);//erase at index 5
    s.clear();
    //sorting
    sort(s.begin(), s.end());
    //sorting in descending order
    sort(s.rbegin(), s.rend());
    //sort using comparator
    sort(s.begin(), s.end(), greater<char>());
    //custom comparator
    sort(s.begin(), s.end(), [](char a, char b) {
        return a > b;
    });
    //reverse the string
    reverse(s.begin(), s.end());
    //substring 
    string sub = s.substr(0, 5);//substring from index 0 to 5
    
    //lower case to upper case
    transform(s.begin(), s.end(), s.begin(), ::toupper);
    //or
    for(int i = 0; i < s.size(); i++) {
        s[i] = toupper(s[i]);
    }
    //upper case to lower classes
    transform(s.begin(), s.end(), s.begin(), ::tolower);
    //or
    for(int i = 0; i < s.size(); i++) {
        s[i] = tolower(s[i]);
    }
    
    //string to integer 
    int num = stoi(s);
    //or
    num=s-'0';
    //integer to strings 
    s = to_string(num);

    



    return 0;
}
```

#### Java Strings
```java
public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s);
    }
}
```

- Functions related to strings in java
```Java

public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        //basic functions
        System.out.println("Size of string: " + s.length());
        System.out.println("First character: " + s.charAt(0));
        System.out.println("Last character: " + s.charAt(s.length() - 1));
        //some more Functions
        s += "!";
        s = s.substring(0, s.length() - 1);//pop_back
        s = s.substring(0, 5) + " " + s.substring(5);//insert at index 5
        //sorting
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        s = new String(arr);
        //sorting in descending order
        Arrays.sort(arr);
        s = new StringBuilder(s).reverse().toString();
        //sort using comparator
        Arrays.sort(arr);
        s = new String(arr);
        //custom comparator
        Arrays.sort(arr);
        s = new String(arr);
        //reverse the string
        s = new StringBuilder(s).reverse().toString();
        //substring 
        String sub = s.substring(0, 5);//substring from index 0 to 5
        //lower case to upper classes
        s = s.toUpperCase();
        //upper case to lower classes
        s = s.toLowerCase();
        //string to Integer
        int num = Integer.parseInt(s);
        //integer to strings    
        s = Integer.toString(num);
        
    }
}
```

### Maps in C++ and HashMap in java

#### C++ Maps
```C++

#include <iostream>
#include <map>
using namespace std;

int main() {
    map<string, int> m;
    m["a"] = 1;
    m["b"] = 2;
    m["c"] = 3;
    for(auto it = m.begin(); it != m.end(); it++) {
        cout << it->first << " " << it->second << endl;
    }
    return 0;
}
```

- Functions related to maps in c++
```C++
#include <iostream>
#include <map>
using namespace std;

int main() {
    map<string, int> m;
    m["a"] = 1;
    m["b"] = 2;
    m["c"] = 3;
    //basic functions
    cout << "Size of map: " << m.size() << endl;
    cout << "Value of key 'a': " << m["a"] << endl;
    //some more Functions
    m.insert({"d", 4});
    m.erase("b");
    m.clear();
    //sorting
    //sorting based on keys
    for(auto it = m.begin(); it != m.end(); it++) {
        cout << it->first << " " << it->second << endl;
    }
    //sorting based on values
    vector<pair<string, int>> v(m.begin(), m.end());
    sort(v.begin(), v.end(), [](pair<string, int> a, pair<string, int> b) {
        return a.second > b.second;
    });
    for(auto it = v.begin(); it != v.end(); it++) {
        cout << it->first << " " << it->second << endl;
    }
    //sorting based on keys
    vector<pair<string, int>> v(m.begin(), m.end());
    sort(v.begin(), v.end(), [](pair<string, int> a, pair<string, int> b) {
        return a.first > b.first;
    });
    for(auto it = v.begin(); it != v.end(); it++) {
        cout << it->first << " " << it->second << endl;
    }
    //sorting based on keys in descending order
    vector<pair<string, int>> v(m.begin(), m.end());
    sort(v.rbegin(), v.rend());
    for(auto it = v.begin(); it != v.end(); it++) {
        cout << it->first << " " << it->second << endl;
    }
    //sorting based on values in descending order
    vector<pair<string, int>> v(m.begin(), m.end());
    sort(v.rbegin(), v.rend(), [](pair<string, int> a, pair<string, int> b) {
        return a.second > b.second;
    });
    for(auto it = v.begin(); it != v.end(); it++) {
        cout << it->first << " " << it->second << endl;
    }
    //sorting based on keys in descending order
    vector<pair<string, int>> v(m.begin(), m.end());
    sort(v.rbegin(), v.rend(), [](pair<string, int> a, pair<string, int> b) {
        return a.first > b.first;
    });

    for(auto it = v.begin(); it != v.end(); it++) {
        cout << it->first << " " << it->second << endl;
    }

    //counting the frequency of a char in a sentence
    string s = "hello world";
    map<char, int> freq;
    for(char c : s) {
        freq[c]++;
    }
    for(auto it = freq.begin(); it != freq.end(); it++) {
        cout << it->first << " " << it->second << endl;
    }

    //find some thing in map
    auto it = m.find("a");
    if(it != m.end()) {
        cout << "Found" << endl;
    } else {
        cout << "Not Found" << endl;
    }

    return 0;

}

```

#### Java HashMap
```java

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        for(String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
```

- Functions related to HashMap in java
```java

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        //basic functions
        System.out.println("Size of map: " + map.size());
        System.out.println("Value of key 'a': " + map.get("a"));
        //some more Functions
        map.put("d", 4);
        map.remove("b");
        map.clear();
        //sorting
        //sorting based on keys
        for(String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        //sorting based on values
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> a.getValue() - b.getValue());
        for(Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //sorting based on keys
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> a.getKey().compareTo(b.getKey()));
        for(Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //sorting based on keys in descending order
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getKey().compareTo(a.getKey()));
        for(Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //sorting based on values in descending order
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        for(Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //sorting based on keys in descending order
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getKey().compareTo(a.getKey()));
        for(Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //counting the frequency of a char in a sentence
        String s = "hello world";
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //find some thing in maps
        if(map.containsKey("a")) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }   

    }
}
```


### bitset in C++ and toBinaryString in java

#### C++ bitset
```C++

#include <iostream>
#include <bitset>
using namespace std;

int main() {
    bitset<8> b(12);
    cout << b << endl;
    return 0;
    
}

```

- Functions related to bitset in c++
```C++
#include <iostream>
#include <bitset>
using namespace std;

int main() {
    bitset<8> b(12);
    //basic functions
    cout << "Size of bitset: " << b.size() << endl;
    cout << "Value of bitset: " << b.to_ulong() << endl;
    //some more Functions
    b.set(2);//set bit at index 2
    b.reset(3);//reset bit at index 3
    b.flip(4);//flip bit at index 4
    b.count();//count the number of set bits
    b.any();//check if any bit is set
    b.none();//check if no bit is set
    b.all();//check if all bits are set
    b.test(2);//check if bit at index 2 is set
    b[2] = 1;//set bit at index 2
    b[3] = 0;//reset bit at index 3
    b[4] = !b[4];//flip bit at index 4
    b <<= 1;//left shift
    b >>= 1;//right shift
    b = b << 1;//left shift
    b = b >> 1;//right shift
    b = b & b;//and operation
    b = b | b;//or operation
    b = b ^ b;//xor operation
    b = ~b;//not operation
    b = b & 1;//and operation with 1
    b = b | 1;//or operation with 1
    b = b ^ 1;//xor operation with 1
    b = ~b;//not operation
    b = b & 1;//and operation with 1
    b = b | 1;//or operation with 1
    b = b ^ 1;//xor operation with 1
    b = ~b;//not operation
    b = b & 1;//and operation with 1
    b = b | 1;//or operation with 1
    b = b ^ 1;//xor operation with 1
    b = ~b;//not operation
    b = b & 1;//and operation with 1
    b = b | 1;//or operation with 1
    b = b ^ 1;//xor operation with 1
    b = ~b;//not operation
    b = b & 1;//and operation with 1
    b = b | 1;//or operation with 1

}
```

#### Java toBinaryString
```Java

public class Main {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(Integer.toBinaryString(n));
    }
}
```

- Functions related to toBinaryString in java
```java

public class Main {
    public static void main(String[] args) {
        int n = 12;
        //basic functions
        System.out.println("Size of bitset: " + Integer.toBinaryString(n).length());
        System.out.println("Value of bitset: " + Integer.parseInt(Integer.toBinaryString(n), 2));
        //some more Functions
        n |= (1 << 2);//set bit at index 2
        n &= ~(1 << 3);//reset bit at index 3
        n ^= (1 << 4);//flip bit at index 4
        Integer.bitCount(n);//count the number of set bits
        Integer.bitCount(n) > 0;//check if any bit is set
        Integer.bitCount(n) == 0;//check if no bit is set
        Integer.bitCount(n) == 32;//check if all bits are set
        (n & (1 << 2)) > 0;//check if bit at index 2 is set
        n |= (1 << 2);//set bit at index 2
        n &= ~(1 << 3);//reset bit at index 3
        n ^= (1 << 4);//flip bit at index 4
        n <<= 1;//left shift
        n >>= 1;//right shift
        n = n << 1;//left shift
        n = n >> 1;//right shift
        n = n & n;//and operation
        n = n | n;//or operation
        n = n ^ n;//xor operation
        n = ~n;//not operation
        n = n & 1;//and operation with 1
        n = n | 1;//or operation with 1
        n = n ^ 1;//xor operation with 1
        n = ~n;//not operation
        n = n & 1;//and operation with 1
        n = n | 1;//or operation with 1
        n = n ^ 1;//xor operation with 1
        n = ~n;//not operation
        n = n & 1;//and operation with 1
        n = n | 1;//or operation with 1
        n = n ^ 1;//xor operation with 1
        n = ~n;//not operation
        n = n & 1;//and operation with 1

}
```


### max,min in C++ and Math.max,Math.min in Java

#### C++ max,min
```C++

#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int a = 10, b = 20;
    cout << max(a, b) << " " << min(a, b) << endl;
    return 0;
}
```

#### Java Math.max,Math.min
```java

public class Main {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(Math.max(a, b) + " " + Math.min(a, b));
    }
}
```


### Priority Queues/ minheap/maxheap in C++ and PriorityQueue in java

#### C++ Priority Queues
```C++


#include <iostream>
#include <queue>
using namespace std;

int main() {
    priority_queue<int> pq;
    pq.push(10);
    pq.push(20);
    pq.push(5);
    while(!pq.empty()) {
        cout << pq.top() << " ";
        pq.pop();
    }
    return 0;
}
```

- Functions related to Priority Queues in c++
```C++

#include <iostream>
#include <queue>
using namespace std;

int main() {
    priority_queue<int> pq;
    pq.push(10);
    pq.push(20);
    pq.push(5);
    //basic functions
    cout << "Size of priority queue: " << pq.size() << endl;
    cout << "Top element of priority queue: " << pq.top() << endl;
    //some more Functions
    pq.push(15);
    pq.pop();
    pq.empty();
    //sorting
    while(!pq.empty()) {
        cout << pq.top() << " ";
        pq.pop();
    }
    //min heap
    priority_queue<int, vector<int>, greater<int>> pq1;
    pq1.push(10);
    pq1.push(20);
    pq1.push(5);
    while(!pq1.empty()) {
        cout << pq1.top() << " ";
        pq1.pop();
    }
    //custom comparator
    priority_queue<int, vector<int>, greater<int>> pq2;
    pq2.push(10);
    pq2.push(20);
    pq2.push(5);
    while(!pq2.empty()) {
        cout << pq2.top() << " ";
        pq2.pop();
    }
    return 0;
}
```

#### Java PriorityQueue
```Java

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(5);
        while(!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
```

- Functions related to PriorityQueue in java
```java

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(5);
        //basic functions
        System.out.println("Size of priority queue: " + pq.size());
        System.out.println("Top element of priority queue: " + pq.peek());
        //some more Functions
        pq.add(15);
        pq.poll();
        pq.isEmpty();
        //sorting
        while(!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        //min heap
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(10);
        pq1.add(20);
        pq1.add(5);
        while(!pq1.isEmpty()) {
            System.out.print(pq1.poll() + " ");
        }
        //custom comparator
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a, b) -> b - a);
        pq2.add(10);
        pq2.add(20);
        pq2.add(5);
        while(!pq2.isEmpty()) {
            System.out.print(pq2.poll() + " ");
        }
    }
}
```

