<%@ include file = "common/header.jspf" %>
	<%@ include file = "common/navigation.jspf" %>
	<div class = "container">
		<div>Welcome ${name}</div>
		<hr>
		<h1>Update Todo Details</h1>
	
		<form:form method = "post" modelAttribute = "todo">
			
			<fieldset class = "mb-3">
				<form:label path = "descriptionString">Description</form:label>
				<form:input type = "text" path = "descriptionString" required = "required"/>
				<form:errors path = "descriptionString" cssClass = "text-warning"/>
			</fieldset>
			
			<fieldset class = "mb-3">
				<form:label path = "targetDate">Target Date</form:label>
				<form:input type = "text" path = "targetDate" required = "required"/>
				<form:errors path = "targetDate" cssClass = "text-warning"/>
			</fieldset>
			
			<fieldset class = "mb-3">
				<form:label path = "done">IS Done?</form:label>
				<form:input type = "text" path = "done" required = "required"/>
				<form:errors path = "done" cssClass = "text-warning"/>
			</fieldset>
		
			<input type = "submit" class = "btn btn-success">
		</form:form>
	</div>
<%@ include file = "common/footer.jspf" %>