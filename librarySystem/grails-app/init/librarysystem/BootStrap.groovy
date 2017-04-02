package com.lgreenwood

class BootStrap {

    def init = { servletContext ->
	def library1 = new Library(
		name:'The Library',
		address:'123 Library Lane',
		openingHours:'09:00 - 19:00',
		location:'Sheffield',
		studySpaces:50
	).save()

	def library2 = new Library(
		name:'Another Library',
		address:'43 Reading Lane',
		openingHours:'06:30 - 20:00',
		location:'Sheffield',
		studySpaces:100
	).save()

	def librarian1 = new Librarian(
		name:'Ryan Carpenter',
		email:'rcarpenter@thelibrary.org',
		office:'1000',
		userName:'rcarpenter',
		password:'password',
		telephone:'01142254356',
		library: library1
	).save()
	//library1.addToLibrarians(librarian1)

	def librarian2 = new Librarian(
		name:'Shane Allen',
		email:'sallen@anotherlibrary.com',
		office:'1001',
		userName:'sallen1',
		password:'password',
		telephone:'011422543645',
		library: library2
	).save()
	//library2.addToLibrarians(librarian2)

	def course1 = new Course(
		title:'BSc Hon Computing',
		code:'COMP245',
		leader:'Lynne Dawson',
		department:'ACES',
		description:'Computing course',
		studyMode:'Full Time'
	).save()

	def course2 = new Course(
		title:'BSc Hon Computer Science',
		code:'COMP246',
		leader:'Dr James Smith',
		department:'ACES',
		description:'Computer Science course',
		studyMode:'Full Time'
	).save()
	
	def student1 = new Student(
		name:'Sam Allen',
		email:'sallen@shu.ac.uk',
		userName:'sallen',
		password:'password',
		studentID:'B5001010',
		course:course1,
		library:library1
	).save()
	//library1.addToStudents(student1)
	//course1.addToStudents(student1)

	def student2 = new Student(
		name:'Lee Catling',
		email:'lcatling@shu.ac.uk',
		userName:'lcatling',
		password:'password',
		studentID:'B5001011',
		course:course2,
		library:library2
	).save()
	//library2.addToStudents(student2)
	//course2.addToStudents(student2)

	def book1 = new Book(
		title:'Computing 101 for Dummies',
		subject:'Computing',
		author:'Luke Greenwood',
		isbn:'IS234435',
		dateBorrowed:new Date('01/04/2017'),
		returnDate:new Date('01/05/2017'),
		student:student1,
		library:library1,
		overdue:false
	).save()
	//library1.addToBooks(book1)
	//student1.addToBooks(book1)

	def book2 = new Book(
		title:'How to do Computer Science',
		subject:'Computer Science',
		author:'Dr Peter ONeil',
		isbn:'IS2346335',
		dateBorrowed:new Date('02/04/2017'),
		returnDate:new Date('23/04/2017'),
		student:student2,
		library:library2,
		overdue:true
	).save()
	//library2.addToBooks(book2)
	//student2.addToBooks(book2)

	def bookReview1 = new BookReview(
		book:book1,
		datePublished:new Date('01/05/2017'),
		student:student1,
		review:'This book is really good, I finally understand computing now'
	).save()
	//book1.addToBookReviews(bookReview1)

	def bookReview2 = new BookReview(
		book:book2,
		datePublished:new Date('02/05/2017'),
		student:student2,
		review:'This book is ok, not really that useful'
	).save()
	//book2.addToBookReviews(bookReview2)

    }
    def destroy = {
    }
}
