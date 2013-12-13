<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		
		<p:css name="hotels_css" />
	</head>
	<body>
		<div class="container">
			<div class="col-md-10 description">
				<div class="${hotel.id}"></div>
				<jth:printHtml json="${hotel.text}"/>
			</div>
		</div>
	</body>
</html>