## Chapter 2 Object-Oriented Design 

### 2.1 Goals, Principles, and Patterns
#### 2.1.1 Object-Oriented Design Goals 
Software implementations should achieve __robustness, adaptability, and reusability__.
#### 2.1.2 Object-Oriented Design Principles 

**Abstraction**

The notion of abstraction is to _distill_ a complicated system down to its most fundamental parts and describe these parts in a simple, precise language. 

Typically, describing the parts of a system involves naming them and explaining their functionality. Applying the abstraction paradigm to the design of data structures gives rise to _abstract data types_ (__ADTs__).

An ADT is a mathematical model of a data structure that specifies the type of data stored, the operations supported on them, and the types of parameters of the operations. An ADT specifies __what__ each operation does, but not __how__ it does it.

In Java, an ADT can be expressed by an __interface__, which is simply a list of method declarations, where each method has an empty body.

**Encapsulation**

Another important principle of object-oriented design is the concept of
encapsulation, which states that different components of a software system
should not reveal the internal details of their respective implementations. 

**Modularity**
Modularity refers to an organizing principle for code in which different components of a software system are divided into separate functional units. 

#### 2.1.3 Design Patterns 

### 2.2 Inheritance and Polymorphism
