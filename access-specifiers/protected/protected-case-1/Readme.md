# protected keyword in java

* Reserved for access level specification 

## github location for examples

* https://github.com/jk-boot-up/java-workpad

* Navigate to -> access-specifiers -> protected -> protected-case-1

## Build tools

* Maven

* Gradle

## Prerequisites for Running code
* Java 8+
* Maven 3+ or Gradle
* Any IDE like Intellij or Eclipse


## How to build with maven 

* Navigate to _protected-case-1_ folder in terminal
* Execute the following maven command

      mvn clean install

## Java docs for protected keyword

* protected fields/classes/methods/constructors can be accessed 
   
     - Within the same class
     - From any class within the same package
     - From any subclass

* https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html

## Access Table

| Modifier	  | Class	| Package	| Subclass	| World |
|------------|-------|-----------|-----------|-------|
| protected	 |Y|	Y	|Y| 	N    |

