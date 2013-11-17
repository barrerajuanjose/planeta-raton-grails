package com.planetaraton

class HomeController {

	def index() {
		def model = [:]
		
		render(view: 'index', model: model)
	}
	
}
