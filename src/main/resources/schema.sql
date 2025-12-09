create table Product(
id SERIAL PRIMARY KEY,
name VARCHAR,
price number,
creatio_datetime Timestamp
);

create table Product_category(
id int PRIMARY KEY,
name VARCHAR,
product_id int
)