<%@page import="java.util.List"%>
<%@page import="com.dao.WishListDao"%>
<%@page import="com.bean.WishList"%>
<%
	int pid = Integer.parseInt(request.getParameter("pid"));
	int uid = Integer.parseInt(request.getParameter("uid"));
	WishList w= new WishList();
	w.setPid(pid);
	w.setUid(uid);
	WishListDao.AddToWishList(w);
	List<WishList> list = WishListDao.getWishListByUser(uid);
	session.setAttribute("wishlist_count", list.size());
	response.sendRedirect("wishlist.jsp");
%>