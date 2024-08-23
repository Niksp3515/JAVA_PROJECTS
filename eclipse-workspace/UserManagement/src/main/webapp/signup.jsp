
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file = "header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
tr,td{
	padding: 20px;
	margin: 20px
}
</style>
</head>
<body>
<%
	if(request.getAttribute("msg")!=null){
%>
		<h3><%= request.getAttribute("msg") %></h3>
<%
	}
%>
	<form action="EmpController" method="post" name="Registration">
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
			 	<td>Enter Password : </td>
			 	<td><input type="password" name="c_pass"></td>
			 </tr>
			 
			 
			 <tr>
			  	<td colspan="2" align="center"><input type="submit" name="action" value = "Sign Up" class="btn btn-primary">
			  </td>
			  </tr>
		</table>
	</form>
	<a href="login.jsp">Already Register</a>
	
</body>
</html>