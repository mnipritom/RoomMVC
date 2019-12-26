<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="${pageContext.request.contextPath}/assets/css/wallViewProperties.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath}/assets/css/roomViewProperties.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath}/assets/css/globalAttributes.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath}/assets/css/textFormat.css" rel="stylesheet" type="text/css"/>

<title>Room List</title>
</head>
<body>
<div id="container">
	
	<div class="roomView">
		<h1>Room Name:</h1>
		<h3>User Name</h3>
	</div>
	
	<div class="wallView">
		<div class="wallViewContent">
			<c:forEach items ="${allAvailableRooms}" var = "wall" begin="1" end="4">
				<div class="wallViewWallName">
					<section>${items.wall} :</section>
						<c:forEach var = "note" begin = "1" end = "20">
							<div class="wallViewNoteName">
								<section><h1>Note: ${note}</h1></section>
								<section>Note ${note} Description.</section>		
							</div>
						</c:forEach>
				</div>
			</c:forEach>
		</div>
	</div> 
	
</div>

</body>
</html>