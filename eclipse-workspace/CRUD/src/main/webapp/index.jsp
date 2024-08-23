<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" name="insert" method="post">
		<table cellpadding="10px" cellspacing="20px">
			<tr>
				<td>First Name : </td>
				<td><input type="text" name="fname"></td>
			</tr>
			<tr>
				<td>Last Name : </td>
				<td><input type="text" name="lname"></td>
			</tr>
			<tr>
				<td>Email : </td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Mobile :  </td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" name="submit" value="INSERT">
			</tr>
		</table>
	</form>
</body>
</html>