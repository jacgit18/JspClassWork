<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="colorBean1" class="coreservletsbean.ColorBean" />
<jsp:setProperty name="colorBean1" property="*" />
<body
	BGCOLOR="<jsp:getProperty 
                 name="colorBean1" 
                 property="backgroundColor"/>"
	TEXT="<jsp:getProperty 
                 name="colorBean1" 
                 property="foregroundColor"/>">

	<H1>This is the color page</H1>

</body>
</html>





