create table "user"
(
    id        serial
        constraint user_pk
            primary key,
    user_name varchar,
    password  varchar,
    email     varchar
);

