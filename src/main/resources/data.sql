-- queries defined in the data.sql are executed by spring on startup

-- use data.sql to insert data in tables

insert into person
    (id, name, location, birth_date)
values
    (10001, 'Abhinav', 'Mexico', '1990-08-26');
    
insert into person
    (id, name, location, birth_date)
values
    (10002, 'John', 'Rome', '1975-02-19');

insert into person
    (id, name, location, birth_date)
values
    (10003, 'Stacy', 'Los Angeles', '1991-07-24');