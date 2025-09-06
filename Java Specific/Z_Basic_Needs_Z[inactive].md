
---

## creating an array
```java
int[] arr = new int[5];
int[] arr2 = {1, 2, 3, 4, 5};
```
---

## array length
```java
int n = arr.length;
```
---

## filling an array
```java
Arrays.fill(arr, 1);
```
---

## copying an array
```java
int[] copy = arr.clone();
int[] copy2 = Arrays.copyOf(arr, arr.length);
int[] sub = Arrays.copyOfRange(arr, 1, 4); // [1,4)
```
---

## array equality check
```java
boolean same = Arrays.equals(arr1, arr2); // content-equality
```
---

## sorting an int[] ascending
```java
Arrays.sort(arr);
```
---

## sorting descending (use Integer[])
```java
Integer[] a = {5,1,4};
Arrays.sort(a, Collections.reverseOrder());
```
---

## binary search in array
```java
int pos = Arrays.binarySearch(arr, x); // negative if not found
```
---

## array to list
```java
List<Integer> list = Arrays.asList(1,2,3,4);     // fixed-size view
List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4)); // mutable
```
---

## list to array
```java
Integer[] a = list.toArray(new Integer[0]);
int[] b = list.stream().mapToInt(Integer::intValue).toArray(); // primitive
```
---

## creating a list
```java
List<Integer> list = new ArrayList<>();
```
---

## list operations
```java
list.add(10);
list.addAll(Arrays.asList(1,2,3));
int v = list.get(0);
list.set(0, 99);
list.remove(0);                     // by index
list.remove(Integer.valueOf(2));    // by value
boolean has = list.contains(5);
int idx = list.indexOf(99);
List<Integer> sub = list.subList(1, Math.min(4, list.size()));
list.clear();
```
---

## iterating a list
```java
for (int x : list) { /* ... */ }
list.forEach(System.out::println);
for (int i = 0; i < list.size(); i++) { int x = list.get(i); }
```
---

## sorting a list (asc / desc)
```java
Collections.sort(list);
Collections.sort(list, Collections.reverseOrder());
```
---

## sorting list of list
```java
Collections.sort(list, Comparator.comparingInt(a -> a.get(0)));
Collections.sort(list, Comparator.comparing(a -> a.get(1))); // natural order of element 1
```
---

## sorting list with custom comparator
```java
Collections.sort(people, Comparator
        .comparing(Person::age)               // primary key
        .thenComparing(Person::name));        // tie-breaker
```
---

## creating a set
```java
Set<Integer> set = new HashSet<>();
```
---

## set types
```java
HashSet<Integer> set1 = new HashSet<>();        // unordered
LinkedHashSet<Integer> set2 = new LinkedHashSet<>(); // insertion order
TreeSet<Integer> set3 = new TreeSet<>();        // sorted
```
---

## set operations
```java
set.add(10);
set.remove(10);
boolean has = set.contains(5);
set.addAll(Arrays.asList(1,2,3));  // union-like
set.retainAll(Arrays.asList(2,3)); // intersection-like
set.removeAll(Arrays.asList(3));   // difference-like
```
---

## treeset extras
```java
TreeSet<Integer> ts = new TreeSet<>();
Integer lo = ts.floor(7);
Integer hi = ts.ceiling(7);
Integer prv = ts.lower(7);
Integer nxt = ts.higher(7);
```
---

## creating a map
```java
Map<Integer, String> map = new HashMap<>();
```
---

## map types
```java
HashMap<K,V>        // unordered, O(1) avg
LinkedHashMap<K,V>  // maintains insertion order (optionally access order)
TreeMap<K,V>        // sorted by key (O(log n))
```
---

## map operations
```java
map.put(1, "a");
map.putIfAbsent(2, "b");
String v = map.get(1);
boolean hasK = map.containsKey(2);
boolean hasV = map.containsValue("a");
map.remove(1);
```
---

## map getOrDefault (you asked for this)
```java
int cnt = freq.getOrDefault(x, 0);
String val = map.getOrDefault(key, "NA");
```
---

## map compute/merge helpers
```java
// counting frequency
freq.put(x, freq.getOrDefault(x, 0) + 1);

// list multimap
mapList.computeIfAbsent(key, k -> new ArrayList<>()).add(val);

// conditional update
map.computeIfPresent(k, (kk, vv) -> vv + "!");  // modify existing
map.computeIfAbsent(k, kk -> "start");          // create if missing

// merging values
sum.merge(key, delta, Integer::sum);            // sum[key] += delta
best.merge(key, val, Math::max);                // best[key] = max(best, val)
```
---

## iterating a map
```java
for (Map.Entry<Integer, String> e : map.entrySet()) {
    int k = e.getKey();
    String v = e.getValue();
}
map.forEach((k, v) -> { /* ... */ });
```
---

## treemap with custom order
```java
TreeMap<String,Integer> tm = new TreeMap<>(Comparator.reverseOrder());
```
---

## lru cache using linkedhashmap
```java
int CAP = 1000;
Map<Integer,Integer> lru = new LinkedHashMap<Integer,Integer>(16, 0.75f, true) {
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> e) {
        return size() > CAP;
    }
};
```
---

## queue
```java
Queue<Integer> q = new LinkedList<>();
q.add(10);      // throws on failure
q.offer(20);    // returns false on failure
q.poll();       // null if empty
q.peek();
```
---

## deque (double-ended queue)
```java
Deque<Integer> dq = new ArrayDeque<>();
dq.addFirst(1); dq.addLast(2);
dq.pollFirst(); dq.pollLast();
dq.peekFirst(); dq.peekLast();
```
---

## stack using deque (preferred over Stack)
```java
Deque<Integer> st = new ArrayDeque<>();
st.push(10);        // same as addFirst
st.pop();           // removes and returns first
st.peek();
```
---

## priority queue (min-heap / max-heap)
```java
PriorityQueue<Integer> minpq = new PriorityQueue<>();
PriorityQueue<Integer> maxpq = new PriorityQueue<>(Comparator.reverseOrder());
```
---

## priority queue with custom comparator
```java
PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator
        .comparingInt((int[] a) -> a[0])
        .thenComparingInt(a -> a[1]));
```
---

## collections utilities
```java
Collections.reverse(list);
Collections.shuffle(list);
Collections.rotate(list, 2);
int freq = Collections.frequency(list, 5);
boolean dis = Collections.disjoint(listA, listB);
Collections.fill(list, 0);
Collections.copy(dest, src); // dest must be at least src.size()
```
---

## stream from collection
```java
List<Integer> out = list.stream()
                        .filter(x -> x % 2 == 0)
                        .map(x -> x * x)
                        .collect(Collectors.toList());
```
---

## stream from array
```java
int[] a = {1,2,3};
IntStream s = Arrays.stream(a);
List<Integer> L = Arrays.stream(a).boxed().collect(Collectors.toList());
```
---

## stream sort & distinct
```java
List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
List<Integer> uniq = list.stream().distinct().collect(Collectors.toList());
```
---

## stream min / max / sum / average
```java
int min = list.stream().min(Integer::compare).get();
int max = list.stream().max(Integer::compare).get();
int sum = list.stream().mapToInt(Integer::intValue).sum();
double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0);
```
---

## stream limit / skip
```java
list.stream().limit(3).forEach(System.out::println);
list.stream().skip(2).forEach(System.out::println);
```
---

## stream flatMap (flatten list of lists)
```java
List<Integer> flat = listOfLists.stream()
        .flatMap(List::stream)
        .collect(Collectors.toList());
```
---

## stream groupingBy / counting
```java
Map<Integer, Long> counts = list.stream()
        .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
```
---

## stream groupingBy with downstream
```java
Map<String, Integer> sums = people.stream()
        .collect(Collectors.groupingBy(Person::city, Collectors.summingInt(Person::score)));
```
---

## stream partitioningBy
```java
Map<Boolean, List<Integer>> parts = list.stream()
        .collect(Collectors.partitioningBy(x -> x % 2 == 0));
```
---

## stream joining strings
```java
String s = words.stream().collect(Collectors.joining(",")); // "a,b,c"
```
---

## stream to set / specific collection
```java
Set<Integer> set = list.stream().collect(Collectors.toSet());
LinkedHashSet<Integer> lhs = list.stream().collect(Collectors.toCollection(LinkedHashSet::new));
```
---

## stream to array
```java
int[] a = list.stream().mapToInt(Integer::intValue).toArray();
Integer[] b = list.stream().toArray(Integer[]::new);
```
---

## toMap with merge function (handle duplicates)
```java
Map<Integer, Long> m = list.stream()
    .collect(Collectors.toMap(x -> x, x -> 1L, Long::sum));
```
---

## comparator helpers
```java
Comparator<String> byLen = Comparator.comparingInt(String::length);
Comparator<Person> cmp = Comparator.comparing(Person::age).reversed()
                                   .thenComparing(Person::name);
```
---

## quick literal collections (immutable)
```java
List<Integer> L = List.of(1,2,3);
Set<String> S = Set.of("a","b");
Map<Integer,String> M = Map.of(1,"a", 2,"b");
```
---
