<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Student Home Page</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
    <asset:stylesheet src="home.css"/>
</head>
<body>
     <div id="content" role="main">
	<div class="row">
		<div class="first">
			<h3>Add Review</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam vitae pretium dolor. Praesent ac felis sed nisi ultrices condimentum ac id neque. Aliquam tincidunt convallis dapibus. Phasellus lobortis, magna id molestie pretium, ipsum felis iaculis diam, vel semper nisi turpis a erat. Pellentesque non dolor ultrices velit dictum finibus at ac augue. Donec eleifend pretium elit, eget ornare velit consectetur in. Donec dapibus bibendum turpis, eget rutrum orci sollicitudin eu. Aliquam erat volutpat. Etiam sit amet porta nunc. Nunc accumsan ligula ex, id lacinia dui consequat at.</p>
			<button type="button" class="btn">
				<g:link controller="bookReview" action="create">Add Book Review</g:link>
			</button>
		</div>
		<div class="second">
			<h3>List Book Reviews</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam vitae pretium dolor. Praesent ac felis sed nisi ultrices condimentum ac id neque. Aliquam tincidunt convallis dapibus. Phasellus lobortis, magna id molestie pretium, ipsum felis iaculis diam, vel semper nisi turpis a erat. Pellentesque non dolor ultrices velit dictum finibus at ac augue. Donec eleifend pretium elit, eget ornare velit consectetur in. Donec dapibus bibendum turpis, eget rutrum orci sollicitudin eu. Aliquam erat volutpat. Etiam sit amet porta nunc. Nunc accumsan ligula ex, id lacinia dui consequat at.</p>
			<button type="button" class="btn">
				<g:link controller="bookReview" action="index">List Book Reviews</g:link>
			</button>
		</div>
		<div class="first">
			<h3>List Books</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam vitae pretium dolor. Praesent ac felis sed nisi ultrices condimentum ac id neque. Aliquam tincidunt convallis dapibus. Phasellus lobortis, magna id molestie pretium, ipsum felis iaculis diam, vel semper nisi turpis a erat. Pellentesque non dolor ultrices velit dictum finibus at ac augue. Donec eleifend pretium elit, eget ornare velit consectetur in. Donec dapibus bibendum turpis, eget rutrum orci sollicitudin eu. Aliquam erat volutpat. Etiam sit amet porta nunc. Nunc accumsan ligula ex, id lacinia dui consequat at.</p>
			<button type="button" class="btn">
				<g:link controller="book" action="index">List Books</g:link>
			</button>
		</div>

		<div class="second">
			<h3>Search Students</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam vitae pretium dolor. Praesent ac felis sed nisi ultrices condimentum ac id neque. Aliquam tincidunt convallis dapibus. Phasellus lobortis, magna id molestie pretium, ipsum felis iaculis diam, vel semper nisi turpis a erat. Pellentesque non dolor ultrices velit dictum finibus at ac augue. Donec eleifend pretium elit, eget ornare velit consectetur in. Donec dapibus bibendum turpis, eget rutrum orci sollicitudin eu. Aliquam erat volutpat. Etiam sit amet porta nunc. Nunc accumsan ligula ex, id lacinia dui consequat at.</p>
			<button type="button" class="btn">
				<g:link controller="student" action="search">Search</g:link>
			</button>
		</div>
	</div>
      </div>
   </body>
</html>
