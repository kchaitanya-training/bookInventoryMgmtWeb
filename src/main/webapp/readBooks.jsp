<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page  import="com.takeo.model.Book" %>
        <%@ page  import="java.util.List" %>
          <%@ page  import="java.util.ArrayList" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form  action=" readBook" method="get">

<% if(request.getAttribute("books")!=null){ 
List<Book> books=(List)request.getAttribute("books");%>
<table border="1">

<%
for(Book book:books){
	 %>
<tr>
<td><%=book.getBookId() %></td>
<td><%=book.getBookName() %></td>
<td><%=book.getPrice() %></td>
</tr>


<%
}%>
</table>
<%} %>
 <input type="submit" value="ReadData">
</form>
</body>
</html>