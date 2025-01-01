<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Audit Management System</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="preconnect" href="https://fonts.gstatic.com">


<link
	href="https://fonts.googleapis.com/css2?family=Ubuntu&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://www.w3schools.com/lib/w3-theme-teal.css">
<script src="https://kit.fontawesome.com/a81368914c.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style type="text/css">
* {
	padding: 0;
	margin: 0;
	box-sizing: border-box;
}

body {
	font-family: 'Ubuntu', sans-serif;
	overflow: hidden;
	background-image: url("/images/ad.jpg");
	background-repeat: no-repeat;
	background-size: 100%;
}

.heading {
	text-align: center;
	margin-top: 2%;
}

.wave {
	position: fixed;
	height: 100%;
	width: 50%;
	float: left;
	object-fit: cover;
}

.img {
	display: flex;
	justify-content: flex-end;
	align-items: center;
}

.img img {
	width: 500px;
}

form {
	width: 360px;
}

.login-content img {
	height: 100px;
}

.login-content h2 {
	margin: 15px 0;
	color: #333;
	text-transform: uppercase;
	font-size: 2.9rem;
}

.login-content .input-div {
	position: relative;
	display: grid;
	grid-template-columns: 7% 93%;
	margin: 25px 0;
	padding: 5px 0;
	border-bottom: 2px solid #d9d9d9;
}

.login-content .input-div.one {
	margin-top: 60%;
}

.i {
	color: white;
	display: flex;
	justify-content: center;
	align-items: center;
}

a {
	display: block;
	text-align: right;
	text-decoration: none;
	color: #999;
	font-size: 0.9rem;
	transition: .3s;
}

a:hover {
	color: #38d39f;
}

#cnt1 {
	height: 100%;
	border: 1px solid;
	border-radius: 25px;
	width: 40%;
	padding: 0px;
}
</style>
</head>
<body>
	<div class="heading">
		<h1>
			<b>AMS - Audit Management System</b>
		</h1>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div class="container bg-light" id="cnt1">
		<div
			class="login-content d-flex justify-content-center align-items-center">
			<c:choose>

				<c:when test="${msg == null}">
					<form:form action="/home" modelAttribute="user" method="post">
						<br>
						<div class="form-group">
							<label for="username">Username</label>
							<form:input path="userId" class="input form-control"
								placeholder="Username" />
							<%-- <h5><i class="i fas fa-user-tie"></i><form:input path="userId" class="input form-control text-success" placeholder="Username"/></h5> --%>
							<br> <label for="username">Password</label>
							<!-- <h5><i class="i fas fa-lock"></i></h5> -->
							<form:input type="password" path="password"
								class="input form-control" placeholder="Password" />
						</div>
						<div class="text-center">
							<input type="submit" class="btn btn-success" value="Login">
						</div>
						<br>
					</form:form>
				</c:when>
				<c:when test="${msg != null}">
					<div>${msg}.</div>
					<div>
						<br>
						<br>
						<a href="/loginPage">Click here</a> to login again
					</div>
				</c:when>
			</c:choose>
		</div>
	</div>
	<br>
	<br><br>

	

	<script type="text/javascript">
	    const inputs = document.querySelectorAll(".input");
	
	
	    function addcl(){
	    	let parent = this.parentNode.parentNode;
	    	parent.classList.add("focus");
	    }
	
	    function remcl(){
	    	let parent = this.parentNode.parentNode;
	    	if(this.value == ""){
	    		parent.classList.remove("focus");
	    	}
	    }
	
	
	    inputs.forEach(input => {
	    	input.addEventListener("focus", addcl);
	    	input.addEventListener("blur", remcl);
	    });

    </script>
</body>
</html>