package com.planetaraton.dao

import grails.converters.JSON
import groovy.json.JsonSlurper

import org.codehaus.groovy.grails.commons.GrailsApplication

class HotelDao {

	GrailsApplication grailsApplication
    String hotelDirectory
    
    List getAll() {
            List hotels = []
            
            new File('web-app/' + hotelDirectory).eachFile {
            	if( it.getName().endsWith('.json') ) {
                	hotels.add(new JsonSlurper().parse(new StringReader(it.getText())))
                }
            }
            
            return hotels
    }
	
}
