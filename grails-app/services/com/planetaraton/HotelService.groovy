package com.planetaraton

import com.planetaraton.dao.HotelDao

class HotelService {
	static transactional = false
	
	GrailsApplication grailsApplication
	String hotelDirectory = 'data/notes/hotels'
	
	List getAll() {
		List hotels = []
		
		grailsApplication.mainContext.getResource('/WEB-INF/' + hotelDirectory).getFile().eachFile {
			hotels.add(new JsonSlurper().parse(new StringReader(it.getText())))
		}
		
		return hotels
	}
	
	def get(String hotelId) {
		def hotels = getAll()
		
		return hotels.find {
			it.id == hotelId
		}
	}

}
