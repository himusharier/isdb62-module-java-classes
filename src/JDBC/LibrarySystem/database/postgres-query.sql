-- Create the table for the library with boolean availability
CREATE TABLE library_system (
    book_id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    genre VARCHAR(100),
    published_year INT,
    available BOOLEAN NOT NULL
);

-- Insert sample data into the library table
INSERT INTO library_system (title, author, genre, published_year, available) VALUES
    ('To Kill a Mockingbird', 'Harper Lee', 'Fiction', 1960, TRUE),
    ('1984', 'George Orwell', 'Dystopian', 1949, TRUE),
    ('The Great Gatsby', 'F. Scott Fitzgerald', 'Fiction', 1925, TRUE),
    ('Pride and Prejudice', 'Jane Austen', 'Romance', 1813, TRUE),
    ('The Catcher in the Rye', 'J.D. Salinger', 'Fiction', 1951, FALSE),
    ('The Hobbit', 'J.R.R. Tolkien', 'Fantasy', 1937, TRUE),
    ('Moby-Dick', 'Herman Melville', 'Adventure', 1851, FALSE),
    ('War and Peace', 'Leo Tolstoy', 'Historical Fiction', 1869, TRUE),
    ('The Alchemist', 'Paulo Coelho', 'Philosophical Fiction', 1988, TRUE),
    ('Brave New World', 'Aldous Huxley', 'Dystopian', 1932, TRUE);
