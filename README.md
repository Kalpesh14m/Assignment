# Assignment:

---


## 1. Can one use an Employee class as a key in a HashMap
**=> Yes,**
1. The problem was that the hashcode and the Equals method generated from the Object class. employee1 and employee2's generated hashcode will be different, and two Employee objects will be present in the HashMap.

2. By making the Employee class implement the Object class's equals and hashcode methods, both the employee1 and employee2 hashcode and equals methods will return the same thing.

3. The HashMap will use the hashcode and equals method to identify the bucket where the object is present and equals to check that the properties values are same. It's going to retrieve the correct value.

### Stmt 1: [Class as a key in a HashMap](https://github.com/Kalpesh14m/java-comparable-vs-comparator/blob/main/src/com/stmt1/HashMapDemo.java)

### Ref:
#### [How HashMap works internal implementation](https://javahungry.blogspot.com/2013/08/hashing-how-hash-map-works-in-java-or.html)
#### [How ConcurrentHashMap works internal implementation](https://javahungry.blogspot.com/2015/02/how-concurrenthashmap-works-in-java-internal-implementation.html)
#### [How TreeMap works internal implementation](https://javahungry.blogspot.com/2014/06/how-treemap-works-ten-treemap-java-interview-questions.html)
#### [Diff: HashMap-VS-ConcurrentHashMap-VS-SynchronizedMap-VS-HashTable](https://www.javainterviewpoint.com/java-concurrenthashmap/)

### What is the difference between HashMap and ConcurrentHashMap? Follow up with - what is the difference between CHM and synchronized Map.

**1. Concurrency**

**HashMap:** As mentioned above the main difference between both of this collection is of concurrency HashMap is no thread safe.	

**ConcurrentHashMap:** On other hand ConcurrentHashMap is thread safe and fit for use in a multi-threaded environment.


**2. Implementation**	

**HashMap:** Hashmap and ConcurrentHashmap are implemented differently internally as Hashmap does not have concept if segments in its storage mechanism and stores the data in Key Value pair.	

**ConcurrentHashMap:** On other hand implementation of Concurerent HashMap in such a way that concurrentHashMap is divided into number of segments [default 16] on initialization. ConcurrentHashMap allows similar number (16) of threads to access these segments concurrently so that each thread work on a specific segment during high concurrency.


**3.	Introduced**

**HashMap:** HashMap is introduced in JDK 1.2	

**ConcurrentHashMap:** On other hand ConcurrentHashMap is introduced by SUN Microsystem in JDK 1.5.


**4.	Null allow**

**HashMap:** As mentioned above null values are allowed for key and values in case of HashMap.	

**ConcurrentHashMap:** On other hand in Concurrent HashMap null value is not allowed neither for key nor for value and if tried for such entry get Run-time exception saying NullPointerException.


**5.	Synchronization**

**HashMap:** HashMap is better than concurrent HashMap as there is no synchronization.	

**ConcurrentHashMap:** On other hand ConcurrentHashMap, thread-safety is achieved by dividing whole Map into different partition based upon Concurrency level and only locking particular portion instead of locking the whole Map.


**6.	Performance**

**HashMap:** We can synchronized Hashmap by wrapping it on Collections.synchornizedMap(HashMap) which will return a collection which is almost equivalent to Hashtable, where every modification operation on Map is locked on Map object.	

**ConcurrentHashMap:** As mentioned above there is a need to use Collections.SynchronizedMap() method then ConcurrentHashMap() is a better choice as ConcurrentHashMap still gives a chance to more than one thread to access map thus improving performance.

---

## 2. You are using a class from a library (say Student). You have a list of Student objects. You need to sort this list based on first name. How will you do it? Constraint: (You do not have the ability to change the source code of the Student class)

**=> Using Comparator Interface and compare method()**

## Stmt 2: [Java Comparable VS Comparator](https://github.com/Kalpesh14m/java-comparable-vs-comparator/blob/main/src/com/stmt2/ListSort.java)
### Ref:
#### [Diff: Comparable VS Comparator](https://www.guru99.com/comparable-vs-comparator-java.html)

---

## 3. Consider a class Person with two attributes - String name and List<String> degrees. How will you make this class immutable.

1. Immutable objects are thread-safe so you will not have any synchronization issues.

2. Immutable objects are good Map keys and Set elements, since these typically do not change once created.

3. Immutability makes it easier to write, use and reason about the code (class invariant is established once and then unchanged)

4. Immutability makes it easier to parallelize your program as there are no conflicts among objects.

5. The internal state of your program will be consistent even if you have exceptions.

6. References to immutable objects can be cached as they are not going to change.

## Stmt 3: [ImmutableClass](https://github.com/Kalpesh14m/java-comparable-vs-comparator/blob/main/src/com/stmt3/ImmutableClass.java)
### Ref:
#### [Resource](https://javagoal.com/immutable-class-in-java/)

---

## 4. We have a Parent class with 2 methods walk and run. We have a child class which overrides both the methods. Both child class methods just call their respective Super implementation. Parent class run method calls walk(). class Parent Parent p = new Child(); p.run(); Tell the order in which each method is called

Child - run calling super run()

Parent - Running

Child - walk calling super walk()

Parent - Walking

## [Solution](https://github.com/Kalpesh14m/java-comparable-vs-comparator/blob/main/src/com/stmt5/A.java)

---

## 5. Given a List of integers (List<Integer>), write code in Java 8 style to get the sum of the squares of all the odd numbers in the array.

```
List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
int c = intList.stream().filter(i -> i % 2 != 0).map(x -> x * x).reduce(0, (a, b) -> a + b);
System.out.println(c);
```
## [Solution](https://github.com/Kalpesh14m/java-comparable-vs-comparator/blob/main/src/com/stmt6/SquaresOfAllOdd.java)

---

## 6. Given an array of n integers and a number k, find the pairs of numbers in the array such that the difference between the pair is k. Find the optimal solution with and without extra storage

## [Solution](https://github.com/Kalpesh14m/java-comparable-vs-comparator/blob/main/src/com/stmt9/Stmt9.java)

---

## 7. Threading

## [Solution](https://github.com/Kalpesh14m/Assignment/tree/main/src/com/stmt4)

## Ref:
### [Threading:](https://javahungry.blogspot.com/p/threads.html)
