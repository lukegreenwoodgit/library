package com.lgreenwood

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void studyModeSize() {
	when: "A course is created with a title and studyMode"
	def course = new Course (title:'Computing', studyMode:'Full Timeeeeeeeeeeeeeeeeeeeee')
	then: "Validation test should fail"
	!book.validate()
    }
}
