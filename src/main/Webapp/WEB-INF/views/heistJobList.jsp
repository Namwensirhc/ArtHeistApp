<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Job Board</title>
</head>
<body>

<div class="container">

<h1>Jobs</h1>
			<table class="table">
				<thead>
					<tr> <!-- How many parmeters are we using to search/ display for job board -->
						
						<td>Payment</td>
						<td>Size</td>
						<td>Title</td>
						<td>Artist</td>
						<td>Medium</td>
						<td>Period</td>
						<td>Avalaible?</td>
						<!-- fill with array -->		
						<td><input type="checkbox" name="selected" value="${jobid}"> </td>
						
						<!-- compile checked jobs and store them -->
					</tr>
				</thead>
			<%-- <c:forEach var="m" items="${memberlist}">
	
					<tr>
						<td>${m.memberid }</td>
						<td>${m.membername }</td>
						<td>${m.memberrole }</td>
						<td>${m.team.teamname }</td>
						<td><a class="btn btn-primary" href="/update?personid=${m.memberid }&teamid=${m.teamid}">Edit</a></td>
						<td><a class="btn btn-primary" href="/delete?personid=${m.memberid }">Delete</a></td>
					</tr>
	
				</c:forEach> --%>
		</table>
	<form action="/signup" method="post">
		<p>
			<label for="email">Email:</label> 
			<input id="email" name="email" value="${ param.email }" required minlength="2" />
		</p>
		<p>
			<label for="name">Name:</label> 
			<input id="name" type="name" name="name" required minlength="2" />
		</p>
		<p>
			<button>Submit</button>
		</p>
	</form>

</div>

</body>
</html>