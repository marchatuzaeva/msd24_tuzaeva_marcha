# Variables in Java
![alt text](https://litslink.com/wp-content/uploads/2020/11/what-is-java-image.png)
In Java, [variables](https://www.w3schools.com/java/java_variables.asp) are named containers used to store data that can be manipulated during the program's execution. Variables have three essential components: a type, a name, and an optional initial value. 

## Types of Variables in Java
### Local Variables:
* Declared inside methods, constructors, or blocks.
* Only accessible within the scope in which they are defined.
* Must be initialized before use, as they don't have default values.

### Instance Variables:
* Declared inside a class, but outside any method or constructor.
* Associated with objects, meaning each object has its own copy.
* Have default values (e.g., 0 for integers, null for objects).

### Static Variables:
* Declared with the static keyword inside a class.
* Shared among all instances of the class (only one copy exists, regardless of how many objects are created).
* Useful for constants or class-level data.