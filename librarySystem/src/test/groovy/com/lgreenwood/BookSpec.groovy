package com.lgreenwood

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void nullValidBook() {
	when: "A book is created with a title, subject and author"
	def book = new Book (title:'Computing for dummies', subject:'Computing', author:'')
	then: "Validation test should fail"
	!book.validate()
    }

    void maxSizeValidBook() {
	when: "A book is created with a title, subject and isbn"
	def book = new Book (title:'Computing for dummies', subject:'Computing', isbn:'345454545534543543534')
	then: "Validation test should fail"
	!book.validate()
    }
}
