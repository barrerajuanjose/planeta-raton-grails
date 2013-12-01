package com.planetaraton

import com.planetaraton.dao.HotelDao

class HotelService {
	static transactional = false
	
	HotelDao hotelDao
	
	List getAll() {
		return hotelDao.getAll()
	}
	
	def get(String hotelId) {
		def hotels = getAll()
		
		return hotels.find {
			it.id == hotelId
		}
	}

}
