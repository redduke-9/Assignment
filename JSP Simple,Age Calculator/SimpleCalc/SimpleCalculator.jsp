<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Calculator</title>
    </head>
  <%   int n1=Integer.parseInt(request.getParameter("num1"));    
 int n2=Integer.parseInt(request.getParameter("num2"));
 int c=0;
		if(request.getParameter("btnsubmit").equals("add"))
		{
		c= n1+n2;
		}
		else if(request.getParameter("btnsubmit").equals("sub"))
		{
		 c=n1-n2;	
		}
		else if(request.getParameter("btnsubmit").equals("mul"))
		{
		  c=n1*n2;	
		}
		else if(request.getParameter("btnsubmit").equals("div"))
		{
			c=n1/n2;
		}
		out.print("<h2>"+"Answer is:" +c+"</h2>");
 %>
 
    </body>
</html>