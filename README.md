## Resources
- Archive: http://inst.eecs.berkeley.edu/~cs61b/archives.html //
- Spring 2019: https://sp19.datastructur.es
- Spring 2018: https://sp18.datastructur.es
- LectureCode: https://github.com/Berkeley-CS61B/lectureCode
- Autograder: https://www.gradescope.com (To sign up, use the entry code 93PK75)
The autograder is now open to the public. Sign up using entry code MNXYKX at gradescope.com.
- A Java Reference: http://www-inst.eecs.berkeley.edu/~cs61b/fa14/book1/java.pdf
- Head First Java: https://www.safaribooksonline.com/library/view/head-first-java/0596009208/
- 其他资源: https://www.1point3acres.com/bbs/thread-282583-1-1.html
- 这是数据结构讲义：https://inst.eecs.berkeley.edu/~cs61b/fa18/materials/book2/data-structures.pdf
- 这是Java讲义：https://inst.eecs.berkeley.edu/~cs61b/fa18/materials/book1/java.pdf
- IntelliJ IDEA遇到的一些问题 Class file not found in IntelliJ: https://stackoverflow.com/questions/2199711/class-file-not-found-in-intellij


这门课边看边学。

Textbook: CS61B
https://joshhug.gitbooks.io/hug61b/content/chap1/chap11.html

***Reading一直没看，也要看！！！！！！！***
***Reading一直没看，也要看！！！！！！！***
***Reading一直没看，也要看！！！！！！！***
***Reading一直没看，也要看！！！！！！！***
***Reading一直没看，也要看！！！！！！！***
***Reading一直没看，也要看！！！！！！！***



## 作业中做错的地方：
- disc02: Scope; Pass-by-Value; Static:
	- Pass-by-What? 注意java的Pass-by-Value按值传递。看disc02的第一题。
	- Static Methods! 看disc02的第二题。
	- Mac的`rm`指令没法在回收站里找到。。。突然脑抽把`mv`达成`rm`，结果文件被删没了。。。解决方法参考这个 https://www.jianshu.com/p/5552f33406820
	- Scope! 看disc02-examprep的第二题Horse-Cult。Since the variable same is declared within if statement, it is not accessible outside the if block. Therefore in the return statement, it would find the same variable cult self. **Different from Python** https://stackoverflow.com/questions/48654795/why-does-this-pointer-point-to-horse-cult-instead-of-horse-horse
- disc03: 
	- SLList: insert; reverse(iterative and recursive) 
	- AList: insert; reverse(iterative and recursive), replicate
- proj1a: Double Ended Queue (DataStructure: Deque)
- proj1b: Palindrome and OffByN (HoFs)
- disc04: 
	- Cannot do super.super.x




## Notes

- [x] Week 0 : Welcome to CS61B & Course Policies and Logistics
- [x] Week 1 (1/17-1/19) : Intro, Hello World Java & Defining and Using Classes.		
	- All functions are methods. Functions in Java return only one value.
	- Java is an object oriented language with strict requirements:
	1. Every Java file must contain a class declaration*( This is not completely true, we can also declare "interfaces" in .Java files that may contain code. We'll cover these later).
	2. All codes lives inside a class*, even helper functions, global constants, etc.
	3. To run a Java program, you typically define a main method using `public static void main(String[] args)`

	- Java is statically typed!
	1. All variables, parameters, and methods must have a declared type.
	2. That type can never change.
	3. Expressions also have a type.
	4. The compiler checks that all the types in your program are compatible before the program ever runs! (This is unlike Python, where type checks are performed DURING execution)
	- ***Style Guide!!!*** https://sp19.datastructur.es/materials/guides/style-guide.html
	- Javadoc comments: https://en.wikipedia.org/wiki/Javadoc
	- Defining a Typical Class (Terminology)
		- Instance variable.
		- Constructor
		- Non-static method, a.k.a. Instance Method.
		- Roughly speaking: If the method needs to use "**my** instance variables", the method must be non-static.
	- Instantiating a Class and Terminology
		- **Declaration** of a Dog variable
		- **Instantiation** of the Dog class as a Dog Object. 
		- **Instantiation** and **Assignment**
		- **Declaration**, **Instantiation** and **Assignment**
		-  **Invocation** of the 150 lb Dog's makeNoise method.
	- Static vs. Non-static (a.k.a. instance)
		- Static methods are invoked using the class name, e.g. Dog.makeNoise();
		- Instance methods are invoked using an instance name, e.g. maya.makeNoise();
		- Static methods can't access "my" instance variables, because there is no "me".
	- Why Static Methods?
		- Some classes are never instantiated.  
	- public static void main(String[] args)
	- Using Libraries (e.g. StdDraw, In): A useful library: The Princeton Standard Library

- [x] Project 0 (TODO: Test and Extra)

- [x] Week 2 (1/22-1/26) : References, Recursion, and Lists; SLLists, Nested Classes, Sentinel Nodes; DLLists, Arrays
	- Lists1
		- The Mystery of the Walrus
		- Primitive Types (8: byte, short, **int**, long, float, **double**, boolean, char)
		- Reference Types (everything else, including arrays, is a reference type)
		- Parameter Passing: passing parameters obeys the same rule: simply copy the bits to the new scope(passing by value)
		- Summary: there are 9 types of variables in Java: 8 primitive types and reference type.
		- Instantiating Arrays
			- Declaration and Instantiation of Arrays
	    - IntList and Linked Data Structures
	    	- IntList, IntList size(recursive method), IntList iterativeSize(no recursive method), More Exercises
	- Lists2: The SLList ("naked" linked lists like the IntList class are hard to use; SLList class acts as **a middle man between user and raw data structure**)
		-  Intro
		- Access Control: using `private` keyword
			- Why Restrict Access? Hide implementation details from users of your class.
				- Less for user of class to understand.
				- Safe for you to change private methods(implementation).
			- Car analogy: 
				- **Public**: Pedals, Steering Wheel; **Private**: Fuel line, Rotary valve.
			-  Despite the term 'access control':
				- Nothing to do with protection against hackers, spies, and other evil entities.
		- Nested Classes
			- static: if IntNode class never try to use its outer class stuff, then you can make IntNode static. 
		- Adding More SLList Functionally
			- .addLast(int x)
			- .size()
		- Caching: After implementing .addLast and .size, both of them are very slow. How to improve? Fast size()
			- Solution: Maintain a special size variable that caches the size of the list.
			- Caching: putting aside data to speed up retrieval. 
		- Sentinel Node (哨兵) : 去除特殊例子(比如 if x == null)的代码改进处理。
			- Notes:
				- I've renamed `first` to be sentinel; 
				- sentinel is never null, always points to sentinel node.
				- Sentinel node's item needs to be some integer, but doesn't matter what value we pick.
				- Had to fix constructors and methods to be compatible with sentinel nodes.
			- Bottom line: Having a sentinel simplifies our `addLast` method. 
		- Invariants(Invariants make it easier to reason about code)

|Methods|Non-Obvious Improvements|
|-----|----|
|addFirst(int x)|#1: Rebranding: IntList -> IntNode|
|getFirst| #2: Bureaucracy: SLList|
|addLast(int x)| #3: Access Control: public -> private|
|size()| #4: Nested Class: Bringing IntNode into SLList|
|| #5: Caching: Saving size as an int|
|| #6: Generalizing: Adding a sentinel node to allow representation of the empty list.|
|| #7: Looking back: .last and .prev allow fast removeLast (SLList -> DLList)|
|| #8: Sentinel upgrade: Avoiding special cases with sentBack or circular list. Fancier Sentinel Node(s)|

- How could we modify our list data structure so that addLast is also fast?
	- Lists3: The DLList **(Double Linked Lists)**: reverse pointers allow all operations (add, get, remove) to be fast.
		- DLList(Naive) -> DLList(Double Sentinel) (use for proj1) -> DLList(Circular Sentinel) (**proj1**)
		- Generic Lists
			- Java allows us to defer type selection until declaration.
			- In the .java file **implementing** your data structure, specify your "generic type" **only once** at the very top of the file.
			- In .java files that **use** your data structure, specify desired type **once**:
				- Write out desired type during **declaration**.
				- Use the empty diamond operator <> during **instantiation**.
			- When declaring or instantiating your data structure, use the **reference type**.
				- int: Integer
				- double: Double
				- char: Character
				- boolean: Boolean
				- long: Long		- Array-based Lists(ALists) Overview
			- Getting Memory Boxes
				- **Arrays** are a special kind of object which consists of a **numbered** sequence of memory boxes.
				- To get ith item of array A, use A[I];
				- Unlike **class** instances which have have **named** memory boxes.  
			- Arrays consist of:
				- A fixed integer **length** (cannot change!)
				- A sequence of N memory boxes where **N=length**, such that:
					- All of the boxes hold the same type of value (and have same # of bits).
					- The boxes are numbered 0 through length-1.
			- Unlike instances of classes:
				- You get one reference when its created.
				- If you reassign all variables containing that reference, you can never get the array back.
			- Unlike classes, arrays do not have methods. 
		- Basic Array Syntax
			-  Arraycopy: e.g.`System.arraycopy(b, 0, x, 3, 2)`:
				- Source array: b
				- Start position in source: 0
				- Target array: x
				- Start position in target: 3
				- Number to copy: 2
			- Arraycopy is faster, particularly for large array, and more compact to read. Arraycopy build a new array object.
		- 2D Arrays.
		-  **Arrays v.s. Classes** (Arrays and Classes can both be used to organize a bunch of memory boxes.)
			- Array boxes are accessed using [] notation.
			- Class boxes are accessed using dot notation.
			- Array boxes must all be of the same type.
			- Class boxes may be of different types.
			- **Both have a fixed number of boxes.**
			- Array indices can be computed at runtime.
			- Class member variable names CANNOT be computed and used at runtime. (The Java compiler does not treat text on either side of a dot as an expression, and thus it is not evaluated.)

- [x] Week 3 (1/29-2/2) : ALists, Resizing, vs. SLists; Testing; Inheritance, Implements.
	- Lists5: The AList (**Array-based List**)
		- Intro: Why do you want to build an Array-based List? Suppose we added `get(int i)`, if we use DList it is too slow. How can we fixed this? 
		- The Naive AList
			- Random Access in Arrays
				- Retrieval from any position of an array is very fast.
			- .RemoveLast: The Abstract vs. the Concrete
			- Resizing Arrays
			- Resizing Implementation
			- Basic Resizing Analysis: Runtime and Space Usage Analysis
			- Harder Resizing Analysis
			- Make AList Fast
			- Generic ALists
				- ```java 
					Glorp[] items = (Glorp []) new Object[8];
					```
	- Testing: A New Way (Using testing selection sort as an example)
	- Ad-Hoc Testing  (is Not Fun) v.s. (A Simple) JUnit Test
	- How Selection Sort Works
	- Find Smallest and the G
	- Swap
	- Revising Find Smallest
	- Recursive Array Helper
	- Debugging and Testing,
	- Reflections on the Pro
	- **Better JUnit** See slides!!
		- New Syntax #1: org.junit.Assert.assertEquals(expected, actual); 
		- New Syntax #2: @org.junit.Test (delete main method entirely, and go to run with two triangle icon)
		- New Syntax #3: import org.junit.Test; import static org.junit.Assert.*; 
	- Testing Philosophy 
	 ***Optional Reading!!!***
	- Inheritance1: The desire for generality
		- Method Overloading in Java: Java allows multiple methods with same name, but different parameters. (this is called method **overloading**, this is not great, but it works.)
	- Inheritance 1: Hypernyms, Hyponyms, and Interface Inheritance.
	- Inheritance 1: The Interface and Implements Keywords.
	- Inheritance 1: **Overriding** v.s. **Overloading**
		- Method Overriding: If a "subclass" has a method with the exact same signature as in the "superclass", we say the subclass **overrides** the method.
		-  Method Overloading: Methods with the same name but different signatures are **overloaded**
		- In 61b, we'll always mark every overriding method with the **@Override** annotation. The only effect of this tag is that the code won't compile if it is not actually an overriding method.
		- use **interface** instead of **class** 
	- Inheritance 1: Interface Inheritance
		- Specifying the capabilities of a subclass using the **implements** keyword is known as **Interface inheritance**
		- Interface: The list of all method signatures.
		- Inheritance: The subclass "inherits" the interface from a superclass.
		- Specifies what the subclass can do, but not how.
		- Subclasses **must** override all of these methods!
			- Will fail to compile otherwise.
	- Inheritance 1: Implementation Inheritance (another type of inheritance aside from Interface inheritance)
		- Interface inheritance: Subclass inherits signatures, but NOT implementation.
		- Implementation inheritance: Subclasses can inherit signatures AND implementation.
		- Use the **default** keyword to specify a method that subclasses should inherit from an **interface**. (Java 8 feature)
	- Inheritance 1: Overriding Default Methods
	- Inheritance 1: Dynamic Method Selection
		- Static Type v.s. Dynamic Type
			- Every variable in Java has a "compile-time type", a.k.a. "static type".
				- This is the type specified at **declaration**. Never changes!
			- Variables also have a "run-time", a.k.a. "dynamic type".
				- This is the type specified at **instantiation** (e.g. when using new).    
				- Equal to the type of the object being pointed at.
		- Dynamic Method Selection for Overridden Methods.
			- If dynamic type overrides the method, then the dynamic type's method is used instead.
	- Inheritance 1: More Dynamic Method Selection, Overloading v.s. Overriding 
```java
	public interface Animal {
		default void greet(Animal a) {
			print("hello animal"); }
		default void sniff(Animal a) {
			print("sniff animal"); }
		default void flatter(Animal a) {
			print("u r cool animal"); }	
	}	

	public class Dog implements Animal {
		void sniff(Animal a) {
			print("dog sniff animal"); }
		void flatter(Dog a) {
			print("u r cool dog") ; }
	}
```

```java
	Animal a = new Dog();
	Dog d = new Dog();
	a.greet(d); // "hello animal"
	a.sniff(d); // "dog sniff animal"
	d.flatter(d); // "u r cool dog"
	a.flatter(d); // "u r cool animal"
```


- - - **The way we define overriding is they have EXACT the same signature, so flatter example is overloading, not overriding.** 

	- Inheritance 1: Is a v.s. Has a, Interface v.s. Implementation Inheritance
		- Interface Inheritance (a.k.a. what)
			- Allows you to generalize code in a powerful, simple way.
		- Implementation Inheritance (a.k.a. how)
			- Allows code-reuse: Subclasses can rely on superclasses or interfaces.
				- Gives another dimension of control to subclass designers: Can decide whether or not to override default implementations.
		- The Dangers of Implementation Inheritance
			- Makes it harder to keep track of where something was actually implemented
			- Rules for resolving conflicts can be arcane.
				- Example: What if two interfaces both give conflicting default methods?
			- Encourages overly complex code
			- Breaks encapsulation! (see next week)


- [x] Week 4 (2/5-2/9) : Extends, Casting, Higher Order Functions; Subtype Polymorphism vs. HoFs; Libraries, Abstract Classes, Packages.
	- Inheritance 2: Implementation Inheritance: Extends keyword. Basic Use of Extends
		- When a class is a hyponym of an interface, we used **implements**
		- If you want one class to be a hyponym of another *class*(instead of an interface), you use **extends**.
		`public class RotatingSLList<Item> extends SLList<Item>`
		- Constructors are not inherited.
	- Inheritance 2: Extends with Overriding (Example VengefulSLList)
		- keyword `super ` call superclass's method.
	- Inheritance 2: **A Boring Constructor Gotcha**
		- If you want to use a super constructor other than the no-argument constructor, can give parameters to super. `super(x)`
	- Inheritance 2: The Object Class
	- Inheritance 2: Encapsulation
		- Some tools for managing complexity:
			- Hierarchical abstraction
				- Create "layers of abstraction", with clear abstraction barriers. 
			- "Design for change"  
				- Organize program around objects
				- Let objects decide how things are done.
				- **Hide information** others don't need. 
		- Modules and Encapsulation
			- Module: A set of methods that work together as a whole to perform some task or set of related tasks.
			- A module is said to be **encapsulated** if its implementation is completely hidden, and it can be accessed only through a documented interface.
		- A Cautionary Tale
	- Inheritance 2: Implementation Inheritance Breaks Encapsulation
	- Inheritance 2: Type Checking and Casting
		- Compile-Time Type Checking
			- Compiler allows method calls based on **compile-time** type of variable (following is SLList and VengefulSLList example)
				- sl's compile time type: SLList, runtime type: VengefulSLList
				- But cannot call printLostItems
			- Compiler also allows assignments based on compile-time types.(following is SLList and VengefulSLList example)
				- Even though sl's runtime type is VengefulSLList, cannot assign to vsl2.
				- Compiler plays it as safe as possible with type checking.
			```java
			public static void main(String[] args) {
				VengefulSLList<Integer> vsl = new VengefulSLList<Integer>(9);
				SLList<Integer> sl = vsl;
				sl.addLast(50);
				sl.removeLast();
				sl.printLostItems();  //Compilation errors!
				VengefulSLList<Integer> vsl2 = sl;  //Compilation errors!
				SLList<Integer> sl3 = new VengefulSLList<Integer>();  //OK
			```
			- A VengefulSLList is an SLList, so assignment is allowed, but an SLList is not necessarily a VengefulSLList, so compilation error results.
			- Casting: Java has a special syntax for forcing the compile-time type of any expression (useful but can be dangerous)
				- Put desired type in parenthesis before the expression.
				- Example:
					- Compile-time type *Dog*: `maxDog(frank, frankJr);`  
					- Compile-time type *Poodle*: `(Poodle) maxDog(frank, frankJr);`
	- Inheritance 2: Higher Order Functions in Java
		- **Higher Order Function**: A function that treats another function as data
		- **Example: Higher Order Function Using Interfaces**
		```python
			% python 
			def tenX(x):
				return 10*x
			def do_twice(f,x):
				return f(f(x))
			print(do_twice(tenX, 2))
		```
		```java
			/** java file 1 */
			public interface IntUnaryFunction {
				int apply(int x);
			}
		```
		```java
			/** java file 2 */
			public class TenX implements IntUnaryFunction {
				public static int TenX(int x) {
					return 10 * x;
				}
			}
		```
		```java
			/** java file 3 */
			public class HoFDemo {
				public static int do_twice(IntUnaryFunction f, int x) {
					return f.apply(f.apply(x));
					}
				public statc void main(String[] args) {
					IntUnaryFunction tenX = new TenX();
					do_twice(tenX, 2);
			}
		```
	- Implementation Inheritance Cheatsheet
		- VengefulSLList extends SLList means a VengefulSLLists is-an SLList. Inherits all members!
			- Variables, methods, nested classes.
			- Not constructors.
			- Subclass constructor must invoke superclass methods and constructors.
		- Invocation of overridden methods follows two simple rules:
			- Compiler plays it safe and only lets us do things allowed by **static** type.
			- For overridden methods the actual method invoked is based on **dynamic(does not appy to overloaded methods)** type of invoking expression, e.g. Dog.maxDog(d1, d2).bark();
			- Can use casting to overrule compiler type checking.  

	- Inheritance 3 - 4: 写到Packages部分网页崩了。没保存。我哭了。  
	- Inheritance 4: Packages
		- The Zen of Python: 
			- Explicit is better than implicit
			- Namespaces are one honking great idea -- let's do more of those!
		- Canonicalization
			- Canonical representation: A unique representation for a thing.
			- In Java, we provide canonicity through by giving every a class a "package name".
				- A package is a **namespace** that organizes classes and interfaces.
				- Naming convention: Package name starts with website address(backwards).
			- Importing Classes: Can use import statement to provide shorthand notation for usages of a single class in a package.
			 ```java
			 import ug.joshh.animal.Dog;
			 Dog d = new Dog(...);
			 ```
			- Wildcard import: Also possible to import multiple classes, but this is often a bad idea!

- [x] Week 5 (2/5-2/9) : Coding in the Real World, Review, Generics, Autoboxing, Exceptions, Iterators, Iterables
	- Syntax 1: Autoboxing, promotion, immutability, generics;
	- Syntax 2: Exceptions, access control;
	- Syntax 3: Iterables/iterators, equals, other loose ends;
	- Syntax 4 (optional): Wildcards, type upper bounds, covariance (not in the scope of the class)
	- Syntax 1: Autoboxing and Unboxing
		- Generics
		- Autoboxing (auto-unboxing): Implicit conversions between wrapper/primitives
		- Wrapper types and primitives can be used almost interchangeably.
			- If Java code expects a wrapper type and gets a primitive, it is auto boxed.
			- If the code expects a primitive and gets a wrapper, it is unboxed.
		- Some notes:
			- Arrays are never autonoxed/unboxed, e.g. an Integer[] cannot be used in place of an int[] (or vice versa).
			- Autoboxing/unboxing incurs a measurable performance impact!
			- Wrapper types use MUCH more memory than primitive types.
	- Syntax 1: Widening
		- Another Type of Conversion: Primitive Widening
			- A similar thing happens when moving from a primitive type with a narrower range to a wider range.
			- To move from a wider type to a narrower type, must use casting.
	- Syntax 1: Immutability
		- Immutable Data Types
			- An immutable data type is one for which an instance cannot change in any observable way after instantiation.
			- Examples:
				- Mutable: ArrayDeque, Planet
				- Immutable: Integer, String, Date. 
			- The ***final*** keyword will help the compiler ensure immutability.
				- final variable means you will assign a value once (either in constructor of class or in initializer).
				- Not necessary to have final to be immutable (e.g. Dog with private variables)
			- Immutability
				- Advantage: Less to think about: Avoids bugs and makes debugging easier.
				- Warning: Declaring a reference as **Final** does not make object immutable.  
	- Syntax 1: ArrayMap Implementation
		- Goals: 
			- Goal 1: Create a class ArrayMap with the following methods
				- put(key, value): Associate key with value;
				- containsKey(key): Checks to see if ArrayMap contains the key.
				- get(key): Returns value, assuming key exists.
				- keys(): Returns a list of all keys.
				- size(): Returns number of keys.
	- Syntax 1: Reflection on ArrayMap and Automatic Conversion Puzzle
		- Array implementation of a Map:
			- Use an array as the core data structure.
			- put(k, v): Finds the array index of k
				- if -1, add k and v to the last position of arrays.
				- if non-negative, sets the appropriate item in values array.  
		- A mysterious error:
		```java
		@Test
		public void test() {
			ArrayMap<Integer, Integer> am = new ArrayMap<Interger, Integer>();
			am.put(2, 5);
			int expected = 5;
			assertEquals(expected, am.get(2));
		}. 
		/**
		 * the actual call is: assertEquals(int, Integer)
		 * So we need to: assertEquals(long, long)
		 * Step1: Widen expected to long
		 * Step2: Unbox am.get(2)
		 * Step3: Widen the unboxed am.get(2) to long.
		 * Or assertEquals(Object, Object)
		 * Step: Autobox "expected" into an Integer (**However, it is ambiguous and won't complie**)
		 * Or casting
		 * assertEquals( (Integer) expected, am.get(2)); (**works!**)
		 */
		```
	- Syntax 1: **Generic Methods**
		- Goal: Create a class MapHelper with two methods
			- get(Map61B, key): Returns the value corresponding to the given key in the map if it exists, otherwise null;
				- Unlike the ArrayMap's get method, which crashes if the key doesn't exist.
			- maxKey(Map61B): Returns the maximum of all keys in the given ArrayMap. Works only if keys can be compared.
			```java
			public static <K, V> V get(Map61B<K, V> sim, K key) { ... }
			```
		- Can create a method that operates on generic types by defining type parameters before the return type of the method
		- In almost all circumstances, using a generic methods requires no special syntax.
		  ```java
			public static <K extends Comparable<K>, V> K maxKey(Map61B<K, V> map) {
				List<K> keylist = map.keys();
				K largest = keylist.get(0);
				for (K k : keylist) {
					if (k.compareTo(largest) > 0) {. // you cannot say "if (k > largest) because only numericla primitives can be compared with >; New problem: K's don't necessarily have a compareTo methods"
						largest = k;
					}
				}
				return largest;
			}
			```
	- Syntax 1: Type Upper Bounds
		- Can use extends keyword as a **type upper bound**. Comparable<T>
	- Syntax 1: Generics Summary
		 - We've seen four new features of Java that makes Generics more powerful
		 	- Autoboxing and auto-unboxing of primitive wrapper types.
		 	- Promotion between primitive types.
		 	- Specification of generic types for methods (before return type).
		 	- Type upper bounds (e.g. K extends Comparable<K>).
		 	- In syntax4, you can also see another feature called "wildcards".
		 - A true understanding of Java generics takes a long time and lots of practice.
		 	- You won't know all the details by the end of 61B.
	- Syntax 2: Throwing Exceptions
		- Exceptions
			- Basic idea: When something goes really wrong, break the normal flow of control. So far, we've only seen implicit exceptions. We can also throw our own exceptions using the **throw** keyword.
			- **throw** keyword.
				- Can provide more informative message to a user.
				- Can provide more information to some sort of error handling code.
	- Syntax 2: Catching Exceptions
		- Handling Errors
		- What has been Thrown, can be Caught
			- So far, thrown exceptions cause code to crash.
				- Can 'catch' exceptions instead, preventing program from crashing. Use keywords ***try*** and ***catch*** to break normal flow.
		- Can take Corrective Action in Catch Blocks
			- Catch blocks can execute arbitrary code.
				- May include corrective action.
	- Syntax 2: The Philosophy of Exceptions. Why Exceptions?
	- Syntax 2: Uncaught Exceptions
		- Exceptions and the Call Stack 
			- When an exception is thrown, it descends the call stack;
				- If exceptions reaches the bottom of the stack, the progarm crashes and Java provides a message for the user.
					- Ideally the user is a programmer with the power to do something about it.   
	- Syntax 2: Checked vs Unchecked Exceptions
		- "unreported exception: Must be Caught or Declared to be Thrown"
			- "checked" exceptions(or "must be checked exceptions"): some exceptions are considered so disgusting by the compiler that you MUST handle them somehow.
		- **checked** exceptions
			- compiler requires that these be "caught" or "specified"
				- goal: disallow compilation to prevent avoidable program crashes.
		- Checked vs. Unchecked Exceptions
			- Any subclass of **RuntimeException** or **Error** is *unchecked*, all other Throwables are *checked*.
		- Checking Exceptions
			- Compiler requires that all checked exceptions be **caught** or **specified**.
				- Catch: Use a catch block after potential exception.
				- Specify method as dangerous with **throws** keyword.
					- Defers to someone else to handle exception. 
				```java
				public static void gulgate() throws IOException {
					... throw new IOException("hi");...
				}
				```
			- If a method uses a 'dangerous' method, it becomes dangerous itself. (catch or specify the exception)
	- Syntax 2: Iteration Intro
		- The Enhanced For Loop
		- Doing Things The Hard Way
			- An alternate, uglier way to iterate through a List is to use the iterator() method.   
	- Syntax 2: Implementing Iterators
		- The Iterable Interface
			- Compiler checks that Lists have a method called iterator() that returns an Iterator\<Integer\>.
				- **How**: The List interface extends the Iterable interface, inheriting teh abstract iterator() method*. (Actually List extends Collection which extends Iterable, but this is close enough to the truth.)
			- Then, compiler checks that Iterators have hasNext and next()
				- **How**: The Iterator interface specifies these abstract methods explicitly.
		- For-each Iteration And ArrayMaps
			- To support the enhanced for loop, we need to make ArrayMap implement the Iterable intreface.
			-  To complete our task, simply make KeyIterator extend(implements) Iterator.
		- Syntax 3: Creating IntelliJ Projects
		- Syntax 3: Packages in IntelliJ
			- Packages
				- To address the fact that classes might share names:
					- A package is a ***namespace*** that organizes classes and interfaces.
					- Naming convention: Package name starts with website address (backwards).
					- If used from the outside, use entire ***canonical name***.
					- If used from another class in same package, can just use ***simple name***.
			- Creating a Package
				- Two Steps:
					- At the top of every file in the package, put the package name.
					- Make sure that the file is stored in a folder with the appropriate folder name. For a package with name ug.joshh.animal, use folder ug/joshh/animal.
			- Using a Package
				- We can use the canonical name.
				- Or we can use the simple name by using an import statement.
			- Any Java class without a package name at the top are part of the "default" package. As Stack Overflow user Dan Dyer wisely puts it:"You should avoid using the default package except for very small example programs."
				- In other words, from now on, when writing real programs, your Java files should always start with a package declaration.
				- Idea: Ensure that we never have two classes with the same name.
			- Note: you cannot import code from the default package!
				- No way that anything in the ug.joshh.animal package could ever use DogLauncher(which is in the default package).
			- Moving a Class into Packages.
		- Syntax 3: JAR Files
			- Suppose you've written a program that you want to **share**.
				- Sharing dozens of .class files in special directories is annoying.
				- Can instead share a single .jar file that contains all of your .class files.
					- JAR files are really just zip files, but with some extra info added.
			- Build Systems.
				- To avoid the need to import a bunch of libraries, put files into the appropriate place, and so forth, there exist a number of "Build Systems".(Ant, Maven, Gradle(ascendant)). Useful for large team and projects.     
		- Syntax 3: Access Modifiers
			- Access Control with Inheritance and Packages

|Modifier|Class|Package|Subclass|World
|-----|----|----|----|----|
|public|Y|Y|Y|Y|
|protected|Y|Y|Y|N|
|(put no keyword at all, called package private)|Y|Y|N|N|
|private|Y|N|N|N|
___
- Syntax 3: Access Modifier Questions
	- A Point to Ponder
		- Why are package members considered more secret than subclass members?
		- Answer: reflects the way people work.
			- Extending classes you didn't write is common.
			- Packages are typically modified only by a specified team of humans.
		 
- Syntax 3: Access Control Subtleties
	- The Default Package
		- code without a package label is part of an unnamed package, a.k.a. the "default package".
		- code don't have any access modifiers or package names?
			- everything is package-private.
			- everything is part of the same (unnamed) default package.  
	- **Access Is Based Only on Static Types**
		- ```java
		   package universe;
		   public interface BlackHole {
		   		void add(Object x);
		   	}
		   	```
		   	add might look package-private, but actually public!!! Because in interface, if you don't say, then it is public.
	- Access Control at the Top Level(entire interface or class) 
	- Summary
		- ***private*** declarations are parts of the implementation of a class that only that class needs.
		- *package-private* declarations are parts of the implementation of a package that other members of the package will need to complete the implementation.
		- ***protected*** declarations are things that subtypes might need, but subtype clients will not.
		- ***public*** declarations are declarations of the specification for the package, i.e. what *clients* of the package can rely on. Once deployed, these should not change. 
- Syntax 3: Object Methods
	- Objects (All classes are hyponyms of Object)
		- String toString() 
		- boolean equals(Object obj)
		- Class<?> getClass()
		- int hashCode()
		- ... 
	- toString()
		- If you want to custom String representation of an object, create a toString() method.
	- Equals vs. ==
		- == and .equals() behave differently
		- == checks that two variables reference the same object (compare bits in boxes)
		- To test equality in the sense we usually mean it, use:
			- Array.equal or Array.deepEquals for arrays
			- .equals for classes. Requires writing a .equals methods for your classes
				- Default implementation of .equals uses == (probably not what you want).   
		- Equals Method for Date
			- Rules for equals() are simple, but implementation is trickier than you might expect.
			- null check; class check; equal check.
	- Rules for Equals in Java
		- Java convention is that equals must be an equivalence relation:
			- Reflexive: x.equals(x) is true;
			- Symmetric: x.equals(y) is true iff y.equals(x);
			- Transitive: x.equals(y) and y.equals(z) implies x.equals(z);
		- Must also:
			- Take an Object argument
			- Be consistent: If x.equals(y), then x must continue to equal y as long as neither changes.
			- Never true for null.
- The Future
	- We'll expect you to start finding the syntax and built-in libraries you need, with tips in the HW/Projects for the trickier stuff. Don't use fancy external libraries like Apache Commons!
	- Weeks 7 - 14
		- Lectures: Data Structures and Algorithms
		- Week 7: Project 2"Adavanced Programming"
		- Weeks 8 - 14:
			- Labs: Implement data structures
			- HWs: Apply data structures algorithms.
			- Project 3: Efficiency oriented programming.            

