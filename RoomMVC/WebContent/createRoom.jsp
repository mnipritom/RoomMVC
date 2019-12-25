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

<title>Create a Room</title>
</head>
<body>
<div id="container">
	
	<div class="roomView">
		<h1>
			Create a Room 
		</h1>
	</div>
	<div class="wallView">
		<form class="forms" action="FormInputs" method="POST">
			Set Room name: <input type="text" name="RoomName"><br>
			Set North Wall name: <input type="text" name="NorthWallName"><br>
			Set East Wall name: <input type="text" name="EastWallName"><br>
			Set West Wall name: <input type="text" name="WestWallName"><br>
			Set South Wall name: <input type="text" name="SouthWallName"><br>
			<input class="buttons" type="submit" value="OK">
		</form>
		
	</div>
	
	
	
</div>

</body>
</html>