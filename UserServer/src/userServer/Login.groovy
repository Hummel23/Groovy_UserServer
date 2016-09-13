package userServer

import groovy.xml.MarkupBuilder

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.QueryParam
import javax.ws.rs.core.Context

 
@Path('/')

class Login{
	
	    @Context 
		org.glassfish.grizzly.http.server.Request request
	
		static List <User> userListe = new ArrayList<>()
		
		@GET
		@Path('/login')
		
		public String get(
				@QueryParam('name') String name){ 
				
		        String ip = request.getRemoteAddr()
		        User user = new User (name: name, ip:ip)
				Login.userListe.add(user)	
			//	return userListe

				//erzeugt JSON
                 def builder = new groovy.json.JsonBuilder()
				 builder {
					 rows (userListe.collect{pair -> [pair.collect {item ->  item}]})
				 }
				// println builder.toPrettyString()
	}				
}
