create table contact1
(
    id      serial
        constraint contact1_pk
            primary key,
    email   varchar,
    subject varchar,
    message varchar,
    name    varchar
);

