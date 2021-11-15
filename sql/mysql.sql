
CREATE TABLE IF NOT EXISTS `tbUser` (
    `id` INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `username` VARCHAR(255) NOT NULL,
    `password` VARCHAR(255) NOT NULL
) CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE IF NOT EXISTS `tbProducts` (
    `id` INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL,
    `price` INTEGER NOT NULL,
    `amount` INTEGER NOT NULL,
    `details` VARCHAR(255) NULL
) CHARACTER SET utf8 COLLATE utf8_general_ci;

INSERT INTO tbUser(username, password) VALUES ('manhnd', '123456');
INSERT INTO tbUser(username, password) VALUES ('manhnd1', '123456');


INSERT INTO tbProducts(name, price, amount, details) VALUES ('product 1', 12, 21, 'detail1');
INSERT INTO tbProducts(name, price, amount, details) VALUES ('product 2', 13, 22, 'detail2');
INSERT INTO tbProducts(name, price, amount, details) VALUES ('product 3', 14, 23, 'detail3');
INSERT INTO tbProducts(name, price, amount, details) VALUES ('product 4', 15, 24, 'detail4');
INSERT INTO tbProducts(name, price, amount, details) VALUES ('product 5', 16, 25, 'detail5');