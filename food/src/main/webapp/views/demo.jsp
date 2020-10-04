<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

 pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
<!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
   <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

  <!-- gijgo CSS -->
  <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />
  <link rel="stylesheet"  href="../css/movie.css"></link>
<title> BahuBelly </title>
<style>

	table
	{
		border-spacing:0 15px;
	}

  .page-footer
	{
		
		bottom:0;
		width:100%;
		line-height:30px;
		clear: both;
    	position: relative;
    	margin-top: 300px;
	}
	p
	{
		color:#ffffff;
	}
	.material-icons.md-14{
		font-size:20px;
	}
	.input-group-text{
		height:38px;
	}
	.input-group
	{
		margin-top: 20px;
		margin-left: 10px;
		margin-right:40px;
		width:97%;
	}
	.hello
	{
		margin-top:90px;
		margin-left: 20px;
	}
	
	h1
	{
		color:#ffffff;
	}
	body
	{
		height:100%;
	}

	.super
	{
		position:absolute;
		bottom:0;
		width:100%;
		height:60px;
		line-height:40px;
	}

	.footer
	{
		position:absolute;
		width:100%;
		
		line-height:30px;
		 clear: both;
    	margin-top: 250px;
    	margin-bottom:0px;	}

    	h2
	{

		margin-left: 65px;
		margin-top:80px;
	}
	.alert-success
	{
		margin-left: 95px;
	}
	.el
	{
		font-size: 15px;
		line-height:15px;
		color:green;
		text-align: left;
	}
	.footer-new
	{
		position:absolute;
		width:100%;
		
		line-height:30px;
		 clear: both;
    	margin-top: 500px;
    	margin-bottom:0px;	}

    	.alert
	{
		margin-left: 450px;
	}
	.ghosh
	{
		color:black;
		font-size: 15px;
		line-height:18px;
	}

	.case
	{

		margin-left: 450px;
	}
  </style>
</head>
<body>
<div class="hi">
	<nav class="navbar navbar-expand-lg navbar-dark bg-danger">
		<a class="navbar-brand" href="#"><i class="nav-link material-icons">local_dining</i>BahuBelly</a>

		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item">
					<a class="nav-link" href="index">Home</a>
				</li>
				
			</ul>
		</div>
	</nav>
<center><h2>Feed Your Bahubelly</h2></center>
<center>




<form action="register" method="post" ModelAttribute="register">
<table>

<tr>
<td>Name:<input type="text" name="userName" required/><br></td>
</tr>
  
 <tr><td>  Address:<input type="text" name="address" required/></td></tr><br>
 <tr><td>  Phone Number:<input type="text" name="phoneNumber" required/></td></tr><br>
   <tr><td>Choose your item: 
<form:select path="itemList" name="item">

   <form:options items="${itemList }" />

   </form:select></td></tr><br>
   <tr><td> Quantity:<input type="number" name="quantity" required/></td></tr><br>
   </table>
    
    <h6>${total}</h6>
    
    
   <input type="submit" value="Total"/>

   
</form>


<form action="pay" method="get" ModelAttribute="register">
<input type="submit" value="Pay"/>
</form>


</center>


		
		
 <!-- Optional JavaScript -->
  <!-- jQuery first, then Popper.js, then Bootstrap JS -->
  <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
  <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
  <script src="js/myscript.js" type="text/javascript"></script>
  </div>
  </div>		
		
		

</body>
</html>