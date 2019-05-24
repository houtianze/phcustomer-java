create sequence hibernate_sequence start with 1 increment by 1
create table customer (id bigint not null, creation_time timestamp, email varchar(255), name varchar(255) not null, phone varchar(255), status varchar(255), primary key (id))
create table note (id bigint not null, text varchar(255) not null, customer_id bigint, primary key (id))
alter table note add constraint FKedpa244ka6vn0p57e3fiub5n4 foreign key (customer_id) references customer
