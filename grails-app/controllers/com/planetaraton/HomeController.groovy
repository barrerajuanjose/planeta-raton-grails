package com.planetaraton

class HomeController {

	def index() {
		def model = [:]
		
		println 'llego'
		
		render(view: 'index', model: model)
	}
	
}
