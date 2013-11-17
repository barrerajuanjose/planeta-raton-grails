package com.planetaraton

import com.planetaraton.dao.HotelDao

class HotelService {
	
	HotelDao hotelsDao
	
	List get() {
		return hotelsDao.get()
	}

}
