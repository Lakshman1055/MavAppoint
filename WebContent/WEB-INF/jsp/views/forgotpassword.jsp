<jsp:include page='<%=(String) request.getAttribute("includeHeader")%>' />
	<div class="container">
	<form role="form" action="#" method="post">
		<div class="row">
			<div class="col-md-4 col-lg-4">
			
				<div class="form-group">

					<label for="emailAddress" style="color: #ffffff;">Email
						Address</label> <input type="text" class="form-control"
						name="emailAddress" placeholder="firstname.lastname@mavs.uta.edu"><br>
						
							<label for="securityQuestions" style="color: #ffffff;">Security Questions</label>
						
						<label for="securityQuestion1" style="color: #ffffff;">What is your mother's maiden name ?</label>
						<input type="text" class="form-control" name="securityQuestion1" placeholder="">
						
						<label for="securityQuestion2" style="color: #ffffff;">What is your favorite color ?</label>
						<input type="text" class="form-control" name="securityQuestion2" placeholder="">
						
						<label for="securityQuestion3" style="color: #ffffff;">What is your dream car ?</label>
						<input type="text" class="form-control" name="securityQuestion3" placeholder="">
						

				</div>
			</div>
		</div>
		<div class="g-recaptcha" data-sitekey="6LfdCR4TAAAAAGc8fM3pfK4h4zupK4J62LWSoTPL"></div><br>
		<button type="submit" id="submit" class="btn btn-primary">Submit</button>
	</form>
</div>


<%@include file="templates/footer.jsp" %>