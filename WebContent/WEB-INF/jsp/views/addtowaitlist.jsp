<jsp:include page='<%=(String) request.getAttribute("includeHeader")%>' />

<h1 style="color: #ffffff;text-align:center;">
Please leave your details to get notified at the earliest time slot available
</h1>

<div class="container">
	<form role="form" action="#" method="post">
		<div class="row">
			<div class="col-md-4 col-lg-4">
			
				<div class="form-group">
				
				<label for="username" style="color: #ffffff;">User Name</label>
				<input type="text" class="form-control" name="username" placeholder="username">
				
				<label for="useremail" style="color: #ffffff;">User Email</label>
				<input type="text" class="form-control" name="useremail" placeholder="firstname.lastname@mavs.uta.edu">
					
				</div>
			</div>
		</div>
		
		<button type="submit" id="submit" class="btn btn-primary">Submit</button>
	</form>
</div>

<%@include file="templates/footer.jsp" %>