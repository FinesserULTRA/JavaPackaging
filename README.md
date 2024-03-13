# JavaPackaging

This repository contains the assignments and a tutorial structure for Java Packaging.

## Assignment Structure

The repository is organized as follows:

- `Assignment`: Main folder
    - `Question1`: Contains the code for Question 1.
        - `src/utils`: Contains utility classes required for Question 1.
        - `Main.java`: Entry point for Question 1.

    - `Question2`: Contains the code for Question 2.
        - `src/utils`: Contains utility classes required for Question 2.
        - `Main.java`: Entry point for Question 2.

## Explanations

### Packaging

Packaging is the process of grouping related classes, interfaces, enumerations, and annotations together. It helps in organizing the code and makes it easier to manage and maintain.

In Java, packaging is done using the `package` keyword at the beginning of the source file. The package statement should be the first statement in the source file and should match the directory structure of the source file.

For example, if a class is in the package `src.utils`, its source file should be in the directory `src.utils`.

### To package

```java
package src.utils; // inside the source file, e.g src/utils/MyClass.java
```

### To Import

To use a package, we need to import it using the `import` keyword. For example:

```java
import src.utils.MyClass;
// or
import src.utils.*; // for all classes in the package
```
### Pseudocode

For detailed info the execution of code and explainations, [Pseudocode](pseudocode.md) [Explain](explain.md)
## Building and Running

To build and run the code for each question, follow these steps:

1. Navigate to the respective question folder (e.g., `Question1` or `Question2`).
2. Compile the code using the following command:
     ```
     javac Main.java
     ```
3. Run the program using the following command:
     ```
     java Main
     ```

Make sure you have Java installed on your system before running the code.

Feel free to explore the code and modify it as needed for your assignments.

Happy coding!
