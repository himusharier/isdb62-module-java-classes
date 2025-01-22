-- Create the books table with the necessary columns
CREATE TABLE library_books_console_app (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    year_of_publication INT NOT NULL,
    number_of_pages INT NOT NULL,
    price NUMERIC(10, 2) NOT NULL,
    availability BOOLEAN NOT NULL
);

-- Insert 10 rows of book data with short titles and availability status
INSERT INTO library_books_console_app (title, author, year_of_publication, number_of_pages, price, availability) VALUES
('The Hobbit', 'J.R.R. Tolkien', 1937, 310, 11.50, TRUE),
('1984', 'George Orwell', 1949, 328, 8.99, TRUE),
('Moby Dick', 'Herman Melville', 1851, 585, 12.50, TRUE),
('War and Peace', 'Leo Tolstoy', 1869, 1225, 14.99, FALSE),
('Pride', 'Jane Austen', 1813, 279, 6.99, TRUE),
('Dracula', 'Bram Stoker', 1897, 418, 9.99, TRUE),
('Frankenstein', 'Mary Shelley', 1818, 280, 7.50, TRUE),
('Brave New World', 'Aldous Huxley', 1932, 311, 10.00, FALSE),
('Catch-22', 'Joseph Heller', 1961, 453, 12.00, TRUE),
('The Great Gatsby', 'F. Scott Fitzgerald', 1925, 180, 10.99, TRUE);

-- Query to list all books
SELECT * FROM library_books_console_app;
