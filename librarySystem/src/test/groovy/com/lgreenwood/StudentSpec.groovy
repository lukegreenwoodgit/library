package com.lgreenwood

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
	when:"A student has a name"
	def sam = new Student(name:'Sam Allen')
	then:"The toString method should display it."
	sam.toString()=="Sam Allen"
    }
}
