# Patterns 1

## 📄 Description - Exercise Statement

This project implements the **Singleton design pattern** through an
`Undo` manager.\
The objective is to replicate the behavior of the Linux `history`
command, allowing commands to be added, removed, and listed.\
The project includes a `Main` class that demonstrates the functionality
via a console menu.

## 💻 Technologies Used

-   Java 21
-   JUnit 5 (for testing)
-   Maven (build and dependency management)

## 📋 Requirements

-   Java 21 or higher
-   Maven 3.9+
-   Git (optional, for version control)

## 🛠️ Installation

1.  Clone the repository:

    ``` bash
    git clone https://github.com/alaw810/3.1-Patterns1.git
    ```

2.  Build the project with Maven:

    ``` bash
    mvn clean install
    ```

## ▶️ Execution

1.  Run the tests:

    ``` bash
    mvn test
    ```

2.  Run the application:

    ``` bash
    mvn -q exec:java -Dexec.mainClass="com.alaw810.lvl1.Main"
    ```

    Example console interaction:

        -- Commands Menu --
        1) Add command
        2) Remove last command
        3) List commands
        4) Exit

## 🌐 Deployment

This is a console-based project and is not intended for deployment in
production environments.\
It can be executed locally in any environment that supports Java 21 and
Maven.