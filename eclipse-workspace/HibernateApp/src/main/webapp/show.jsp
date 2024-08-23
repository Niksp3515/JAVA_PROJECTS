<%@page import="com.dao.StudentDao"%>
<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
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
	if(request.getAttribute("msg")!=null){
%>
		<h3><%= request.getAttribute("msg") %></h3>
<%
	}
%>
<table border="1" width="100%" cellpadding="10px" cellspacing="10px">

<tr>
		<th>ID</th>
		<th>FIRST NAME</th>
		<th>LAST NAME</th>
		<th>EMAIL</th>
		<th>MOBILE</th>
		<th>PASSOWRD</th>
		<th>EDIT</th>
		<th>DELETE</th>
</tr>
<%
	List<Student> list = StudentDao.getAllStudent();
    for(Student s : list){
  %>
  <tr>
  		<td><%= s.getId() %></td>
  		<td><%= s.getFname() %></td>
  		<td><%= s.getLname() %></td>
  		<td><%= s.getEmail() %></td>
  		<td><%= s.getMobile() %></td>
  		<td><%= s.getPassword() %></td>
  		<td>
  			<form action="StudentController" method="post" name="Edit">
  				<input type="hidden" name="id" value="<%=s.getId() %>">
  				<input type="submit" name="action" value="EDIT" class="btn btn-primary">
  			</form>
  			</td>
  			<td>
  			<form action="StudentController" method="post" name="Delete">
  				<input type="hidden" name="id" value="<%=s.getId() %>">
  				<input type="submit" name="action" value="DELETE" class="btn btn-danger">
  			</form>
  			</td>
  </tr>
  
 <%
    }
 %>

</table>
</body>
</html>