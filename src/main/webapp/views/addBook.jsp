<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Josefin+Sans" rel="stylesheet">

<title>Add a Book</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body{
	background-color : Tan;
	width : 70%;
}
label{
font-color: black;
}

</style>
</head>


<body font-color="red">


<div id="container" >
	
	<a class="hiddenanchor" id="toregister"></a>
	<a class="hiddenanchor" id="tologin"></a>
	<div id="wrapper">
		<div id="register" class="animate form">
		<form  action="addBookInfo"> 
				<p><b>Add a Book</b></p> 
		<div class="form-group">
			  <label for="bookId" class="bookId">Book ID:</label>  
			  <input type="text" id="bookId" name="bookId" class="form-control" required="required" placeholder="Enter Book ID">
          </div>
		 
          <div class="form-group">
			  <label for="title" class="title">Title:</label>  
			  <input type="text" id="title" name="title" class="form-control" required="required" placeholder="Enter Book Title">
          </div>
		   
		   <div class="form-group">
			  <label for="price" class="price">Price:</label>  
			  <input type="text" id="price" name="price" class="form-control" required="required" placeholder="Enter Book Price">
          </div>
		   
		   <div class="form-group">
			   <label for="volume" class="volume">Volume:</label>
			   <input type="text" id="volume" name="volume" class="form-control" required="required" placeholder="Enter Volume"/>
           </div>
           
            <div class="form-group">
			   <label for="publishDate" class="publishDate">PublishDate:</label>
			   <input type="date" id="publishDate" name="publishDate" class="form-control" required="required" placeholder="Enter PublishDate"/>
           </div>

            <p style="line-height: 10px; text-align: center;"><button class="btn btn-primary">Add a Book</button></p>
				
			</form>
		</div>
		<div>
			<form action="home">
			<p style="line-height: 10px; text-align: center;"><button class="btn btn-primary">Back To Home</button></p>
			</form>
		</div>
	</div>
	
	
	<c:if test="${not empty bookList}">

		<table style="width:100%" border="5" bordercolor="#000000">
			  <tr>
			    <th>Book ID</th>
			    <th>Book Title</th> 
			    <th>Price</th>
			    <th>Volume</th>
			    <th>Publish Date</th>
			  </tr>
			  
			  
			<c:forEach var="listValue" items="${bookList}">
				
			<tr>
			    <td>${listValue.bookId}</td>
			    <td>${listValue.title}</td> 
			    <td>${listValue.price}</td>
			    <td>${listValue.volume}</td>
			    <td>${listValue.publishDate}</td>
			  </tr>
			  
			</c:forEach>
			
		</table>
	
	</c:if>


</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>