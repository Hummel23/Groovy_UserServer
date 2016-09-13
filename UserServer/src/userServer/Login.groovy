package userServer

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
//				for(int i = 0; i < userListe.size(); i++){
//					return userliste[i];
//				}
				return userListe
				
				
		}
}
