Here's the complete **README** file in a single, well-structured document with **input/output examples**, emojis, and clear instructions. 🚀📚  

---

# 📚 Library Management System  

A simple **Java-based Library Management System** that allows users to **add, search, borrow, and return books**. Book details are stored in a file (`library.txt`) for persistence.  

## ✨ Features  
- **📖 Add a Book** – Enter the title and author to add a book.  
- **🔍 Search for Books** – Find books by title or author.  
- **📚 Borrow a Book** – Check out a book if it's available.  
- **🔄 Return a Book** – Return a borrowed book.  
- **💾 Persistent Storage** – Books are saved in `library.txt` even after closing the program.  

## 🚀 How to Run  

### 1️⃣ Install Java (if not installed)  
- **Windows**: [Download Java](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) and install it.  
- **Linux/macOS**: Run:  
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

---

## 📂 File Storage  
- Books are saved in **library.txt** in the format:  
  ```
  Title, Author, CheckedOut(true/false)
  ```
- Example content:  
  ```
  The Great Gatsby,F. Scott Fitzgerald,false
  1984,George Orwell,true
  ```

---

## 🛠️ Sample Input & Output  

```
----- Library Management System -----
1. Add a book
2. Search for books
3. Borrow a book
4. Return a book
0. Exit
Enter your choice: 1

Enter the title of the book: Java Programming
Enter the author of the book: John Doe
✅ Book added successfully!

Enter your choice: 2

Enter the search keyword: Java
🔎 Search results:
📖 Java Programming by John Doe

Enter your choice: 3

Enter the title of the book to borrow: Java Programming
📚 Book 'Java Programming' borrowed successfully!

Enter your choice: 4

Enter the title of the book to return: Java Programming
🔄 Book 'Java Programming' returned successfully!

Enter your choice: 0
💾 Books saved to file: library.txt
👋 Exiting... Goodbye!
```

---

🎉 **Enjoy your Library Management System!** 🚀
