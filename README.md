<!DOCTYPE html>
<html>
<head>
<title>Library Management System</title>
<style>
  body {
    font-family: Arial, sans-serif;
    line-height: 1.6;
    margin: 20px;
  }

  .title {
    font-family: 'Georgia', serif;
    font-size: 2em;
    font-weight: bold;
    margin-bottom: 20px;
  }

  .overview {
    font-family: 'Verdana', sans-serif;
    font-size: 1.1em;
    margin-bottom: 20px;
  }

  .features-title {
    font-family: 'Times New Roman', serif;
    font-size: 1.5em;
    font-weight: bold;
    margin-bottom: 10px;
  }

  .features {
    font-family: 'Courier New', monospace;
    margin-bottom: 20px;
  }

  .class-structure-title {
    font-family: 'Impact', sans-serif;
    font-size: 1.5em;
    font-weight: bold;
    margin-bottom: 10px;
  }

  .class-structure {
    font-family: 'Lucida Console', monospace;
    margin-bottom: 20px;
  }

  .installation-usage {
    font-family: 'Comic Sans MS', cursive;
    margin-bottom: 20px;
  }

  .example-output-title {
    font-family: 'Trebuchet MS', sans-serif;
    font-size: 1.5em;
    font-weight: bold;
    margin-bottom: 10px;
  }

  .example-output {
    font-family: 'Roboto Mono', monospace;
  }
</style>
</head>
<body>

<div class="title">Library Management System</div>

<div class="overview">
  Overview<br><br>
  The Library Management System is a simple Java-based application designed to help librarians efficiently manage books, patrons, and the lending process. It implements key Object-Oriented Programming (OOP) principles and follows the SOLID design principles.
</div>

<div class="features-title">Features</div>
<div class="features">
  Book Management: Add, remove, and search for books by title.<br>
  Patron Management: Register new patrons and track their borrowed books.<br>
  Lending Process: Allow patrons to borrow and return books.<br>
  Inventory Management: Keep track of available and borrowed books.
</div>

<div class="class-structure-title">Class Structure</div>
<div class="class-structure">
  Book: Represents a book with attributes like title, author, ISBN, and availability.<br>
  Patron: Represents a library member with borrowed book tracking.<br>
  Library: Manages books, patrons, and lending functionalities.<br>
  LibraryManagementSystem: The main class to execute the system.
</div>

<div class="installation-usage">
  Installation & Usage
</div>

<div class="example-output-title">Example Output</div>
<div class="example-output">
  Book added: Java in 30 days<br>
  New patron registered: Vishnu<br>
  Book checked out: Java in 30 days by Vishnu<br>
  Book returned: Java in 30 days by Vishnu
</div>

</body>
</html>
