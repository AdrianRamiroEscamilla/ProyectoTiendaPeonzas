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
			<li id="home" class="activelink"><a href="Control?opcion=Home">Home</a></li>
			<li id="who"><a href="Control?opcion=Backoffice">BackOffice</a></li>
			<li id="prod"><a href="#">Product</a></li>
			<li id="serv"><a href="#">Services</a></li>
			<li id="cont"><a href="#">Contact us</a></li>
		</ul>
	</div>
	<div id="container">
		<div id="content">
			<h1>
				Detalles de peonza <span
					style="font-weight: bold; color: #02c0ff;">${peonza.nombre }</span>
			</h1>
				<div id="vistaDetallada">
									
					<h1 id="nomP">${peonza.nombre}</h1>
					
					<div id="left">
						<div id="imgProducto">
							<img src="${peonza.imagen}" alt="${peonza.nombre}">
						</div>																	 
					</div>					
					<div id="right">											
						<p> ID: ${peonza.id} $</p>
						<p> Tamaño: ${peonza.tamanyo}</p>
						<p> Material: ${peonza.material}</p>
						<p> Punta: ${peonza.punta.nombre}</p>
						<p> Cuerda: ${peonza.cuerda.nombre}</p>
						<blockquote>${peonza.descripcion}</blockquote>
						<p id="precio">Precio : ${peonza.precio} $</p>
						<a href="#" class='button'>Comprar</a>
						<input type="hidden" name="compra" value="${peonza.id}">			
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
								<input type="hidden" name="categoria" value="material" />
								<input type="submit" class="button" value="Enviar">
						</select></li>
						<li><select name="desplegable2" class="desplegable">
								<option value="-TAMAÑO" selected="selected">-TAMAÑO</option>
								<option value="Grande">Grande</option>
								<option value="Mediana">Mediana</option>
								<option value="Pequeña">Pequeña</option>
								<input type="hidden" name="categoria" value="tamanyo" />
								<input type="submit" class="button" value="Enviar">
						</select></li>
						<li><select name="desplegable3" class="desplegable">
								<option value="-PRECIO" selected="selected">-PRECIO</option>
								<option value="5-10 €">5-10 €</option>
								<option value="10-15 €">10-15 €</option>
								<option value="15-20 €">15-20 €</option>
								<input type="hidden" name="categoria" value="precio" />
								<input type="submit" class="button" value="Enviar">
						</select></li>
						<li><select name="desplegable4" class="desplegable">
								<option value="-PUNTA" selected="selected">-PUNTA</option>
								<option value="Afilada">Afilada</option>
								<option value="Redonda">Redonda</option>
								<option value="Plana">Plana</option>
								<input type="hidden" name="categoria" value="punta" />
								<input type="submit" class="button" value="Enviar">
						</select></li>
						<li><select name="desplegable5" class="desplegable">
								<option value="-CUERDA" selected="selected">-CUERDA</option>
								<option value="Rígida">Rígida</option>
								<option value="Trenzada">Trenzada</option>
								<option value="Elástica">Elástica</option>
								<input type="hidden" name="categoria" value="cuerda" />
								<input type="submit"  class="button" value="Enviar">
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
