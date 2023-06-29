CREATE TABLE club (
                      id SERIAL PRIMARY KEY,
                      name VARCHAR(255) NOT NULL,
                      website VARCHAR(255)
);

INSERT INTO club (name, website) VALUES
                                     ('Club 1', 'www.club1.com'),
                                     ('Club 2', 'www.club2.com');
