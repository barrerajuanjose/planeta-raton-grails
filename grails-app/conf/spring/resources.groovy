import com.planetaraton.dao.HotelDao

beans = {
	
	hotelDao(HotelDao) {
		hotelDirectory = '/data/notes/hotels'
		grailsApplication = grailsApplication
	}
}
