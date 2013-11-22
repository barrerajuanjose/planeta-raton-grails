package com.planetaraton.hotels

import com.planetaraton.HotelService

class HotelController {

	HotelService hotelService
	
    def index() { 
		def hotels = hotelService.getAll()
		
		return [hotels: hotels]
	}
	
	def show() {
		def hotel = hotelService.get(params.id)
		
		return [hotel: hotel]
	}
}
