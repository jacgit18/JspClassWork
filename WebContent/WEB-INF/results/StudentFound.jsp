<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"
%>
<%@ taglib uri="/WEB-INF/tlds/csajsp-taglib.tld" 
           prefix="ex" %>

<html>
<head>
<title>MVC With DB</title>
<link rel="stylesheet" href="./css/styles.css" type="text/css" />
</head>

<body>

	<table class="title">
		<tr>
			<th>MVC With DB</th>
		</tr>
	</table>
	<br />
	<fieldset>
		<legend>SSN Search Result</legend>
		<h1>The SSN # is "${ssnInfo.SSN}"</h1>
		
		
		<ex:DBUtil message="Hello Worlds">
		Test
		</ex:DBUtil>
		
		
	
		
		
		
		 




	</fieldset>

</body>
</html>

