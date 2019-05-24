-- customers
insert into customer
(name, email, phone, status, creation_time)
values ('Alice', 'alice@wonderworld.com', '87654321', 'Prospective', CURRENT_TIMESTAMP);
insert into customer
(name, email, phone, status, creation_time)
values ('Bob', 'bob@wonderworld.com', '987', 'Current', CURRENT_TIMESTAMP);
insert into customer
(name, email, phone, status, creation_time)
values ('Charlie', 'charlie@wonderworld.com', '321', 'NonActive', CURRENT_TIMESTAMP);

-- notes
insert into note (text, customer_id) values ('Best!', 1);
insert into note (text, customer_id) values ('Good.', 2);
insert into note (text, customer_id) values ('OK.', 3);