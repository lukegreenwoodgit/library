package com.lgreenwood

class LibrarySystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

	def loginToggle = {
	if(request.getSession(false) && session.user) {
		out << "<ul class='nav navbar-nav navbar-right'>"
		if(session.role == 'librarain') {
			out << "<li><a href='${createLink(controller:'librarain',action:'logout')}'>"
			out << "Logout</a></li>"
		} else {
			out << "<li><a href='${createLink(controller:'student',action:'logout')}'>"
			out << "Logout</a></li>"
		}
		out << "</ul>"
		out << "<p class='navbar-text navbar-right'>"
		out << "Welcome ${session.user.name}."
		out << "</p>"
	} else {
		out << "<ul class='nav navbar-nav navbar-right'>"
		out << "<li><a href='${createLink(controller:'librarian',action:'login')}'>"
		out << "Librarain Login</a></li>"

		out << "<li><a href='${createLink(controller:'student',action:'login')}'>"
		out << "Student Login</a></li>"
	}
    }
}
