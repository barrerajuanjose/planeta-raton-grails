<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		
	</head>
	<body>
		<div class="container">
			<div class="col-md-10">
				<ul>
					<g:each in="${hotels}" var="hotel">
						<li>
							<a href="/hotel/show/${hotel.id}">${hotel.name}</a>
						</li>
					</g:each>
				</ul>
			</div>
		</div>
	</body>
</html>