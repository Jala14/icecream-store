create table gallary
(
    id              serial
        constraint gallary_pk
            primary key,
    ice_cream_type  varchar,
    ice_cream_image varchar
);

