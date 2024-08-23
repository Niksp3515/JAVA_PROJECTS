<%@page import="com.bean.WishList"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.WishListDao"%>
<%
	
	int uid = Integer.parseInt(request.getParameter("uid"));
	int pid = Integer.parseInt(request.getParameter("pid"));
	WishListDao.RemoveFromWishList(uid, pid);
	List<WishList> list = WishListDao.getWishListByUser(uid);
	session.setAttribute("wishlist_count", list.size());
	response.sendRedirect("wishlist.jsp"); 

%>