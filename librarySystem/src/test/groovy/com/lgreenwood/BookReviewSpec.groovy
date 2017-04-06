package com.lgreenwood

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(BookReview)
class BookReviewSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void bookReviewInvalidDate() {
	when: "A bookReview is created with a review, datePublished"
	def bookReview = new BookReview (review:'Good Book', datePublished:'today')
	then: "Validation test should fail"
	!bookReview.validate()
    }
}
