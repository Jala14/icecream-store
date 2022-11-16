create table cart
(
    id             serial
        constraint cart_pk
            primary key,
    product_entity varchar,
    quantity       int,
    carts          varchar
);

