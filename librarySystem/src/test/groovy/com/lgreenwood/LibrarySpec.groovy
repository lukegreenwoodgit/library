package com.lgreenwood

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void libraryStudySpaces() {
	when: "A library is created with a name and studySpaces"
	def library = new Library (name:'Adsetts', studySpaces:'string')
	then: "Validation test should fail"
	!library.validate()
    }

    void libraryMaxStudySpaces() {
	when: "A library is created with a name and studySpaces"
	def library = new Library (name:'Adsetts', studySpaces:3000)
	then: "Validation test should fail"
	!library.validate()
    }

    void libraryMinStudySpaces() {
	when: "A library is created with a name and studySpaces"
	def library = new Library (name:'Adsetts', studySpaces:0)
	then: "Validation test should fail"
	!library.validate()
    }
}
