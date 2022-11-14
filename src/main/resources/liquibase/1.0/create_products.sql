create table products_1
(
    id       serial
        constraint products_1_pk
            primary key,
    name     varchar not null,
    price    numeric,
    currency varchar,
    image    text
);