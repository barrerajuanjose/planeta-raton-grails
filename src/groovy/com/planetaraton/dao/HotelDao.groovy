package com.planetaraton.dao

import grails.converters.JSON
import groovy.json.JsonSlurper
import org.codehaus.groovy.grails.commons.GrailsApplication;

class HotelDao {

	GrailsApplication grailsApplication
	String hotelDirectory
	
	List getAll() {
		List notes = []
		
		grailsApplication.mainContext.getResource(hotelDirectory).getFile().eachFile {
			notes.add(new JsonSlurper().parse(new StringReader(it.getText())))
		}
		
		return notes
	}
	
}
