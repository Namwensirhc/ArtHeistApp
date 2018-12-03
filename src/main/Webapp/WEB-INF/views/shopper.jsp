<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<h1>Welcome Shopper,<br>
 Please fill in the parameters below to find the pieces you are looking to procure. </h1>
<body>

 <form action = "shopper.jsp" method = "POST">
 
         Payment: <input type = "text" name = "payment">
         <br />
         Title: <input type = "text" name = "title" /> 
         <br>
          Size: <input type = "text" name = "size">
         <br />
         Artist: <input type = "text" name = "artist" />
         <br>
          Medium: <input type = "text" name = "medium">
         <br />
         Period: <input type = "text" name = "period" />
         <br />
         <input type = "submit" value = "Submit" />
         <!--submit button goes to shopper results -->
      </form>


</body>
</html>