## Chapter 1 Java Programming Basics
---
### 1.1 Getting Started: Classes, Types, and Objects
The main "actors" in a Java program are **objects**. Objects store data and provide methods for accessing and modifying this data. Every object is an instance of a **class**, which defines the **type** of the object, as well as the kinds of operations that it performs. The critical **members** of a class in Java are the following (classes can also contain inner class definitions, but let us defer discussing this concept for now):
- Data of Java objects are stored in instance **variables** (also called **fields**). Therefore, *if an object from some class is to store data, its class must specify the instance variables for such objects*. Instance variables can either come from base types (such as **integers**, **floating-point numbers**, or **Booleans**) or they can refer to objects of other classes.
- The operations that can act on data, expressing the "messages" objects respond to, are called **methods**, and these consist of **constructors**, **procedures**, and **functions**. They define the behavior of objects from that class. 

#### How Classes Are Declared 
**An object** is a specific combination of **data** and the **methods** that can _process_ and _communicate_ that data.
Classes define the _types_ for objects.
Objects are sometimes referred to as instances of their defining class, because they take on the __name of that class as their type__. 

**An example definition of a Java class**
```java
public class Counter{
    protected int count; // a simple integer instance variable
    /** The default constructor for a Counter object*/
    Counter(){
        count = 0;
    }

    /** An accessor method to get the current count*/
    public int getCount(){
        return count;
    }

    /** A modifier method for incrementing the count*/
    public void incrementCount(){
        count++;
    }
}

```

In this example, notice that the class definition is delimited by braces, that is, it begins with a __{__ and ends with a __}__. In Java, any set of statements between the braces __{__ and __}__ define a program _block_.

The _name_ of a class, method, or variable in Java is called an _identifier_, which can be any string of characters as long as it begins with a letter and consists of letters, numbers, and underscore characters.

**Class Modifiers**
Class modifiers are optional keywords that _precede_ the class keyword. In general, the different class modifiers and their meaning is as follows:
-  The __abstract class__ modifier describes a class that has __abstract methods__. Abstract methods are declared with the __abstract keyword__ and are __empty__ (that is, they have no block defining a body of code for this method). A class that has nothing but abstract methods and no instance variables is more properly called an __interface__, so an abstract class usually has a mixture of abstract methods and actual methods. 
- The __final class__ modifier describes a class that can have no subclasses.
- The __public class__ modifier describes a class that can be _instantiated_ or _extended_ by anything in the same package or by anything that __imports__ the class. Public classes are declared in their own separate file called _classname_. java, where "classname" is the
name of the class.
- If the __public class__ modifier is _not used_, the class is considered __friendly__. This means that it can be used and instantiated by all classes in the same package. This is the default class modifier.

#### 1.1.1 Base Types (primitive types)
- boolean
- char
- byte
- short
- int
- long
- float
- double

#### 1.1.2 Objects 
In Java, a new object is created from a defined class by using the __new__ operator. The __new__ operator creates a new object from a specified class and returns a reference to that object. In order to create a new object of a certain type, we must immediately follow our use of the new operator by a call to a constructor for that type of object. We can use any constructor that is included in the class definition, including the default constructor.

Calling the __new__ operator on a class type causes three events to occur:
- A new object is dynamically allocated in memory, and all instance
variables are initialized to standard default values. The default values are null for object variables and 0 for all base types except _boolean_ variables (which are _false_ by default).
- The constructor for the new object is called with the parameters specified. The constructor fills in meaningful values for the instance variables and performs any additional computations that must be done to create this object.
- After the constructor returns, the new operator returns a reference (that is, a memory address) to the newly created object. If the expression is in the form of an assignment statement, then this address is stored in the object variable, so the object variable __refers__ to this newly created object. 

**Object References**
As mentioned above, creating a new object involves the use of the __new__ operator to allocate the object's memory space and use the object's constructor to initialize this space. The location, or __address__, of this space is then typically assigned to a __reference variable__. Therefore, a reference variable can be viewed as a "pointer" to some object. It is as if the variable is a holder for a remote control that can be used to control the newly created object (the device). That is, the variable has a way of pointing at the object and asking it to do things or give us access to its data. 

**Variable Modifiers**
In some cases, we may not be allowed to directly access some of the instance variables for an object. For example, an instance variable declared as __private__ in some class is only accessible by the methods defined inside that class. 

The __scope__ (or visibility) of instance variables can be controlled through the use of the following variable modifiers:
-  __public__: Anyone can access public instance variables.
- __protected__: Only methods of the _same package_ or of its subclasses can access protected instance variables.
- __private__: Only methods of the same class (not methods of a subclass) can
access private instance variables.
- If none of the above modifiers are used, the instance variable is considered _friendly_. Friendly instance variables can be accessed by any class in the same package.
- __static__: The static keyword is used to declare a variable that is associated with the class, not with individual instances of that class. Static variables are used to store "global" information about a class (for example, a static variable could be used to maintain the total number of Gnome objects created). Static variables exist even if no instance of their class is created.
• __final__: A final instance variable is one that must be assigned an initial
value, and then can never be assigned a new value after that. If it is a base type, then it is a constant (like the MAX_HEIGHT constant in the Gnome class). If an object variable is final, then it will always refer to the same object (even if that object changes its internal state). 

### 1.2 Methods
Every method in Java is specified in the body of some class. A method definition has two parts: the _signature_, which defines the and parameters for a method, and the _body_, which defines what the method does.

**Declaring Methods**
The syntax for defining a method is as follows: 
```java
modifiers type name(type0 parameter0, …, typen−1 parametern−1) {
    // method body …
} 
```
The __modifiers__ part includes the same kinds of scope modifiers that can be used for variables, such as __public__, __protected__, and __static__, with similar meanings.
The __type__ part of the declaration defines the return type of the method.
The __name__ part is the name of the method, which can be any valid Java identifier.
The list of parameters and their types declares the local variables that correspond to the values that are to be passed as arguments to this method. Each type declaration _typei_ can be any Java type name and each parameteri can be any Java identifier. This list of parameters and their types can be empty, which signifies that there are no values to be passed to this method when it is invoked. These parameter variables, as well as the instance variables of the class, can be used inside the body of the method. Likewise, other methods of this class _can be called from inside_ the body of a method.

**Method Modifiers**
As with instance variables, method modifiers can restrict the scope of a method:
- __public__: Anyone can call public methods.
- __protected__: Only methods of the same package or of subclasses can call a
protected method.
- __private__: Only methods of the same class (not methods of a subclass) can
call a private method.
- If none of the modifiers above are used, then the method is __friendly__.
Friendly methods can only be called by objects of classes in the same package.
- __abstract__: A method declared as abstract has _no code_. The signature of
such a method is followed by a semicolon with no method body.
- __final__: This is a method that _cannot be overridden_ by a subclass.
- __static__: This is a method that is associated with the class itself, and not with a particular instance of the class. Static methods can also be used to change the state of static variables associated with a class (provided these variables are not declared to be final).'

### 1.4 Control Flow
#### 1.4.1 The If and Switch Statements 

The syntax of a simple if statement is as follows: 
```java
if (first_boolean_exp)
    true_statement
else if (second_boolean_exp)
    second_true_statement
else
    false_statement
```

#### 1.4.2 Loops 
**While Loops**
The simplest kind of loop in Java is a __while__ loop. Such a loop tests that a certain condition is satisfied and will perform the body of the loop each time this condition is evaluated to be __true__. The syntax for such a conditional test before a loop body is executed is as follows: 
```java
while (boolean_exp)
    loop_statement
```

**For Loops**
Another kind of loop is thefor loop. In their simplest form, for loops provide
for repeated code based on an integer index. In Java, we can do that and much
more. The functionality of a for loop is significantly more flexible. In particular, the usage of a for loop is split into _four_ sections: the initialization, the condition, the increment, and the body.

Defining a For Loop:

```java
for (initialization; condition; increment)
    loop_statement
```
where each of the sections initialization, condition, and increment can be empty.

### 1.5 Arrays
A common programming task is to keep track of a numbered group of related objects.
An array is anumbered collection of variables all of the same type. Each variable, or cell, in an array has an index, which uniquely refers to the value stored in that cell. The cells of an array a are numbered 0, 1,2, and so on.

**Array Elements and Capacities**
Each object stored in an array is called an element of that array. Element number 0 is a[0], element number 1 is a[1], element number 2 is a[2], and so on. Since the length of an array determines the maximum number of things that can be stored in the array, we will sometimes refer to the length of an array as its __capacity__.

**Out of Bounds Errors**
It is a dangerous mistake to attempt to index into an array a using a number outside
the range from 0 to a.length &minus; 1. Such a reference is said to be out of
bounds. Out of bounds references have been exploited numerous times by hackers
using a method called the buffer overflow attack to compromise the security of
computer systems written in languages other than Java. As a safety feature, array indices are always checked in Java to see if they are ever out of bounds. If an array index is out of bounds, the run-time Java environment signals an error condition. The name of this condition is the _ArrayIndexOutOfBoundsException_. This check helps Java avoid a number of security problems (including _buffer overflow attacks_) that other languages must cope with.
We can avoid out-of-bounds errors by making sure that we alway index into an
array, a, _using an integer value between 0 and a.length_. One shorthand way we
can do this is by carefully using the early termination feature of Boolean operations in Java. For example, a statement like the following will never generate an index out-of-bounds error: 

```java
if ((i >= 0) && (i < a.length) && (a[i] > 2) )
    × = a[i];
```

#### 1.5.1 Declaring Arrays 
#### 1.5.2 Arrays are Objects 
The fact that arrays in Java are objects has an important implication when it comes to using array names in assignment statements. For when we write something like 
```java
arrayB = arrayA;
```
in a Java program, we really mean that _b and a now both refer_ to the same array.

**Cloning an Array**
If instead, we wanted to create an exact copy of the array, a, and assign that array to the array variable, b, we should write 
```java
b= a.clone();
```
which copies all of the cells of a into a new array and assigns b to point to that new array. 

### 1.6 Simple Input and Output
**Simple Output Methods**

Java provides a built-in static object, called __System.out__, that performs output to the "standard output" device. Most operating system shells allow users to redirect standard output to files or even as input to other programs, but the default output is to the Java console window. The System.out object is an instance of the _java.io.PrintStream class_.
An Output Example
```java
System.out.print("Hello world!");
System.out.print(3.1415);
System.out.print(',');
System.out.print(15);
```

**Simple Input Using the java.util.Scanner Class**

The __System.in__ object is an object associated with the standard
input device. A simple way of reading input with this object is to use it to create a Scanner object, using the expression
```java
new Scanner(System.in)
```
The __Scanner__ class has a number of convenient included methods that read from
the given input stream.
For example, the following program uses a Scanner object
to process input: 
```java
import java.io.*;
import java.util.Scanner;
public class InputExample {
    public static void main(String args[]) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        float height = s.nextFloat();
        System.out.print("Enter your weight in kilograms: ");
        float weight = s.nextFloat();
        float bmi = weight/(height*height)*10000;
        System.out.println("Your body mass index is " + bmi + ".");
    }
}
```

**java.util.Scanner Methods**

The __Scanner__ class reads the input stream and divides it into __tokens__, which are _contiguous strings_ of characters separated by __delimiters__, which are separating characters. 

The Scanner class includes the following methods for dealing with tokens: 
- __hasNext()__: Return true if and only if there is another token in the input
stream.
- __next()__: Return the next token string in the input stream; generate an error if there are no more tokens left.
- __hasNext*Type()*__: Return true if and only if there is another token in the input stream and it can be interpreted as the corresponding base type, Type, where Type can be Boolean, Byte, Double, Float, Int, Long, or Short.
- __nextType()__: Return the next token in the input stream, returned as the base type corresponding to Type; generate an error if there are no more tokens left or if the next token cannot be interpreted as a base type corresponding to Type. 

Additionally, Scanner objects can process input line by line, ignoring delimiters,
and even look for patterns within lines while doing so. The methods for processing
input in this way include the following:
- __hasNextLine()__: Returns true if and only if the input stream has another
line of text.
- __nextLine()__: Advances the input past the current line ending and returns
the input that was skipped.
- __findInLine(String s)__: Attempts to find a string matching the (regular
expression) pattern _s_ in the current line. If the pattern is found, it is returned and the scanner advances to the first character after this match. If the pattern is not found, the scanner returns null and doesn't advance. 

### 1.7 Writing a Java Program
The process of writing a Java program involves three fundamental steps:
1. Design
2. Coding
3. Testing and Debugging. 

#### 1.9.1 Design 
The design step is perhaps the most important step in the process of writing a
program. For it is in the design step that we decide how to divide the workings of our program into classes, we decide how these classes will interact, what data each will store, and what actions each will perform.

There are some general rules of thumb that we can apply when determining how to define our classes: 
- __Responsibilities__: Divide the work into different __actors__, each with a
different responsibility. Try to _describe responsibilities using action verbs_. These actors will form the classes for the program. 
- __Independence__: Define the work for each class to be as independent from
other classes as possible. _Subdivide_ responsibilities between classes so that each class has _autonomy_ over some aspect of the program. Give data (as instance variables) to the class that has _jurisdiction_ over the actions that require access to this data. 
- __Behaviors__: So that the _consequences_ of each action performed by a class will be well understood by other classes that _interact_ with it, define the behaviors for each class _carefully and precisely_. These behaviors will _define the methods_ that this class performs. The set of behaviors for a class is _sometimes referred_ to as a protocol, for we expect the behaviors for a class to hold together as a cohesive unit.

#### 1.9.2 Pseudo-Code 
Pseudo-code is not a computer program, but is more structured than usual
prose. Pseudo-code is a mixture of _natural language_ and _high-level programming constructs_ that describe the _main ideas_ behind a generic implementation of a d_ata structure or algorithm_. 

#### 1.9.3 Coding 
**Javadoc**
In order to encourage good use of block comments and the automatic production
of documentation, the Java programming environment comes with a
documentation production program called _javadoc_. This program takes a
collection of Java source files that have been commented using certain keywords, called __tags__, and it produces a series of HTML documents that describe the classes, methods, variables, and constants contained in these files. 

**Readability and Style**
