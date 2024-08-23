<%@page import="com.bean.User"%>
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
<%	
		User u = (User)request.getAttribute("u");
	if(request.getAttribute("msg")!=null){
%>
		<h3><%= request.getAttribute("msg") %></h3>
<%
	}
%>
	<form action="UserController" method="post" name="Registration">
		<table>
		<tr>
		<td><input type="hidden" name="id" value="<%=u.getId() %>">
		</tr>
			<tr>
				<td>Enter First Name : </td>
				<td><input type="text" name="fname" value="<%=u.getFname() %>"></td>
			 </tr>
			 <tr>
			 	<td>Enter Last Name : </td>
			 	<td><input type="text" name="lname" value="<%=u.getLname() %>"></td>
			 </tr>
			 
			 <tr>
			 	<td> Enter Contact Number : </td>
			 	<td><input type="number" name="mobile" value="<%=u.getMobile() %>"></td>
			 </tr>
			 
			 <tr> 	
			 	<td>Enter Email : </td>
			 	<td><input type="email" name="email" value="<%=u.getEmail() %>"></td>
			 </tr>
			 
			 <tr>
			 	<td>Enter Password : </td>
			 	<td><input type="password" name="password" value="<%=u.getPassword() %>"></td>
			 </tr>
			 
			 <tr>
			 	<td>Confirm Password : </td>
			 	<td><input type="password" name="c_pass" value="<%=u.getPassword() %>"></td>
			 </tr>
			 
			 <tr>
			  	<td colspan="2" align="center"><input type="submit" name="action" value = "Update" class="btn btn-primary">
			  </td>
			  </tr>
		</table>
	</form>
</body>
</html>