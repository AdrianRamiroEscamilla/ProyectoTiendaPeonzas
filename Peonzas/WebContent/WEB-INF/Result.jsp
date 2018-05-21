<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Peonzas</title>
</head>
<body>
<h1>JSP con las peonzas</h1>

		<ul>
			<c:forEach var="peonza" items="${styles}" >
				<li>Try: ${peonza.material}</li>
			</c:forEach>
		</ul>
</body>
</html>