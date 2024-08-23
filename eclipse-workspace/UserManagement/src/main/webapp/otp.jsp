<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
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
		 <td><input type="hidden" name="otp1" value="<%=request.getAttribute("otp1")%>"> </td>
		 <td><input type="hidden" name="email" value="<%=request.getAttribute("email")%>"> </td>
		</tr>
			 <tr> 	
			 	<td>Enter OTP : </td>
			 	<td><input type="text" name="otp2"></td>
			 </tr>
		
			 <tr>
			  	<td colspan="2" align="center"><input type="submit" name="action" value = "Verify OTP" class="btn btn-primary">
			  </td>
			
			  </tr>
		</table>
	</form>
	
</body>
</html>