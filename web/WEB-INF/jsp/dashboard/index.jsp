<%@include file="../header.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1> Client Management System</h1>
<div class="container" >
</div>
<input type="search" name="search"/><span class="glyphicon glyphicon-search"></span>
<br/>
<table class="table table-striped table-hover">
    <tr>
    <th>ID</th>
    <th>NAME</th>
    <th>EMAIL</th>
    <th>Contact Number</th>
    <th>Status</th>
    </tr>
    
    <c:forEach var="client" items="${clients}">
    <tr>
        <td>${client.clientId}</td>
         <td>${client.name}</td>
          <td>${client.email}</td>
           <td>${client.contactNo}</td>
            <td>
                <c:choose>
                <c:when test="${client.status}">
                    Active
                </c:when>
                    <c:otherwise>
                        Inactive
                    </c:otherwise>
                        </c:choose>
            
            
            </td>
        
        
        
    </tr>
    </c:forEach>
    
    
</table>
        
 <%@include file="../footer.jsp" %>