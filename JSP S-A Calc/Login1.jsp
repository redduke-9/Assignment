<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<%    String s1 = request.getParameter("login_uname");
        String s2 = request.getParameter("login_pwd");
        if (s1.equals("Abc") && s2.equals("test"))
        {%>
        <jsp:forward page="Welcome.jsp"/>
<%    } else {%>
        <h5>Login failed</h5>
        <jsp:include page="Login1.html"/>
<%    }%>
</body>
</html>