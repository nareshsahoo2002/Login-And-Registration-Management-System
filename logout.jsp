<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
</head>
<body>
<% 
HttpSession currentsession=request.getSession(false);
		 if(currentsession !=null)
		 {
			 currentsession.invalidate();
		 }
  response.sendRedirect("Index.html");
%>	

</body>
</html>