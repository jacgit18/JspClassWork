<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="studentBean" class="coreservletsbean.StudentBean"  />
<jsp:setProperty property="*" name="studentBean"/>

<body>
<ol>
<li> Intial Name  (from jsp:getProperty):
<i>
<jsp:getProperty property="name" name="studentBean"/>
</i>

<li> Intial Age  (from jsp:getProperty):
<i>
<jsp:getProperty property="age" name="studentBean"/>
</i>

<li> Intial Grade  (from jsp:getProperty):
<i>
<jsp:getProperty property="grade" name="studentBean"/>
</i>
</ol>



</body>
</html>