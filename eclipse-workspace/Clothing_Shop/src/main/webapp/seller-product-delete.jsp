<%@page import="com.dao.ProductDao"%>
<%
	int pid  = Integer.parseInt(request.getParameter("pid"));
	ProductDao.DeleteProduct(pid);
	request.setAttribute("msg", "Deleted Successfully.");
	request.getRequestDispatcher("seller-view-product.jsp").forward(request, response);
%>