package com.planetaraton



import spock.lang.*

import com.planetaraton.dao.HotelDao

/**
 *
 */
class HotelServiceTests extends GroovyTestCase {
	HotelService hotelService
	def grailsApplication
	
    void "test something"() {
		println 'llego'
		hotelService.get()
    }
}
