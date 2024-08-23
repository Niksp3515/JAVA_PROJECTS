<%@page import="com.dao.CartDao"%>
<%@page import="com.bean.Cart"%>
<%@page import="java.util.List"%>
<% 
		int uid= Integer.parseInt(request.getParameter("uid"));
		List<Cart> list = CartDao.getCartByUser(uid);
		for(Cart c : list){
			CartDao.UpdatePaymentStatus(c.getCid());
		}
		request.getRequestDispatcher("cart.jsp");

%>