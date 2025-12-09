Create DATABASE product_management_db;

create user product_manager_user WHITH password '123456';

grant connect on database product_management_db to product_manager_user;

grant create on database product_management_db to product_manager_user;