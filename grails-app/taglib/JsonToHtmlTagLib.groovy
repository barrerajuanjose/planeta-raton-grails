
class JsonToHtmlTagLib {
	
	static namespace = 'jth'

	def printHtml = { attrs ->
		out << attrs.json
	}
	
}
