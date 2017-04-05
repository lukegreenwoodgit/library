<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title></title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
    <asset:stylesheet src="home.css"/>
</head>
<body>
     <div id="content" role="main">
	<div class="container">
		<div class="jumbotron">
			<h1>Librarian Management Page</h1>
			<p>Manage courses, books, students and librarians. Search for students</p>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<h3>Courses Management</h3>
			<p>Click the button below to add a course.</p>
			<button type="button" class="btn btn-primary">
				<g:link controller="course" action="create">Add Course</g:link>
			</button>
		</div>
		<div class="row">
			<h3>Student Management</h3>
			<p>Click the button below to add a student.</p>
			<button type="button" class="btn btn-primary">
				<g:link controller="student" action="create">Add Student</g:link>
			</button>
		</div>
		<div class="row">
			<h3>Book Management</h3>
			<p>Click the button below to add a book.</p>
			<button type="button" class="btn btn-primary">
				<g:link controller="book" action="create">Add Book</g:link>
			</button>
		</div>
		<div class="row">
			<h3>Librarian Management</h3>
			<p>Click the button below to add a librarian.</p>
			<button type="button" class="btn btn-primary">
				<g:link controller="librarian" action="create">Add Librarain</g:link>
			</button>
		</div>

		<div class="row">
			<h3>Search Students</h3>
			<p>Click the button below to search for students.</p>
			<button type="button" class="btn btn-primary">
				<g:link controller="librarian" action="search">Search</g:link>
			</button>
		</div>
	</div>
      </div>
   </body>
</html>
