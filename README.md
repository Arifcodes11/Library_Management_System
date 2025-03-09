# Library Management System 📚

A simple **Java-based Library Management System** that allows users to **add, search, check out, and return books**. Book details are stored in a file (`library.txt`).

## Features ✨
- **Add a Book**: Enter the title and author to add a book.
- **Search for Books**: Find books by title or author (case insensitive).
- **Check Out a Book**: Borrow a book if it is available.
- **Return a Book**: Return a previously borrowed book.
- **Persistent Storage**: Books are stored in `library.txt`.

## How to Run 🚀
### 1️⃣ Install Java (if not already installed)
- **Windows**: [Download Java](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) and install it.
- **Linux/macOS**: Run the following command:
  ```sh
  sudo apt install default-jdk  # Ubuntu/Debian
  brew install openjdk          # macOS
  ```

### 2️⃣ Compile the Program
```sh
javac LibraryManagementSystem.java
```

### 3️⃣ Run the Program
```sh
java LibraryManagementSystem
```

## File Storage 📂
- Books are saved in **library.txt**.
- Format: `Title, Author, CheckedOut(true/false)`.
- Example:
  ```
  The Great Gatsby,F. Scott Fitzgerald,false
  1984,George Orwell,true
  ```

## Usage 🛠️
When you run the program, you will see:
```
----- Library Management System -----
1. Add a book
2. Search for books
3. Check out a book
4. Return a book
0. Exit
Enter your choice:
```
**Example Input & Output:**
```
Enter your choice: 2
Enter the search keyword: 1984
Search results:
1984 by George Orwell [Checked Out]
```



Enjoy your Library Management System! 🎉

