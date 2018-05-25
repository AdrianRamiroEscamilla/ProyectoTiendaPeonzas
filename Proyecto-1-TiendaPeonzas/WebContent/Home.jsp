<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<title>Peonzas Shop</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
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
			<li id="who"><a href="Control?opcion=Backoffice">About</a></li>
			<li id="prod"><a href="#">Product</a></li>
			<li id="serv"><a href="#">Services</a></li>
			<li id="cont"><a href="#">Contact us</a></li>
		</ul>
	</div>
	<div id="container">

		<div id="content">
			<h1>
				Bienvenidos a la tienda online <span
					style="font-weight: bold; color: #02c0ff;">Peonzas Shop</span>
			</h1>
			<p class="big">Esta es la pagina de peonzas online mas famosa del 
			mundo, un poco mas abajo tenemos nuestros productos.</p>
			
			
			<c:forEach var="peonza" items="${productos}" varStatus="loopCount">
				<c:if test="${loopCount.index mod '3' eq 0}">
					<div class="clearbox">
				</c:if>
				<div id="box">
					<h2>
						<img src="images/last.gif" alt="ad">${peonza.nombre}</h2>
					<div id="imgProducto">
						<img src="${peonza.imagen}" alt="${peonza.nombre}">
					</div>
					<blockquote>${peonza.descripcion}</blockquote>
					<p id="precio">Precio : ${peonza.precio} $</p>
					
					                     
                    <a href="Control?opcion=Detalles&idPeonza=${peonza.id}">Ver detalles</a>
                    
				</div>
				<c:if test="${loopCount.count mod '3' eq 0}">
					</div>
				</c:if>
				
			</c:forEach>
			<p></p>
		</div>
		


	<div id="content_right">

			<dl class="curved">
				<dt>PRODUCTOS POR CATEGORIAS</dt>
				<dd>
					<br />
					<ul id="navlist">
						<form method="post" action="Categorias">

						<li><select name="opcion" class="desplegable" >
	
								<option value=-MATERIAL selected="selected">-MATERIAL</option>
								<option value="madera" >Madera</option>
								<option value="metal">Metal</option>
								<option value="plástico">Plástico</option>
								<input type="hidden" name="categoria" value="material" />
								<input type="submit" class="button" value="Enviar">
						</select></li></form>
						<form method="post" action="Categorias">
						<li><select name="opcion" class="desplegable">

								<option value="-TAMAÑO" selected="selected">-TAMAÑO</option>
								<option value=">10.0"><a href="Categorias" >Grande</a></option>
								<option value="> 9.0 and tamanyo <10.0"><a href="Categorias" >Mediana</a></option>
								<option value="<9"><a href="Categorias" >Pequeña</a></option>
								<input type="hidden" name="categoria" value="tamanyo" />
								<input type="submit" class="button" value="Enviar">
						</select></li></form>
						<form method="post" action="Categorias">
						<li><select name="opcion" class="desplegable">
								<option value="-PRECIO" selected="selected">-PRECIO</option>
								<option value="> 10 and precio < 15">10-15 €</option>
								<option value="> 15 and  <20">15-20 €</option>
								<option value=">20">>20 €</option>
								<input type="hidden" name="categoria" value="precio" />
								<input type="submit" class="button" value="Enviar">
						</select></li></form>
						<form method="post" action="Categorias">
						<li><select name="opcion" class="desplegable">
								<option value="-PUNTA" selected="selected">-PUNTA</option>
								<option value="1">Afilada</option>
								<option value="2">Redonda</option>
								<option value="3">Plana</option>
								<input type="hidden" name="categoria" value="punta" />
								<input type="submit" class="button" value="Enviar">
						</select></li></form>
						<form method="post" action="Categorias">
						<li><select name="opcion" class="desplegable">
								<option value="-CUERDA" selected="selected">-CUERDA</option>
								<option value="1">Rígida</option>
								<option value="2">Trenzada</option>
								<option value="3">Elástica</option>
								<input type="hidden" name="categoria" value="cuerda" />
								<input type="submit"  class="button" value="Enviar">
						</select></li></form>

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
		<div id="content">
			<h1>
				Bienvenidos a la tienda online <span
					style="font-weight: bold; color: #02c0ff;">Peonzas Shop</span>
			</h1>
			<p class="big">Esta es la pagina de peonzas online mas famosa del 
			mundo, un poco mas abajo tenemos nuestros productos.</p>
			
			
			<c:forEach var="peonza" items="${productos}" varStatus="loopCount">
				<c:if test="${loopCount.index mod '3' eq 0}">
					<div class="clearbox">
				</c:if>
				<div id="box">
					<h2>
						<img src="images/last.gif" alt="ad">${peonza.nombre}</h2>
					<div id="imgProducto">
						<img src="${peonza.imagen}" alt="${peonza.nombre}">
					</div>
					<blockquote>${peonza.descripcion}</blockquote>
					<p id="precio">Precio : ${peonza.precio} $</p>
				</div>
				<c:if test="${loopCount.count mod '3' eq 0}">
				
					</div>
				</c:if>
			</c:forEach>
			<p></p>
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
