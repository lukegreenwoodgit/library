package com.lgreenwood

class BookReview {
	String book
	Date datePublished
	String student
	String review
    static constraints = {
	book blank:false, nullable:false
	datePublished blank:false, nullable:false
	student blank:false, nullable:false
	review blank:false, nullable:false, widget:'textarea', maxSize:5000
    }
}
