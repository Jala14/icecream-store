create table service
(
    id           serial
        constraint service_pk
            primary key,
    title        varchar,
    text         varchar,
    image        varchar,
    client_name  varchar,
    client_image varchar,
    client_say   varchar
);

