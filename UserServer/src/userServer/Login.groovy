package userServer

import java.util.List;

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.QueryParam
import javax.ws.rs.core.Context

import userServer.services.UserService



@Path('/')

class Login{
	
		static List <User> userListe = new ArrayList<>()
		
		@GET
		@Path('/login')
		
		public String get(
				@QueryParam('name') String name){
//			String ip = request.getRemoteAddr()
//			UserService userService = new UserService()   //= getInstance()
//			userService.userListe.add(new User(name))
				Login.userListe.add(name)
				return userListe
		}
}
