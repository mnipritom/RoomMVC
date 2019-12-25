<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="${pageContext.request.contextPath}/assets/css/wallViewProperties.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath}/assets/css/roomViewWithHoverEffect.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath}/assets/css/globalAttributes.css" rel="stylesheet" type="text/css"/>
<link href="${pageContext.request.contextPath}/assets/css/textFormat.css" rel="stylesheet" type="text/css"/>

<title>SplashScreen</title>
</head>
<body>
<div id="container">
	
	<div class="roomView">
		<h1>Skeuomorphic UX</h1>
		<p>Project Author: </p>
	</div>
	
	<div class="wallView">
		<div class="wallViewContent">
			<c:forEach var = "wall" begin = "1" end = "4">
				<div class="wallViewWallName">
					<section>Wall: ${wall}</section>
						<c:forEach var = "note" begin = "1" end = "4">
							<div class="note">
								<section>Note: ${note}</section>		
							</div>
						</c:forEach>
				</div>
			</c:forEach>
		</div>
	</div> 
	
</div>

</body>
</html>