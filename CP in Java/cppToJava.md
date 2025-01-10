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
    //accepting a 2d as array of char as input and printing it
    char arr[5][5];
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
            cin >> arr[i][j];
        }
    }
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }

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
        //accepting a 2d as array of char as input and printing it 
        char[][] arr = new char[5][5];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

		#       Scanner sc=new Scanner(System.in);
		# int n=sc.nextInt();
		# int m=sc.nextInt();
		# printInt(n);
		# printInt(m);
		#
		# //the building
		# char[][] bu=new char[n][m];
		#
		# for(int i=0;i<n;i++){
		# 	 bu[i]=sc.next().toCharArray();
		# }
        //sort the arrys in java     
        //note the arry must of the wrapper class ie Integer and not int and so on 
        Arrays.sort(arr);
        //sort the arrys in descending ordered
        Arrays.sort(arr, Collections.reverseOrder());
    
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

        //changing a value at a particular index
        list2.get(0).set(0, 10);//changing the value at index 0,0 to 10
        
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
        //give a string sentence which has words seperated by spaces convert it to a arrayList of words
        String sentence="hello world";
        String[] words=sentence.split(" ");

        //comparing two strings
        String s1="hello";
        String s2="world";

        if(s1.equals(s2)){
            System.out.println("Equal");
        }else{
        
            System.out.println("Not Equal");
        }

        //note: is java "==" is used to compare the references of the objects and not the values of the objects
        //i.e if we have two strings s1 and s2 and we do s1==s2 then it will compare the references of the objects and not the values of the objects
        //if we want to compare the values of the objects then we should use equals method

        //comparing two string lexicographically

        if(s1.compareTo(s2)>0){
            System.out.println("s1 is greater than s2");
        }else if(s1.compareTo(s2)<0){
            System.out.println("s1 is less than s2");
        }else{
            System.out.println("s1 is equal to s2");
        }

        //to check is somestring is present in another strings
        if(s1.contains("hello")){
            System.out.println("hello is present in s1");
        }else{
            System.out.println("hello is not present in s1");
        }

        //to check if a string starts with& ends wiht particular string 

        if(s1.startsWith("he")){
            System.out.println("s1 starts with he");
        }else{
            System.out.println("s1 does not start with he");
        }

        if(s1.endsWith("lo")){
            System.out.println("s1 ends with lo");
        }else{
            System.out.println("s1 does not end with lo");
        }

        //to replace a particular string with another strings
        s1=s1.replace("hello","world");
        System.out.println(s1);

        //to remove the leading and trailing spaces
        s1=s1.trim();
        System.out.println(s1);

        //to remoce a particular character from a strings
        s1=s1.replace("h","");
        System.out.println(s1);

        
    }
}
```

#### java StringBuffer

- what is this and why is this?
- StringBuffer is a class in Java that is used to create mutable strings.
- StringBuffer is used when we want to modify the string multiple times.

```java

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");//append at the end
        sb.insert(5, " ");//insert at index 5 
        sb.delete(5, 6);//delete at index 5
        sb.reverse();//reverse the string
        System.out.println(sb);
    }
}
```

- Functions related to StringBuffer in java
```java

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        //append at the end
        sb.append(" World");
        //insert at index 5 
        sb.insert(5, " ");
        //delete at index 5
        sb.delete(5, 6);
        //reverse the string
        sb.reverse();
        System.out.println(sb);
    }
}
```

#### StringBuilder in java 

- what is this and why is this?
- StringBuilder is a class in Java that is used to create mutable strings.
- diff between StringBuffer and this is that StringBuffer is synchronized and StringBuilder is not synchronized.
- StringBuilder is used when we want to modify the string multiple times and we don't need synchronization.

```java

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");//append at the end
        sb.insert(5, " ");//insert at index 5 
        sb.delete(5, 6);//delete at index 5
        sb.reverse();//reverse the string
        System.out.println(sb);
    }
}
```

- Functions related to StringBuilder in java
```java

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        //append at the end
        sb.append(" World");
        //insert at index 5 
        sb.insert(5, " ");
        //delete at index 5
        sb.delete(5, 6);
        //reverse the string
        sb.reverse();
        System.out.println(sb);
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

### Stack in C++ and Stack in java

#### C++ Stack
```C++

#include <iostream>
#include <stack>
using namespace std;

int main() {
    stack<int> s;
    s.push(10);
    s.push(20);
    s.push(5);
    while(!s.empty()) {
        cout << s.top() << " ";
        s.pop();
    }
    return 0;
}
```

- Functions related to Stack in c++
```C++

#include <iostream>
#include <stack>
using namespace std;

int main() {
    stack<int> s;
    s.push(10);
    s.push(20);
    s.push(5);
    //basic functions
    cout << "Size of stack: " << s.size() << endl;
    cout << "Top element of stack: " << s.top() << endl;
    //some more Functions
    s.push(15);
    s.pop();
    s.empty();
    //sorting
    while(!s.empty()) {
        cout << s.top() << " ";
        s.pop();
    }
    return 0;
}
```

#### Java Stack
```java

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(5);
        while(!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
```

- Functions related to Stack in java
```Java

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(5);
        //basic functions
        System.out.println("Size of stack: " + s.size());
        System.out.println("Top element of stack: " + s.peek());
        //some more Functions
        s.push(15);
        s.pop();
        s.isEmpty();
        //sorting
        while(!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
```

### Queue in C++ and Queue in Java

#### C++ Queue
```C++

#include <iostream>
#include <queue>
using namespace std;

int main() {
    queue<int> q;
    q.push(10);
    q.push(20);
    q.push(5);
    while(!q.empty()) {
        cout << q.front() << " ";
        q.pop();
    }
    return 0;
}
```

- Functions related to Queue in c++
```C++

#include <iostream>
#include <queue>
using namespace std;

int main() {
    queue<int> q;
    q.push(10);
    q.push(20);
    q.push(5);
    //basic functions
    cout << "Size of queue: " << q.size() << endl;
    cout << "Front element of queue: " << q.front() << endl;
    cout << "Back element of queue: " << q.back() << endl;
    //some more Functions
    q.push(15);
    q.pop();
    q.empty();
    //sorting
    while(!q.empty()) {
        cout << q.front() << " ";
        q.pop();
    }
    return 0;
}
```

#### Java Queue
```Java

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(5);
        while(!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.poll();
        }
    }
}
```

- Functions related to Queue in java
```java

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(5);
        //basic functions
        System.out.println("Size of queue: " + q.size());
        System.out.println("Front element of queue: " + q.peek());
        //some more Functions
        q.add(15);
        q.poll();
        q.isEmpty();
        //sorting
        while(!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.poll();
        }
    }
}
```

### pair in C++ and Pair in java

#### C++ pair
```C++

#include <iostream>
#include <utility>
using namespace std;

int main() {
    pair<int, int> p = {10, 20};
    cout << p.first << " " << p.second << endl;
    return 0;
}
```

- Functions related to pair in c++
```C++

#include <iostream>
#include <utility>
using namespace std;

int main() {
    pair<int, int> p = {10, 20};
    //basic functions
    cout << "First element of pair: " << p.first << endl;
    cout << "Second element of pair: " << p.second << endl;
    //some more Functions
    p = make_pair(20, 30);
    swap(p.first, p.second);
    return 0;
}
```

#### Java Pair
```java

import javafx.util.Pair;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, Integer> p = new Pair<>(10, 20);
        System.out.println(p.getKey() + " " + p.getValue());
    }
}
```

- Functions related to Pair in java
```java

import javafx.util.Pair;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, Integer> p = new Pair<>(10, 20);
        //basic functions
        System.out.println("First element of pair: " + p.getKey());
        System.out.println("Second element of pair: " + p.getValue());
        //some more Functions
        p = new Pair<>(20, 30);
        p = new Pair<>(p.getValue(), p.getKey());
    }
}
```

### set in C++ and Set in java

#### C++ set
```C++

#include <iostream>
#include <set>
using namespace std;

int main() {
    set<int> s;
    s.insert(10);
    s.insert(20);
    s.insert(5);
    for(auto it = s.begin(); it != s.end(); it++) {
        cout << *it << " ";
    }
    return 0;
}
```

- Functions related to set in c++
```C++

#include <iostream>
#include <set>
using namespace std;

int main() {
    set<int> s;
    s.insert(10);
    s.insert(20);
    s.insert(5);
    //basic functions
    cout << "Size of set: " << s.size() << endl;
    //some more Functions
    s.insert(15);
    s.erase(10);
    s.clear();
    //sorting
    for(auto it = s.begin(); it != s.end(); it++) {
        cout << *it << " ";
    }
    //custom comparator
    set<int, greater<int>> s1;
    s1.insert(10);
    s1.insert(20);
    s1.insert(5);
    for(auto it = s1.begin(); it != s1.end(); it++) {
        cout << *it << " ";
    }
    //cheking if a particular element is present in Set
    auto it = s.find(10);
    if(it != s.end()) {
        cout << "Found" << endl;
    } else {
        cout << "Not Found" << endl;
    }
    return 0;
}
```

#### Java Set
```java

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(5);
        for(int i : s) {
            System.out.print(i + " ");
        }
    }
}
```

- Functions related to Set in java
```java

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(5);
        //basic functions
        System.out.println("Size of set: " + s.size());
        //some more Functions
        s.add(15);
        s.remove(10);
        s.clear();
        //sorting
        for(int i : s) {
            System.out.print(i + " ");
        }
        //custom comparator
        Set<Integer> s1 = new TreeSet<>(Collections.reverseOrder());
        s1.add(10);
        s1.add(20);
        s1.add(5);
        for(int i : s1) {
            System.out.print(i + " ");
        }
        //cheking if a particular element is present in set
        if(s.contains(10)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
```

### List in Java 

- Diff between List and arrayList
- List is an interface in Java that is implemented by ArrayList, LinkedList, Vector, and Stack.- List is used when you want to create a list of elements without specifying the implementation class.
- ArrayList is used when you want to create an ArrayList of elements.   
- ArrayList is a class in Java that is used to create an ArrayList of elements.
- ArrayList is used when you want to create an ArrayList of elements.

#### Java List
```java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        for(int i : list) {
            System.out.print(i + " ");
        }
    }
}
```

- Functions related to List in java
```java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        //basic functions
        System.out.println("Size of list: " + list.size());
        //some more Functions
        list.add(15);
        list.remove(10);
        list.clear();
        //sorting
        Collections.sort(list);
        //sorting in descending order
        Collections.sort(list, Collections.reverseOrder());
        //sort using comparator
        Collections.sort(list, Collections.reverseOrder());
        //custom comparator
        Collections.sort(list, (a, b) -> b - a);
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
        //setting the elements
        list2.get(0).set(0, 10);
        System.out.println(list2.get(0).get(0));
    }
}
```

# Oops concepts in Java (these are random )

## Question
So, a class can be extended by a class, an interface can be implemented via an interface, and an interface can be implemented via a class. Correct?

## Answer

### 1. A Class Can Be Extended by Another Class
- **Correct!** This is called **inheritance**.
- A class can extend another class using the extends keyword.
- The subclass inherits the properties and methods of the parent class.
- Java supports **single inheritance**, so a class can extend only one parent class.

**Example:**
```java
class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // Inherited from Parent
        obj.show(); // Defined in Child
    }
}
```

### 2. An Interface Can Extend Another Interface
- **Correct!** An interface can extend one or more other interfaces using the `extends` keyword.
- This allows you to create more specialized interfaces by building on existing ones.
- **Note:** Multiple inheritance is allowed with interfaces.

**Example:**
```java
interface Animal {
    void eat();
}

interface Mammal extends Animal {
    void walk();
}

class Dog implements Mammal {
    public void eat() {
        System.out.println("Dog eats food.");
    }
    
    public void walk() {
        System.out.println("Dog walks on four legs.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
    }
}
```

### 3. An Interface Can Be Implemented by a Class
- **Correct!** This is called **implementation**.
- A class can implement one or more interfaces using the `implements` keyword.
- The class must provide concrete implementations for all abstract methods in the interface(s).

**Example:**
```java
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Output: Car starts with a key.
    }
}
```

### 4. A Class Can Implement Multiple Interfaces
- Java allows a class to implement multiple interfaces. This is one way to achieve **multiple inheritance** in Java.
- The class must implement all abstract methods from all the interfaces.

**Example:**
```java
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void show() {
        System.out.println("Showing document...");
    }
}

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}
```

### 5. A Class Cannot Extend an Interface
- **Not allowed.** A class must use `implements` to adopt an interface's behavior.

### 6. An Interface Cannot Implement Another Interface
- **Not allowed.** An interface can only **extend** another interface.

### Summary

| Scenario | Allowed? | Keyword | Notes |
|----------|----------|---------|-------|
| Class extends Class | ✅ Yes | `extends` | Single inheritance is allowed. |
| Interface extends Interface | ✅ Yes | `extends` | Multiple inheritance is allowed for interfaces. |
| Class implements Interface | ✅ Yes | `implements` | A class must implement all methods from the interface. |
| Interface implements Interface | ❌ No | - | Use `extends` instead. |
| Class extends Interface | ❌ No | - | Not allowed; must use `implements`. |


## Understanding List Interface and ArrayList Implementation in Java

### Explanation

When you write `List<Integer> temp = new ArrayList<>();`, you're demonstrating a key concept in Java's object-oriented and interface-based design:

1. **Interface Declaration**: `List<Integer> temp`
   - `List` is an interface that defines a contract for list-like data structures
   - It specifies methods that any list implementation must provide (like `add()`, `remove()`, `get()`)
   - Used as the reference type to provide flexibility

2. **Concrete Implementation**: `new ArrayList<>()`
   - `ArrayList` is a class that implements the `List` interface
   - Provides actual implementation of the methods defined in the `List` interface
   - Creates a concrete object that can be used as a list

### Code Example

```java
// Using List interface with ArrayList implementation
List<Integer> temp = new ArrayList<>();

// Adding elements
temp.add(10);
temp.add(20);
System.out.println(temp); // Output: [10, 20]

// Switching implementation (demonstrating interface flexibility)
temp = new LinkedList<>();
temp.add(30);
temp.add(40);
System.out.println(temp); // Output: [30, 40]
```

### Key Concepts

#### 1. Programming to an Interface
- Declare variables using interface types
- Create objects using specific implementation classes
- Enables more flexible and maintainable code

#### 2. Polymorphism
- Can use different list implementations interchangeably
- Code remains the same, only implementation changes

#### Common List Implementations
- `ArrayList`: Backed by a dynamic array
- `LinkedList`: Implemented as a doubly-linked list
- `Vector`: Similar to ArrayList, but synchronized

### Benefits
- **Flexibility**: Easy to change implementation
- **Abstraction**: Hide implementation details
- **Loose Coupling**: Depend on interfaces, not concrete classes

### Interface vs Implementation

| Aspect | Interface (`List`) | Implementation (`ArrayList`) |
|--------|-------------------|-------------------------------|
| Definition | Defines methods | Provides method implementations |
| Role | Contract | Concrete functionality |
| Instantiation | Cannot be instantiated | Can create objects |

### Code Variations

```java
// Different ways to declare and initialize
List<String> list1 = new ArrayList<>();  // Most common
ArrayList<String> list2 = new ArrayList<>();  // Concrete type
List<String> list3 = Collections.emptyList();  // Immutable empty list
```

### Best Practices
- Prefer interface types in variable declarations
- Choose implementation based on performance needs
- Consider time and space complexity of different list types

# Some random pieces of code that will teach you many things


## Comprehensive Java Code Breakdown: Subordinates Counting Program

### 1. Imports and Fundamental Setup
```java
import java.io.*;
import java.util.*;
```
- `java.io.*`: Provides classes for input/output operations
  - `BufferedReader`: Efficiently reads character input
  - `BufferedWriter`: Efficiently writes character output
- `java.util.*`: Contains utility classes like `List`, `ArrayList`, `Stack`, `Arrays`

### 2. Class and Input/Output Setup
```java
class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
```
#### Input/Output Components
- `BufferedReader (br)`: 
  - Reads input from the console
  - More efficient than `Scanner`
  - Can read entire lines of text
- `BufferedWriter (bw)`: 
  - Writes output to the console
  - More efficient than `System.out.println()`
  - Requires explicit flushing to display output

### 3. Main Solution Method
```java
public static void solution() throws IOException {
    // Method implementation
}
```
- `throws IOException`: Handles potential input/output errors
- Contains the core logic for solving the problem

#### 3.1 Reading Number of Employees
```java
int n = Integer.parseInt(br.readLine());
```
- Reads the first line as a string
- Converts string to integer using `Integer.parseInt()`
- Represents total number of employees in the company

#### 3.2 Creating Tree Structure
```java
List<List<Integer>> tree = new ArrayList<>();
for (int i = 0; i < n + 1; i++) {
    tree.add(new ArrayList<>());
}
```
- Creates an adjacency list representation of the company hierarchy
- Each index represents an employee
- Nested lists allow tracking of each employee's direct subordinates
- `n + 1` ensures indexing starts from 1 (not 0)

#### 3.3 Building the Hierarchy
```java
String[] bosses = br.readLine().split(" ");
for (int i = 2; i <= n; i++) {
    int boss = Integer.parseInt(bosses[i - 2]);
    tree.get(boss).add(i);
}
```
- Reads boss information for each employee
- `split(" ")`: Separates boss numbers by space
- Builds the tree by adding subordinates to their respective boss's list
- Uses `tree.get(boss).add(i)` to create hierarchy connections

#### 3.4 Initializing Subordinates Count
```java
int[] subordinatesCount = new int[n + 1];
Arrays.fill(subordinatesCount, -1);
```
- Creates an array to store subordinate counts
- `Arrays.fill()`: Sets default value to -1 (uncomputed)
- Allows tracking of each employee's total subordinates

### 4. Subordinates Computation Method
```java
private static void computeSubordinatesIteratively(List<List<Integer>> tree, int[] subordinatesCount)
```
#### Core Algorithm: Iterative Depth-First Search (DFS)
- Uses a stack for non-recursive tree traversal
- Performs post-order traversal to count subordinates
- Key steps:
  1. Push initial node to stack
  2. Visit unvisited nodes
  3. Add subordinates to stack
  4. Compute subordinate counts when backtracking

#### Algorithm Implementation Details
```java
Stack<Integer> stack = new Stack<>();
boolean[] visited = new boolean[n + 1];
int[] tempCount = new int[n + 1];
```
- `stack`: Manages nodes to be processed
- `visited`: Tracks processed nodes
- `tempCount`: Temporarily stores subordinate counts

#### Traversal Logic
- First pass: Mark nodes and push to stack
- Second pass: Compute subordinate count
  - Count direct subordinates
  - Add subordinates of subordinates

### 5. Main Method Execution
```java
public static void main(String[] args) throws IOException {
    solution();
}
```
- Entry point of the program
- Calls the `solution()` method to process and solve the problem

### Key Concepts Demonstrated
1. Tree Representation
2. Iterative Depth-First Search
3. Post-order Traversal
4. Efficient I/O Handling
5. Dynamic Counting Algorithm

### Practical Use Case
- Counting total subordinates in a company hierarchy
- Efficient for large organizational structures
- Demonstrates advanced Java programming techniques

### Performance Characteristics
- Time Complexity: O(n)
- Space Complexity: O(n)
- Efficient for large input sizes

### Potential Improvements
- Add error handling for invalid inputs
- Implement recursive alternative
- Add comments for complex logic sections
