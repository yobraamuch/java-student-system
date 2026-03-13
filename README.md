# Student Library System

A comprehensive university system for managing students, lecturers, courses, and library resources.

## Project Structure

```text
student-library-system/
├── bin/                        # Compiled .class files
├── src/
│   └── com/
│       └── university/
│           └── system/
│               ├── Main.java
│               ├── database/
│               │   ├── DatabaseConnection.java
│               │   └── schema.sql
│               ├── model/
│               │   ├── Person.java
│               │   ├── Student.java
│               │   ├── Lecturer.java
│               │   ├── Course.java
│               │   ├── Score.java
│               │   ├── Book.java
│               │   ├── BorrowRecord.java
│               │   └── Reservation.java
│               ├── controller/
│               │   ├── StudentController.java
│               │   ├── LecturerController.java
│               │   └── LibraryController.java
│               └── view/
│                   ├── MainWindow.java
│                   ├── StudentPanel.java
│                   ├── LecturerPanel.java
│                   └── LibraryPanel.java
└── README.md
```

## Compilation and Execution

### Prerequisites

- Java Development Kit (JDK) 8 or higher.

### Compiling the Project

To compile all Java source files into the `bin/` directory, run the following command from the root directory. This command uses `find` to locate all `.java` files and then passes them to `javac` with `src` as the source path.

```bash
javac -d bin -sourcepath src $(find src -name "*.java")
```

Alternatively, if your shell supports globbing (like Bash 4+ or Zsh), you can use:

```bash
javac -d bin -sourcepath src src/com/university/system/**/*.java
```

### Running the Application

Once compiled, run the application from the root directory using:

```bash
java -cp bin com.university.system.Main
```
