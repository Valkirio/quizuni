<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ attribute name="titulo" required="true" %>
<%@ attribute name="bodyClass" required="false" %>
<%@ attribute name="origem" required="false" %>
<%@ attribute name="extraScripts" fragment="true" %>

<c:url value="/resources/img/" var="img" />
<c:url value="/resources/js/" var="js" />
<c:url value="/resources/materialize/js/" var="matJS" />
<c:url value="/resources/materialize/css/" var="matCSS" />
<c:url value="/resources/css/" var="css" />

<!DOCTYPE html>
<html>
<head>
        <meta charset="utf-8" />    
        <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
    	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    	
    	<!-- Favicons -->
	    <link rel="apple-touch-icon" href="${img}apple-icon.png">
	    <link rel="icon" href="${img}apple-icon.png" type="image/ico" />
	    
        <meta name="description" content="Lisebelly is page made exclusively for site by Lise Store" />
		<meta name="keywords" content="html template, css, free, one page, gym, fitness, web design" />
		<meta name="author" content="Valkirio Andrade for Lisebelly" />
        
        <title>Quiz ${titulo} </title>
               
        <!--     Fonts and icons     -->
	    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
	  	<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/icon?family=Material+Icons"  />
	  		   	   
	    <link rel="stylesheet" href="${matCSS}materialize.min.css">
	    <link rel="stylesheet" href="${css}quizstyle.css">
           
</head>
		
<body class="${bodyClass}" id="${origem}" >	
	
	<c:if test="${origem eq 'ROLE_ADM' }">
		<%@include file="/WEB-INF/views/header_adm.jsp" %>
	</c:if>

	<c:if test="${origem eq 'ROLE_CLI' }">
		<%@include file="/WEB-INF/views/header.jsp" %>
	</c:if>
	
	<jsp:doBody />
		
	<jsp:invoke fragment="extraScripts"/>
	
	<!--   Core JS Files   -->
	<script type="text/javascript" src="${js}jquery-2.1.1.min.js"></script>
    <script src="${matJS}materialize.min.js"></script>    
	<script type="text/javascript" src="${js}main.js" ></script>

</body>
</html>