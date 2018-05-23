USE proyectopeonzas;

-- table usuarios
CREATE TABLE  `usuarios` (
  `idUsuario` int(3) NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(10) NOT NULL,
  `email` varchar(10) NOT NULL,
  `contraseña` varchar(15) BINARY NOT NULL,
  `nombre` varchar(10),
  `Apellidos` varchar(50),
    
    PRIMARY KEY (`idUsuario`)

)ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;