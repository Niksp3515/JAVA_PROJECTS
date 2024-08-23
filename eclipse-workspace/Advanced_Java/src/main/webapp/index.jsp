<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

	<form action="UserController" method="post" name="Registration">
		<table>
			<tr>
				<td>Enter First Name : </td>
				<td><input type="text" name="fname"></td>
			 </tr>
			 <tr>
			 	<td>Enter Last Name : </td>
			 	<td><input type="text" name="lname"></td>
			 </tr>
			 
			 <tr>
			 	<td> Enter Contact Number : </td>
			 	<td><input type="number" name="mobile"></td>
			 </tr>
			 
			 <tr> 	
			 	<td>Enter Email : </td>
			 	<td><input type="email" name="email"></td>
			 </tr>
			 
			 <tr>
			 	<td>Enter Password : </td>
			 	<td><input type="password" name="password"></td>
			 </tr>
			 
			 <tr>
			 	<td>Confirm Password : </td>
			 	<td><input type="password" name="c_pass"></td>
			 </tr>
			 
			 <tr>
			  	<td colspan="2" align="center"><input type="submit" name="action" value = "Insert" class="btn btn-primary">
			  </td>
			  </tr>
		</table>
	</form>
</body>
</html>