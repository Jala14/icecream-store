create table about
(
    id          serial
        constraint about_pk
            primary key,
    title       varchar,
    text        varchar,
    chef_name   varchar,
    chef_image  varchar,
    designation varchar
);

