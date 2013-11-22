package com.planetaraton

import com.planetaraton.dao.HotelDao

class HotelService {
	
	HotelDao hotelDao
	
	List get() {
		return hotelDao.get()
	}

}
