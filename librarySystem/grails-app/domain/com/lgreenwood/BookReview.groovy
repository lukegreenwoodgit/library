package com.lgreenwood

class BookReview {
	Book book
	Date datePublished
	Student student
	String review
	
    static constraints = {
	book blank:false, nullable:false
	datePublished blank:false, nullable:false
	student blank:false, nullable:false
	review blank:false, nullable:false, widget:'textarea', maxSize:5000
    }
}
