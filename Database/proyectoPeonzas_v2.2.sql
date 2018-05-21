DROP DATABASE `proyectoPeonzas`;
-- Base de datos proyectoPeonzas
CREATE DATABASE  IF NOT EXISTS `proyectoPeonzas` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci */;
USE `proyectoPeonzas`;

-- table puntas
CREATE TABLE  `puntas` (
  `idPunta` int(3) NOT NULL AUTO_INCREMENT,
  `nombrePunta` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `tipoPunta` varchar(50),
    PRIMARY KEY (`idPunta`)

)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;


-- table cuerdas
CREATE TABLE  `cuerdas` (
  `idCuerda` int(3) NOT NULL AUTO_INCREMENT,
  `nombreCuerda` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `longitud` decimal(5,2) ,
  `grosor` decimal(5,2)	,
  PRIMARY KEY (`idCuerda`)

)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- table peonzas
CREATE TABLE  `peonzas` (
  `idPeonza` int(3) NOT NULL AUTO_INCREMENT,
    `nombrePeonza` varchar(50) NOT NULL,

  `tamanyo` decimal(5,2),

  `precio` decimal(5,2) NOT NULL,
  `imagen` varchar(500) NOT NULL,
  `material` varchar(50),
  `cantidad` int(3) NOT NULL,
 `punta` int(3),
 `cuerda` int(3),

  `descripcion` VARCHAR(500),
  PRIMARY KEY (`idPeonza`),
    -- for_cuerda = clave foránea que asigna la PK de la tabla cuerda en el campo cuerda.
    CONSTRAINT `for_cuerda` FOREIGN KEY (`cuerda`)
  REFERENCES `cuerdas` (`idCuerda`)
ON DELETE CASCADE ON UPDATE CASCADE,
  -- for_punta = clave foránea que asigna la PK de la tabla punta en el campo punta.
  CONSTRAINT `for_punta` FOREIGN KEY (`punta`)
  REFERENCES `puntas` (`idPunta`)
ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

INSERT INTO `proyectopeonzas`.`cuerdas` (`idCuerda`, `nombreCuerda`, `longitud`, `grosor`) VALUES ('1', 'Rígida', 9.5, '2');
INSERT INTO `proyectopeonzas`.`cuerdas` (`idCuerda`, `nombreCuerda`, `longitud`, `grosor`) VALUES ('2', 'Trenzada', 15.0, '1.1');
INSERT INTO `proyectopeonzas`.`cuerdas` (`idCuerda`, `nombreCuerda`, `longitud`, `grosor`) VALUES ('3', 'Elástica', 90.0, '1.2');


INSERT INTO `proyectopeonzas`.`puntas` (`idPunta`,`nombrePunta`,`tipoPunta`) VALUES ('1','Lapiz','Afilada');
INSERT INTO `proyectopeonzas`.`puntas` (`idPunta`,`nombrePunta`,`tipoPunta`) VALUES ('2','Bola','Redonda');
INSERT INTO `proyectopeonzas`.`puntas` (`idPunta`,`nombrePunta`,`tipoPunta`) VALUES ('3','Pico','Plana');

INSERT INTO `proyectopeonzas`.`peonzas` (`nombrePeonza`,`tamanyo`,`precio`,`imagen`,`material`,`cantidad`,`punta`,`cuerda`,`descripcion`) VALUES ('Pegasus','9.2','10.20','https://raw.githubusercontent.com/AdrianRamiroEscamilla/ProyectoTiendaPeonzas/master/imagenePeonzas/Pegasus.jpg','metal','1','1','12','Peonza elegante, vistosa e impactante, perfecta para coleccionistas');
INSERT INTO `proyectopeonzas`.`peonzas` (`nombrePeonza`,`tamanyo`,`precio`,`imagen`,`material`,`cantidad`,`punta`,`cuerda`,`descripcion`) VALUES ('Carnicera','10.5','12.50','https://raw.githubusercontent.com/AdrianRamiroEscamilla/ProyectoTiendaPeonzas/master/imagenePeonzas/Carnicera.jpg','madera','1','1','10','Con su forma agresiva y punta afilada, machaca a tus contricantes!');
INSERT INTO `proyectopeonzas`.`peonzas` (`nombrePeonza`,`tamanyo`,`precio`,`imagen`,`material`,`cantidad`,`punta`,`cuerda`,`descripcion`) VALUES ('Trompus','8.8','14.10','https://raw.githubusercontent.com/AdrianRamiroEscamilla/ProyectoTiendaPeonzas/master/imagenePeonzas/Trompus.jpg','madera','2','2','15','Fantástica peonza ahuevada para los más peques');
INSERT INTO `proyectopeonzas`.`peonzas` (`nombrePeonza`,`tamanyo`,`precio`,`imagen`,`material`,`cantidad`,`punta`,`cuerda`,`descripcion`) VALUES ('Rapid','8.5','15','https://raw.githubusercontent.com/AdrianRamiroEscamilla/ProyectoTiendaPeonzas/master/imagenePeonzas/Rapid.jpg','plastico','3','2','23','Ágil, veloz e insinuante, la peonza Rapid es la más rápida del mercado, ideal para las competiciones y juegos que requieran gran velocidad.');
INSERT INTO `proyectopeonzas`.`peonzas` (`nombrePeonza`,`tamanyo`,`precio`,`imagen`,`material`,`cantidad`,`punta`,`cuerda`,`descripcion`) VALUES ('Furious','10','18','https://raw.githubusercontent.com/AdrianRamiroEscamilla/ProyectoTiendaPeonzas/master/imagenePeonzas/Furious.jpg','metal','3','3','11','Robusta y siniestra, la peonza Furious está diseñada para soportar las embestidas más agresivas.');
INSERT INTO `proyectopeonzas`.`peonzas` (`nombrePeonza`,`tamanyo`,`precio`,`imagen`,`material`,`cantidad`,`punta`,`cuerda`,`descripcion`) VALUES ('Inferno','9.5','16','https://raw.githubusercontent.com/AdrianRamiroEscamilla/ProyectoTiendaPeonzas/master/imagenePeonzas/Inferno.jpg','madera','2','1','4','Inferno llega desde el mísmisimo infierno para danzar endiabladamente.');

INSERT INTO `proyectopeonzas`.`peonzas` (`nombrePeonza`,`tamanyo`,`precio`,`imagen`,`material`,`cantidad`,`punta`,`cuerda`,`descripcion`) VALUES ('Quetziko','8.5','15.5','https://raw.githubusercontent.com/AdrianRamiroEscamilla/ProyectoTiendaPeonzas/master/imagenePeonzas/Quetziko.jpg','madera','1','3','7','Pequeña rapida y facil de usar, Barata y para poder empezar en el mundo de las peonzas.');
INSERT INTO `proyectopeonzas`.`peonzas` (`nombrePeonza`,`tamanyo`,`precio`,`imagen`,`material`,`cantidad`,`punta`,`cuerda`,`descripcion`) VALUES ('Valtryek','7.6','16.99','https://raw.githubusercontent.com/AdrianRamiroEscamilla/ProyectoTiendaPeonzas/master/imagenePeonzas/Valtryek.jpg','plastico','1','3','14','Peonza mediana, bastante fragil, solo sirve para atacar rapidamente.');
INSERT INTO `proyectopeonzas`.`peonzas` (`nombrePeonza`,`tamanyo`,`precio`,`imagen`,`material`,`cantidad`,`punta`,`cuerda`,`descripcion`) VALUES ('Xcalius','10','20.8','https://raw.githubusercontent.com/AdrianRamiroEscamilla/ProyectoTiendaPeonzas/master/imagenePeonzas/Xcalius.jpg','metal','2','3','3','Peonza grande, giro lento, dura. Si quieres defender esta es tu peonza.');
INSERT INTO `proyectopeonzas`.`peonzas` (`nombrePeonza`,`tamanyo`,`precio`,`imagen`,`material`,`cantidad`,`punta`,`cuerda`,`descripcion`) VALUES ('Sumo','9','14.50','https://raw.githubusercontent.com/AdrianRamiroEscamilla/ProyectoTiendaPeonzas/master/imagenePeonzas/Sumo.jpg','metal','2','2','6','Peonza pesada, de giro lento y muy estable, no conseguiran derribarla.');
INSERT INTO `proyectopeonzas`.`peonzas` (`nombrePeonza`,`tamanyo`,`precio`,`imagen`,`material`,`cantidad`,`punta`,`cuerda`,`descripcion`) VALUES ('Velocirraptor','8.7','16.30','https://raw.githubusercontent.com/AdrianRamiroEscamilla/ProyectoTiendaPeonzas/master/imagenePeonzas/Velocirraptor.jpg','plastico','1','3','7','Peonza ligera y de giro muy rapido.');
INSERT INTO `proyectopeonzas`.`peonzas` (`nombrePeonza`,`tamanyo`,`precio`,`imagen`,`material`,`cantidad`,`punta`,`cuerda`,`descripcion`) VALUES ('Destructor','10','17','https://raw.githubusercontent.com/AdrianRamiroEscamilla/ProyectoTiendaPeonzas/master/imagenePeonzas/Destructor.jpg','madera','3','1','12','Peonza de rapida rotacion pero firme que la hace la mejor apuesta para derribar a tu contrincante.');

