<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<title>Peonzas Details</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Baloo+Chettan|Gloria+Hallelujah|Luckiest+Guy"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Titan+One"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Handlee"
	rel="stylesheet">
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="banner">
		<p>
			<a href="#"><img src="images/home.gif" alt="homepage"></a> | <a
				href="mailto:denise@mitchinson.net"><img src="images/mail.gif"
				alt="contact"></a>
		</p>
		<h1>Peonzas Shop</h1>

	</div>
	<div id="menu">
		<ul id="nav">
			<li id="home" class="activelink"><a href="Control">Home</a></li>
			<li id="who"><a href="#">About</a></li>
			<li id="prod"><a href="#">Product</a></li>
			<li id="serv"><a href="#">Services</a></li>
			<li id="cont"><a href="#">Contact us</a></li>
		</ul>
	</div>
	<div id="container">
		<div id="content">
			<h1>
				Detalles de Usuario <span
					style="font-weight: bold; color: #02c0ff;">${peonza.nombre }</span>
			</h1>
				<div id="vistaDetallada">
									
																			 
					</div>					
					<div id="right">	
						<form method="post" action="BackOffice?name=crear">										
						<p><label>Id de Usuario: </label><input type="text" name="id"value="${usuario.idUsuario}">  </p>
						<p><label>Nombre: </label><input type="text" name="nombre" value=" ${usuario.nombre}"> </p>
						<p><label>Apellidos: </label><input type="text" name="apellidos" value="${usuario.apellidos}">  </p>
						<p><label>Contraseña: </label><input type="text" name="contrasena" value="${usuario.contrasena}">  </p>
						<p><label>Email de Usuario: </label><input type="text" name="email" value="${usuario.email}">  </p>
						<p><label>Nombre usuario: </label><input type="text" name="nombreUsuario"value="${usuario.nombreUsuario}">  </p>
						<p><label>Administrador: </label><input type="text" name="administrador" value="${usuario.administrador}">  </p>
					
						
					
						<input type="submit" name="crear" value="Crear"/>
						
						</form>
						
							
					</div>
            	</div>
       </div>
	</div>				
		</div>
		
		<div id="content_right">
			<dl class="curved">
				<dt>PRODUCTOS POR CATEGORIAS</dt>
				<dd>
					<br />
					<ul id="navlist">
						<li><select name="desplegable" class="desplegable">
								<option value="-MATERIAL" selected="selected">-MATERIAL</option>
								<option value="Madera"><a></a>Madera</option>
								<option value="Metal">Metal</option>
								<option value="Plástico">Plástico</option>
						</select></li>
						<li><select name="desplegable2" class="desplegable">
								<option value="-TAMAÑO" selected="selected">-TAMAÑO</option>
								<option value="Grande">Grande</option>
								<option value="Mediana">Mediana</option>
								<option value="Pequeña">Pequeña</option>
						</select></li>
						<li><select name="desplegable3" class="desplegable">
								<option value="-PRECIO" selected="selected">-PRECIO</option>
								<option value="5-10 €">5-10 €</option>
								<option value="10-15 €">10-15 €</option>
								<option value="15-20 €">15-20 €</option>
						</select></li>
						<li><select name="desplegable4" class="desplegable">
								<option value="-PUNTA" selected="selected">-PUNTA</option>
								<option value="Afilada">Afilada</option>
								<option value="Redonda">Redonda</option>
								<option value="Plana">Plana</option>
						</select></li>
						<li><select name="desplegable5" class="desplegable">
								<option value="-CUERDA" selected="selected">-CUERDA</option>
								<option value="Rígida">Rígida</option>
								<option value="Trenzada">Trenzada</option>
								<option value="Elástica">Elástica</option>
						</select></li>

					</ul>
					<p class="last">&nbsp;</p>
				</dd>
			</dl>
			<dl class="curved">
				<dt>
					Concurso de Peonza<span class="small"> by Con Los mas peques</span>
				</dt>
				<dd>
					<div class="ytp-cued-thumbnail-overlay-image"
						style="background-image: url(&quot;https://i.ytimg.com/vi/w1TExS-ZWyw/hqdefault.jpg&quot;);"></div>
					<p class="last">
						Mas cosas en:<a
							href="https://www.youtube.com/channel/UCfZbR6MabaoHpeKxy_HDNBw">&#0187;
							Con Los Peques</a>
					</p>
				</dd>
			</dl>
			<dl class="curved">
				<dt>AUTORES</dt>
				<dd>
					<p>Los diseñadores de la pagina somos:</p>
					<p class="last">Adrian, Ruben, Francisco, David.</p>
				</dd>
			</dl>
		</div>
	<div id="footer">
		<p>
			<a href="#">homepage</a> | <a href="mailto:peonzasshop@gmail.com">Contact
				US</a> | Licensed under a <a rel="license"
				href="http://creativecommons.org/licenses/by/3.0/">Creative
				Commons Attribution 3.0 License</a>
		</p>
	</div>
</body>
</html>
