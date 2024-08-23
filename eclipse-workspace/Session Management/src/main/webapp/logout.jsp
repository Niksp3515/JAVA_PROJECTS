<script>
if (window.history.replaceState) {
	window.history.replaceState(null,null,window.location.href);
}
</script>
<%
session.removeAttribute("u");
session.invalidate();
response.sendRedirect("login.jsp");
%>