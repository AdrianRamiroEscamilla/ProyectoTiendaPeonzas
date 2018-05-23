USE proyectopeonzas;

DROP TABLE IF EXISTS `usuarios`;

-- table usuarios
CREATE TABLE  `usuarios` (
  `idUsuario` int(3) NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(10) NOT NULL UNIQUE,
  `email` varchar(50) NOT NULL UNIQUE,
  `contraseña` varchar(15) BINARY NOT NULL,
  `nombre` varchar(10),
  `apellidos` varchar(50),
  `administrador` boolean NOT NULL,
    
    PRIMARY KEY (`idUsuario`)

)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;