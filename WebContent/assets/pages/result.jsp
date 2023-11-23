<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="t-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Resultados</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/styles/result.css">
</head>
<body>
	<header>
		<a href="${pageContext.request.contextPath}/index.jsp">
			<div class="logos">
				<img
					src="${pageContext.request.contextPath}/assets/images/hapvida-logo.png"
					alt="Logo da HapVida"> <img
					src="${pageContext.request.contextPath}/assets/images/notreDame_logo.png"
					alt="Logo da Notredame">
			</div>
		</a>
	</header>

	<section>
		<div class="result">
			<h1>Dois possíveis principais resultados:</h1>


			<img src="${url_image}" alt="" class="result_image">
			
			<c:forEach items="${predictions}" var="p">
				<div class="card-result">
					<div class="doenca">
						<img
							src="${pageContext.request.contextPath}/assets/images/prancheta.png"
							alt="">
						<h3>Tag Name: ${p.getTag_name()}</h3>
					</div>
					<h4>
						
						Probabilidade: <fmt:formatNumber type="percent" maxFractionDigits="3"
							value="${p.getProbability()}" />
					</h4>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>