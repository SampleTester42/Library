First, install Git if havent already and clone repository

Setting Up MySQL Server:
Download MySQL Server:
Go to the MySQL Downloads page and download the MySQL Community Server appropriate for your operating system. Choose .

Install MySQL Server:
Follow the installation instructions provided for your operating system. During installation, you will set a root password for the MySQL server.

Start MySQL Server:
After installation, start the MySQL command line client (can be found in search menu). It will ask for password and once logged in will start the server.

Then once started, do the following:

1. Create the database:
"CREATE DATABASE library;"

2. Switch to database:
"USE library;"

3. Create the table with books
"CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(255)
   );"
4. Insert sample data with following command:
INSERT INTO books (title, author) VALUES
    ('The Catcher in the Rye', 'J.D. Salinger'),
    ('Pride and Prejudice', 'Jane Austen'),
    ('To Kill a Mockingbird', 'Harper Lee'),
    ('The Great Gatsby', 'F. Scott Fitzgerald'),
    ('1984', 'George Orwell'),
    ('Brave New World', 'Aldous Huxley'),
    ('The Lord of the Rings', 'J.R.R. Tolkien'),
    ('Harry Potter and the Sorcerer''s Stone', 'J.K. Rowling'),
    ('The Hobbit', 'J.R.R. Tolkien'),
    ('Animal Farm', 'George Orwell'),
    ('The Chronicles of Narnia', 'C.S. Lewis'),
    ('The Da Vinci Code', 'Dan Brown'),
    ('The Hitchhiker''s Guide to the Galaxy', 'Douglas Adams'),
    ('The Kite Runner', 'Khaled Hosseini'),
    ('The Alchemist', 'Paulo Coelho'),
    ('The Hunger Games', 'Suzanne Collins'),
    ('The Road', 'Cormac McCarthy'),
    ('Gone with the Wind', 'Margaret Mitchell'),
    ('The Girl with the Dragon Tattoo', 'Stieg Larsson'),
    ('The Help', 'Kathryn Stockett');


The rest of the task is in the Main class as a comment
