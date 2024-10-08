DROP TABLE CLIENT IF EXISTS;
CREATE TABLE CLIENT (
    id INT,
    nombre VARCHAR(150) NOT NULL,
    apellido VARCHAR(150) NOT NULL,
    dni INT NOT NULL,
    fecha INT NOT NULL
);

DROP TABLE ADDRESS IF EXISTS;
CREATE TABLE ADDRESS(
    id INT AUTO_INCREMENT PRIMARY KEY,
    calle VARCHAR(150) NOT NULL,
    numero INT NOT NULL,
    cp INT NOT NULL,
    provincia VARCHAR(150) NOT NULL,
    ciudad VARCHAR(150) NOT NULL
);

DROP TABLE PRODUCT IF EXISTS;
CREATE TABLE PRODUCT(
    id VARCHAR(150),
    descripcion VARCHAR(150) NOT NULL,
    stock INT NOT NULL,
    precio DECIMAL (10, 2)NOT NULL,
    color VARCHAR (150) NOT NULL,
    talle VARCHAR NOT NULL
);

DROP TABLE SALE IF EXISTS;
CREATE TABLE SALE(
    sale_id INT NOT NULL AUTO_INCREMENT,
    fecha INT NOT NULL,
    product_id VARCHAR(80) NOT NULL,
    monto INT NOT NULL,
    total DECIMAL (10,2) NOT NULL
)

