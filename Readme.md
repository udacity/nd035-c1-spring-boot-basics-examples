## Java Web Developer Nanodegree - Course 2 - Spring Boot Basics
This repository contains the following for the 
[Java Web Developer Nanodegree - Course 2 - Spring Boot Basics](https://www.udacity.com/course/java-developer-nanodegree--nd035)
1. Exercises, 
2. Corresponding solutions, and 
3. The code snippets demonstrated in the classroom

### Lesson and Exercise Naming Conventions
The lesson and exercise numbers start from 0, just like it does in array-indexes. For example:
1. The exercise solution directory named `udacity-jwdnd-c1-l1-final-review-solution-master` is associated with the **final-review** exercise present in course 2, lesson 2 in the classroom. 

1. The exercise solution directory named `udacity-jwdnd-c1-l5-junit-and-selenium-master` is associated with the **junit-and-selenium** concept present in course 2, lesson 6 in the classroom. 

1. The `udacity-jwdnd-c1-snippets-master` directory contains the code snippets demonstrated in the classroom. 


Below is the mapping of folders in the current repository versus the classroom pages:

|Lesson| Classroom page name|Mapped folder in the current repository|
|:-----|:-----|:-----|
|Lesson 2|Solution: Final Review|[udacity-jwdnd-c1-l1-final-review-solution-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l1-final-review-solution-master)|
|Lesson 3|Solution: Final Review|[udacity-jwdnd-c1-l2-final-review-solution-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l2-final-review-solution-master)|
|Lesson 3|Server-Wide Configuration|[udacity-jwdnd-c1-l2-server-config-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l2-server-config-master)|
|Lesson 3|Spring Boot IoC Configuration|[udacity-jwdnd-c1-l2-spring-ioc-config-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l2-spring-ioc-config-master)|
|Lesson 4|Connecting Controllers (video #1)|[udacity-jwdnd-c1-l3-connecting-controllers-1-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l3-connecting-controllers-1-master)|
|Lesson 4|Connecting Controllers (video #2)|[udacity-jwdnd-c1-l3-connecting-controllers-2-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l3-connecting-controllers-2-master)|
|Lesson 4|Solution: Final Review|[udacity-jwdnd-c1-l3-final-review-solution-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l3-final-review-solution-master)|
|Lesson 4|HTML Templates|[udacity-jwdnd-c1-l3-html-templates-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l3-html-templates-master)|
|Lesson 4|MVC and You (video #1)|[udacity-jwdnd-c1-l3-mvc-and-you-1-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l3-mvc-and-you-1-master)|
|Lesson 4|MVC and You (video #2)|[udacity-jwdnd-c1-l3-mvc-and-you-2-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l3-mvc-and-you-2-master)|
|Lesson 5|Solution: Final Review|[udacity-jwdnd-c1-l4-final-review-solution-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l4-final-review-solution-master)|
|Lesson 5|User Authentication|[udacity-jwdnd-c1-l4-spring-security-basics-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l4-spring-security-basics-master)|
|Lesson 6|Testing with JUnit|[udacity-jwdnd-c1-l4-testing-with-junit-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l4-testing-with-junit-master)|
|Lesson 6|Solution: Final Review|[udacity-jwdnd-c1-l5-final-review-solution-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l5-final-review-solution-master)|
|Lesson 6|JUnit and Selenium|[udacity-jwdnd-c1-l5-junit-and-selenium-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l5-junit-and-selenium-master)|
|Lesson 6|JUnit in Situ|[udacity-jwdnd-c1-l5-junit-in-situ-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l5-junit-in-situ-master)|
|Lesson 6|[Selenium/WebDriver|[udacity-jwdnd-c1-l5-selenium-webdriver-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-l5-selenium-webdriver-master)|
|All lessons|Remaining demonstration videos |[udacity-jwdnd-c1-snippets-master](https://github.com/udacity/nd035-c1-spring-boot-basics-examples/tree/master/udacity-jwdnd-c1-snippets-master)|



### Dependencies
1. IntelliJ IDEA as the preferred IDE. 
2. Java 14 or higher - The current Java version in the `pom.xml` file is 14. However, you can upgrade to Java 15, as the soruce code does not uses any deprecated libraries/functions. If you have already downloaded the Java 15 in your system, follow the steps mentioned below:
 * Update the Java version in the `pom.xml` file. It will automatically update the `maven-compiler-plugin`. 
 ![alt text]( https://github.com/udacity/nd035-c1-spring-boot-basics-examples/blob/master/images/pom.png?raw=true)

 * Update the Java version in IntelliJ IDEA &#8594; File &#8594; Project Structure...
  ![alt text]( https://github.com/udacity/nd035-c1-spring-boot-basics-examples/blob/master/images/Project_Structure.png?Pro=true)

 * Update the Java version in the IntelliJ IDEA &#8594; Preferences...
 ![alt text]( https://github.com/udacity/nd035-c1-spring-boot-basics-examples/blob/master/images/Preferences.png?raw=true)

