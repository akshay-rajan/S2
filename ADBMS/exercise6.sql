CREATE DATABASE `Trigger`;
USE `Trigger`;

CREATE TABLE Product (
	PdtId INT PRIMARY KEY,
    Pname VARCHAR(50),
    Price FLOAT,
    QtyInStock INT
);

CREATE TABLE Sale (
	SaleId INT PRIMARY KEY,
    DeliveryAddress VARCHAR(50)
);

CREATE TABLE Saleitem (
	SaleId INT,
    PdtId INT,
    Qty INT,
    PRIMARY KEY (SaleId, PdtId),
    FOREIGN KEY (SaleId) REFERENCES Sale(SaleId),
    FOREIGN KEY (PdtId)  REFERENCES Product(PdtId)
);


CREATE TRIGGER updateAvailableQuantity
AFTER INSERT
ON Saleitem
FOR EACH ROW
UPDATE Product
SET QtyInStock = QtyInStock - NEW.Qty
WHERE PdtId = NEW.PdtId;


INSERT INTO Product VALUES (2, 'Apple', 100, 100);
INSERT INTO Sale VALUES (2, 'Trivandrum');
INSERT INTO Saleitem VALUES (2, 2, 25);

SELECT * FROM Product;
SELECT * FROM Sale;
SELECT * FROM Saleitem;

SHOW triggers;