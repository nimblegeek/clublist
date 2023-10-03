CREATE TABLE clubs (
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(100) NOT NULL UNIQUE,
                       address TEXT,  -- You can use TEXT data type for the address, or use separate columns for street, city, state, etc., depending on your requirements.
                       status VARCHAR(50)  -- Use a more descriptive data type for status.
);
