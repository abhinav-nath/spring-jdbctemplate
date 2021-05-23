-- queries defined in the schema.sql are executed by spring on startup

-- use schema.sql to create tables

CREATE TABLE person (
    id INTEGER NOT NULL,
    name VARCHAR(255) NOT NULL,
    location VARCHAR(255),
    birth_date TIMESTAMP,
    PRIMARY KEY (id)
);