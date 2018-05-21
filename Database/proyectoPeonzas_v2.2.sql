DROP DATABASE `proyectoPeonzas`;
-- Base de datos proyectoPeonzas
CREATE DATABASE  IF NOT EXISTS `proyectoPeonzas` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci */;
USE `proyectoPeonzas`;

-- table puntas
CREATE TABLE  `puntas` (
  `idPunta` int(3) NOT NULL AUTO_INCREMENT,
  `nombre_punta` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `tipo_punta` varchar(50),
    PRIMARY KEY (`idPunta`)

)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;


-- table cuerdas
CREATE TABLE  `cuerdas` (
  `idCuerda` int(3) NOT NULL AUTO_INCREMENT,
  `nombre_cuerda` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `longitud` decimal(5,2) ,
  `grosor` decimal(5,2)	,
  PRIMARY KEY (`idCuerda`)

)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- table peonzas
CREATE TABLE  `peonzas` (
  `idPeonza` int(3) NOT NULL AUTO_INCREMENT,
    `nombre` varchar(50) NOT NULL,

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


INSERT INTO `proyectopeonzas`.`cuerdas` (`idCuerda`, `nombre`, `longitud`, `grosor`) VALUES ('1', 'Rígida', 9.5, '2');
INSERT INTO `proyectopeonzas`.`cuerdas` (`idCuerda`, `nombre`, `longitud`, `grosor`) VALUES ('2', 'Trenzada', 15.0, '1.1');
INSERT INTO `proyectopeonzas`.`cuerdas` (`idCuerda`, `nombre`, `longitud`, `grosor`) VALUES ('3', 'Elástica', 90.0, '1.2');
