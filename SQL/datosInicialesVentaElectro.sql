--3 sucursales
INSERT INTO ControlAdministrativo.Sucursal (nombre,direccion) VALUES
('Sucursal Central','Zona 2 del centro de xela'),
('Sucursal Norte','Zona 5 del norte de xela'),
('Sucursal Sur','Zona 7 del sur de xela')
;
--creamos los roles
INSERT INTO ControlAdministrativo.Rol (nombre,descripcion) VALUES
('Vendedor','Venta productos, sólo su sucursal/Registrar y modificar clientes en el sistema'),
('Inventario','Ingreso de productos, sólo su sucursal, se remueve de donde se saca'),
('Bodega','Ingresar y modificar productos'),
('Administrador','Generar reportes, crear nuevos empleados')
;
-- creamos la bodega, solo se indica 1
INSERT INTO ControlAdministrativo.Bodega (nombre,direccion) VALUES
('Bodega Inicial','Zona 8 de xela')
;
--3 vendedores y 1 encargado de inventario, 4 encargados de bodega y 1 administrador.
--sucursalCentral!764,sucursalNorte!532,sucursalSur!815 
INSERT INTO ControlPersona.Empleado VALUES
('3015485923569',1,1,'Marco H.',23,'+50245867498','marco3015','4thDmuomOK8ocmkVsE69ms2diPkzegZU'),
('2057485923569',1,1,'Manuel L.',24,'64323532','manuel2057','4thDmuomOK8ocmkVsE69ms2diPkzegZU'),
('3687485923569',1,1,'Pedro S.',25,'+50245867498','pedro3687','4thDmuomOK8ocmkVsE69ms2diPkzegZU'),
('9765205748592',1,2,'Manolo D.',23,'64364532','manolo9765','4thDmuomOK8ocmkVsE69ms2diPkzegZU'),
('3654485923569',1,3,'Polo L.',22,'98723532','polo3654','4thDmuomOK8ocmkVsE69ms2diPkzegZU'),
('1268485923569',1,3,'Jose R.',25,'54623532','jose1268','4thDmuomOK8ocmkVsE69ms2diPkzegZU'),
('9867485923569',1,3,'Paola V.',23,'66523532','paola9867','4thDmuomOK8ocmkVsE69ms2diPkzegZU'),
('6457485923569',1,3,'Katy H.',25,'34523532','katy6457','4thDmuomOK8ocmkVsE69ms2diPkzegZU'),
('9754485923569',1,4,'Katy J.',24,'64523532','katy9754','4thDmuomOK8ocmkVsE69ms2diPkzegZU'),
('9482485923569',2,1,'Mishel R.',23,'+50245532498','mishel9482','4thDmuomOK+CT8Rwm2eyWrnOkV8EFeap'),
('6789485923569',2,1,'Manuela A.',24,'64754532','manuela6789','4thDmuomOK+CT8Rwm2eyWrnOkV8EFeap'),
('6872485923569',2,1,'Persefone B.',25,'+50297567498','persefone6872','4thDmuomOK+CT8Rwm2eyWrnOkV8EFeap'),
('5648205748592',2,2,'Elias D.',23,'61974532','elias5648','4thDmuomOK+CT8Rwm2eyWrnOkV8EFeap'),
('7342485923569',2,3,'Beatriz S.',22,'98765532','beatriz7342','4thDmuomOK+CT8Rwm2eyWrnOkV8EFeap'),
('5874485923569',2,3,'Ana B.',25,'56313532','ana5874','4thDmuomOK+CT8Rwm2eyWrnOkV8EFeap'),
('6988485923569',2,3,'Maribel Z.',23,'66526382','maribel6988','4thDmuomOK+CT8Rwm2eyWrnOkV8EFeap'),
('6254485923569',2,3,'Juan O.',25,'35235432','juanl6254','4thDmuomOK+CT8Rwm2eyWrnOkV8EFeap'),
('6548485923569',2,4,'Samuel I.',24,'86443532','samuel6548','4thDmuomOK+CT8Rwm2eyWrnOkV8EFeap'),
('8342485923569',3,1,'Marco U.',23,'+50247342498','marco8342','4thDmuomOK+navROvm1ElQ=='),
('6123485923569',3,1,'Pedro Q.',24,'64776532','pedro6123','4thDmuomOK+navROvm1ElQ=='),
('8452485923569',3,1,'Marian A.',25,'+50262367498','marian8452','4thDmuomOK+navROvm1ElQ=='),
('8432205748592',3,2,'Juana B.',23,'64274532','juana8432','4thDmuomOK+navROvm1ElQ=='),
('2345485923569',3,3,'Elizabeth Y.',22,'75465532','elizabeth2345','4thDmuomOK+navROvm1ElQ=='),
('4321485923569',3,3,'Lisbeth Z.',25,'75413532','lisbeth4321','4thDmuomOK+navROvm1ElQ=='),
('1423485923569',3,3,'Anabelly S.',23,'62426382','anabelly1423','4thDmuomOK+navROvm1ElQ=='),
('6234485923569',3,3,'Guillermo V.',25,'75335432','guillermo6234','4thDmuomOK+navROvm1ElQ=='),
('9563485923569',3,4,'Ruben L.',24,'83543532','ruben9563','4thDmuomOK+navROvm1ElQ==')
;
--productos de https://www.tecnofacil.com.gt/hogar/electrodomesticos?limit=30&p=2
INSERT INTO ControlAdministrativo.Producto VALUES
('A001','Oster BLST4655','Oster',999),
('A002','Cafetera D50065','Hamilton Beach',456),
('A003','Aspiradora De Mano','Black+Decker',928),
('A004','Licuadora Cyclone','Black+Decker',799.53),
('A005','Limpiador a Vapor','Electrolux',624),
('A006','Freidora de aire','Black+Decker',729),
('A007','Plancha de vapor HGS200D','Black+Decker',679),
('A008','Batidora de Pedestal','Black+Decker',547.68),
('A009','Horno Tostador TSSTTV10LTB013','Oster',587),
('A010','Extractor de Jugos','Black+Decker',548),
('A011','Poporopera de aceite 73302','Hamilton Beach',547.52),
('A012','Aspitadora de agua','Electrolux',427),
('A013','Tetera Electrica','Hamilton Beach',124.79),
('A014','Procesador de alimentos','Oster',334),
('A015','Exprimidor de citricos','Oster',245),
('A016','Licuadora Durapro','Black+Decker',547),
('A017','Tostadora de 2 rebanadas','Hamilton Beach',298),
('A018','Hornilla electrica SB1001B','Black+Decker',457),
('A019','Plancha de Ropa IR1851','Black+Decker',357),
('A020','Aspiradora 1gal.','shop.vac',547),
('A021','Jarra de plastico','Black+Decker',18),
('A022','Aspiradora de bolsa','Black+Decker',859.7),
('A023','Olla de presion','Oster',839),
('A024','Hidrolavadora','Electrolux',799),
('A025','Horno Microondas 700 whatts','Whirpool',799),
('A026','Limpiadora a vapor','Electrolux',759),
('A027','Accesorio para vasos de moler','Black+Decker',28),
('A028','Horno Microondas NNST965SRPH','Panasonic',1999),
('A029','Horno Tostador TO4315SSLA','Black+Decker',1485.74),
('A030','Licuadora motor reversible','Oster',1099)
;
--producto en bodega
INSERT INTO ControlAdministrativo.Producto_Bodega VALUES
(1,'A001','Manolo','Espacio 1',132),
(1,'A002','Manolo','Espacio 2',243),
(1,'A003','Manolo','Espacio 3',312),
(1,'A004','Manolo','Espacio 4',652),
(1,'A005','Manolo','Espacio 5',324),
(1,'A006','Manolo','Espacio 6',123),
(1,'A007','Manolo','Espacio 7',478),
(1,'A008','Manolo','Espacio 8',135),
(1,'A009','Manolo','Espacio 9',145),
(1,'A010','Manolo','Espacio 10',652),
(1,'A011','Pedro','Espacio 11',422),
(1,'A012','Pedro','Espacio 12',456),
(1,'A013','Pedro','Espacio 13',357),
(1,'A014','Pedro','Espacio 14',456),
(1,'A015','Pedro','Espacio 15',652),
(1,'A016','Pedro','Espacio 16',982),
(1,'A017','Pedro','Espacio 17',122),
(1,'A018','Pedro','Espacio 18',652),
(1,'A019','Pedro','Espacio 19',422),
(1,'A020','Pedro','Espacio 20',122),
(1,'A021','Anabelly','Espacio 21',321),
(1,'A022','Anabelly','Espacio 22',124),
(1,'A023','Anabelly','Espacio 23',422),
(1,'A024','Anabelly','Espacio 24',452),
(1,'A025','Anabelly','Espacio 25',321),
(1,'A026','Anabelly','Espacio 26',572),
(1,'A027','Anabelly','Espacio 27',264),
(1,'A028','Anabelly','Espacio 28',287),
(1,'A029','Anabelly','Espacio 29',378),
(1,'A030','Anabelly','Espacio 30',321)
;
--producto sucursales
INSERT INTO ControlAdministrativo.Producto_Sucursal VALUES
(1,'A001','Estanteria 1',13),
(1,'A002','Estanteria 2',24),
(1,'A003','Estanteria 3',31),
(1,'A004','Estanteria 4',65),
(1,'A005','Estanteria 5',32),
(1,'A006','Estanteria 6',12),
(1,'A007','Estanteria 7',48),
(1,'A008','Estanteria 8',15),
(1,'A009','Estanteria 9',15),
(1,'A010','Estanteria 10',5),
(1,'A011','Estanteria 11',42),
(1,'A012','Estanteria 12',46),
(1,'A013','Estanteria 13',37),
(1,'A014','Estanteria 14',46),
(1,'A015','Estanteria 15',52),
(1,'A016','Estanteria 16',82),
(1,'A017','Estanteria 17',22),
(1,'A018','Estanteria 18',52),
(1,'A019','Estanteria 19',22),
(1,'A020','Estanteria 20',22),
(1,'A021','Estanteria 21',31),
(1,'A022','Estanteria 22',24),
(1,'A023','Estanteria 23',22),
(1,'A024','Estanteria 24',52),
(1,'A025','Estanteria 25',31),
(1,'A026','Estanteria 26',57),
(1,'A027','Estanteria 27',24),
(1,'A028','Estanteria 28',87),
(1,'A029','Estanteria 29',78),
(1,'A030','Estanteria 30',21),
(2,'A001','Estanteria 1',25),
(2,'A002','Estanteria 2',26),
(2,'A003','Estanteria 3',31),
(2,'A004','Estanteria 4',25),
(2,'A005','Estanteria 5',42),
(2,'A006','Estanteria 6',12),
(2,'A007','Estanteria 7',45),
(2,'A008','Estanteria 8',16),
(2,'A009','Estanteria 9',15),
(2,'A010','Estanteria 10',55),
(2,'A011','Estanteria 11',42),
(2,'A012','Estanteria 12',6),
(2,'A013','Estanteria 13',37),
(2,'A014','Estanteria 14',46),
(2,'A015','Estanteria 15',22),
(2,'A016','Estanteria 16',32),
(2,'A017','Estanteria 17',72),
(2,'A018','Estanteria 18',82),
(2,'A019','Estanteria 19',42),
(2,'A020','Estanteria 20',62),
(2,'A021','Estanteria 21',11),
(2,'A022','Estanteria 22',44),
(2,'A023','Estanteria 23',52),
(2,'A024','Estanteria 24',52),
(2,'A025','Estanteria 25',71),
(3,'A001','Estanteria 1',25),
(3,'A002','Estanteria 2',42),
(3,'A003','Estanteria 3',64),
(3,'A004','Estanteria 4',68),
(3,'A005','Estanteria 5',36),
(3,'A006','Estanteria 6',42),
(3,'A007','Estanteria 7',68),
(3,'A008','Estanteria 8',42),
(3,'A009','Estanteria 9',64),
(3,'A010','Estanteria 10',54),
(3,'A011','Estanteria 11',67),
(3,'A012','Estanteria 12',45),
(3,'A013','Estanteria 13',25),
(3,'A014','Estanteria 14',64),
(3,'A015','Estanteria 15',54)
;
-- creamos la bodega, solo se indica 1
INSERT INTO ControlPersona.Cliente VALUES
('C/F','C/F','C/F',7625.14,2545.52),--
('123456789','Manolito','18475624',3256.46,1400.46),
('612342621','','96736453',4375,4375),--
('723544322','Pedro','+50235235432',6024.8,592.8),--
('562345243','Carlos','',1748.68,1748.68),--
('234513512','Maria','87532412',548,548),--
('732421233','','85246674',1967,1967),--
('753253134','Marcos','+50214356884',14110.45,1478.45),--
('623142342','Ana','65987658',1248,1248),--
('512412432','Lisbeth','',5470,5470),--
('655235764','Mishel','64589578',10072,10072),
('755213423','Alberto','65354552',1957,1957),--
('614342134','Marta','36542568',1171.52,1171.52)--
;
-- creamos la bodega, solo se indica 1
INSERT INTO ControlVenta.Factura (id_sucursal,cui,nit,subtotal_venta,descuento,total_venta) VALUES
(1,'3015485923569','C/F',2454,0.00,2454),
(1,'3015485923569','123456789',1856,0.00,1856),
(1,'3015485923569','612342621',4375,0.00,4375),
(1,'3015485923569','723544322',5432,0.00,5432),
(1,'3015485923569','562345243',1748.68,0.00,1748.68),
(1,'2057485923569','234513512',548,0.00,548),
(2,'9482485923569','C/F',2625.62,0.00,2625.62),
(2,'9482485923569','732421233',1967,0.00,1967),
(2,'9482485923569','753253134',12632,0.00,12632),
(2,'9482485923569','623142342',1248,0.00,1248),
(2,'6872485923569','512412432',5470,0.00,5470),
(2,'6872485923569','655235764',10072,0.00,10072),
(3,'8452485923569','C/F',2545.52,0.00,2545.52),
(3,'8452485923569','755213423',1957,0.00,1957),
(3,'8452485923569','614342134',1171.52,0.00,1171.52),
(3,'6123485923569','723544322',624,0.05,592.8),
(3,'8342485923569','753253134',1642.72,0.10,1478.45),
(3,'8342485923569','123456789',1429.04,0.2,1400.46)
;
--venta,sucursal,codigo,cantidad,total
INSERT INTO ControlVenta.Producto_Factura VALUES
(1,1,'A001',2,999),
(1,1,'A002',1,456),
(2,1,'A003',2,928),
(3,1,'A004',3,799.53),
(3,1,'A005',2,624),
(3,1,'A006',1,729),
(4,1,'A007',8,679),
(5,1,'A008',1,547.68),
(5,1,'A009',2,587),
(6,1,'A010',1,548),
(7,2,'A011',2,547.52),
(7,2,'A012',3,427),
(7,2,'A013',2,124.79),
(8,2,'A014',1,334),
(8,2,'A015',2,245),
(8,2,'A016',1,547),
(8,2,'A017',2,298),
(9,1,'A001',8,999),
(9,2,'A003',5,928),
(10,2,'A005',2,624),
(11,2,'A016',10,547),
(12,2,'A001',5,999),
(12,2,'A016',7,547),
(12,2,'A005',2,624),
(13,3,'A001',2,999),
(13,3,'A011',1,547.52),
(14,3,'A005',1,624),
(14,3,'A014',1,334),
(14,3,'A001',2,999),
(15,3,'A005',1,624),
(15,3,'A011',2,547.52),
(16,3,'A005',1,624),
(17,3,'A011',2,547.52),
(17,3,'A008',1,547.68),
(17,3,'A013',2,124.79),
(18,3,'A014',1,334),
(18,3,'A011',2,547.52)
;