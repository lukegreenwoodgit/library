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
	<div class="container">
		<div class="jumbotron">
			<h1>Student Home Page</h1>
			<p>Add reviews, read reviews. List books and search for books.</p>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<h3>Add Review</h3>
			<p>To add a book review click the button below.</p>
			<button type="button" class="btn btn-primary">
				<g:link controller="bookReview" action="create">Add Book Review</g:link>
			</button>
		</div>
		<div class="row">
			<h3>List Book Reviews</h3>
			<p>To list book reviews click the button below.</p>
			<button type="button" class="btn btn-primary">
				<g:link controller="bookReview" action="index">List Book Reviews</g:link>
			</button>
		</div>
		<div class="row">
			<h3>List Books</h3>
			<p>To list books click the button below.</p>
			<button type="button" class="btn btn-primary">
				<g:link controller="book" action="index">List Books</g:link>
			</button>
		</div>

		<div class="row">
			<h3>Search Books</h3>
			<p>To search for books click the button below.</p>
			<button type="button" class="btn btn-primary">
				<g:link controller="student" action="search">Search</g:link>
			</button>
		</div>
	</div>
      </div>
   </body>
</html>
