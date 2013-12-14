package com.planetaraton

import grails.converters.JSON
import groovy.json.JsonSlurper

import org.codehaus.groovy.grails.commons.GrailsApplication

class HotelService {
	static transactional = false
	
	GrailsApplication grailsApplication
	String hotelDirectory = 'data/notes/hotels'
	
	List getAll() {
		List hotels = []
		
		grailsApplication.mainContext.getResource(hotelDirectory).getFile().eachFile {
			if( it.getName().endsWith('.json') ) {
				hotels.add(new JsonSlurper().parse(new StringReader(it.getText())))
			}
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
