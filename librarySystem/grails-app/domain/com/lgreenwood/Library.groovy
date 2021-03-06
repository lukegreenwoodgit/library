package com.lgreenwood

class Library {
	String name
	String address
	String openingHours
	String location
	int studySpaces
	static hasMany=[books:Book, librarians:Librarian, students:Student]
	
	String toString() {
		"$name"
	}

    static constraints = {

	name blank:false, nullable:false
	address blank:false, nullable:false, widget:'textarea'
	openingHours blank:false, nullable:false
	location blank:false, nullable:false
	studySpaces blank:false, nullable:false, min:1, max:200
    }
}
