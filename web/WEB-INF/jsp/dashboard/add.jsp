<%@include file="../header.jsp" %>

<h1> ADD CLIENT</h1>
<form method="post" action="${SITE_URL}/dashboard/save">
    <div class="form-group">
        <label>Name</label>
        <input type="text" class="form-control" name="name"/>
    </div>
    
  <div class="form-group">
        <label>Email</label>
        <input type="email" class="form-control" name="email"/>
    </div>
    
   <div class="form-group">
        <label>Contact no</label>
        <input type="text" class="form-control" name="contactNo"/>
    </div>
    
    <div class="form-group">
        <label>Status
            <input type="checkbox"  name="status"/>Active</label>
    </div>
    
    
       
 <button type="submit" class="btn btn-success">
            SAVE
            
        </button>

</form>





<%@include file="../footer.jsp" %>