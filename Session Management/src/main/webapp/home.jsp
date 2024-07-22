<%@page import="com.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Au Register Forms by Colorlib</title>

    <!-- Icons font CSS-->
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="css/main.css" rel="stylesheet" media="all">

</head>
	
	<%
		User u = null;
		if(session != null){
			if(session.getAttribute("u") != null){
				u = (User)session.getAttribute("u");
			}
		}
	%>

<body>
    <div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                
                	<%
                	try{
                		if(u!=null){
                	%>
                    <h2 class="title">Home</h2>
                   	 <a href="logout.jsp">LOGOUT</a> ||
                     <a href="change-password.jsp">CHANGE PASSWORD</a> ||
                     <a href="profile.jsp">PROFILE</a>
                     <a href="home.jsp"> HOME</a> 
                    <br>
                    <br>
                    <h3 style="color: blue;">
                        	 <%
                        		if(request.getAttribute("msg")!=null){
                        			String s =(String) request.getAttribute("msg");
                        		
                        	%>
                        	<script type="text/javascript">
                        		alert("<%=s%>");
                        	</script>
                        <%
                        		}
                        %>
                    </h3>
                    <h1>Welcome To Home Page</h1>
                    <%
                		}
                	else{
                		response.sendRedirect("login.jsp");
                	}
                	}
                	catch (Exception e){
                		e.printStackTrace();
                	}
                    %>
                    
                    
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="vendor/select2/select2.min.js"></script>
    <script src="vendor/datepicker/moment.min.js"></script>
    <script src="vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="js/global.js"></script>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->