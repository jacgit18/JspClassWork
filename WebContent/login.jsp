<!DOCTYPE html>
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
		<legend>SSN # Finder</legend>
		<form action="register">
			Enter SSN #: <input type="text" name="firstName"><br> <input
				type="submit" value="Search">
		</form>
	</fieldset>

</body>
</html>

<!-- 


Design Login web application that validates a student from our CUNY_DB using MVC architecture. 

*Please make sure you put the sqljdbc driver file under /Web-INF/lib folder to test. 
This is required for Webapplication to work with database.

1. Your login.jsp should ask user's ssn number (student's ssn) and move to validateLogin.java servlet.

2. You must have all database related codes isolated into DBUtil.java under DBUtils package.

3. All Beans (student.java) should be under Beans package.

4. If the student exist in the Student table in the database, your validateLogin servlet will move to 
StudentFound.jsp that displays all student information in the Bean (all fields in the student table).

5. If the student doesn't exist, your validateLogin servlet will move to StudentNotFound.
jsp that displays "[SSN] doesn't exist in our database." You must display the SSN user typed in the login page.

6. Make sure you have interface class, business class, and database class.

 -->