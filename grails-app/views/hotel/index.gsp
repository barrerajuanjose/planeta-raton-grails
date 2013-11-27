<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
	</head>
	<body>
		<div class="container">
			<div class="col-md-10">
				<g:each in="${hotels}" var="hotel">
					<a href="/hotel/show/${hotel.id}">${hotel.name}</a>
				</g:each>
			</div>
		</div>
	</body>
</html>