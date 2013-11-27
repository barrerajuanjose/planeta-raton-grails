<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'hotels.css')}" type="text/css">
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