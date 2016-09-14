package userServer

import groovy.json.JsonBuilder

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Context


@Path('/')

class Logout{

	@Context
	org.glassfish.grizzly.http.server.Request request

	List<User> userListe = Login.userListe;

//	@GET
	@Path('/logout')

	public boolean logout(){
		boolean logoutSuccess = false;
		
		String ipAdr = request.getRemoteAddr()
		
		for (u in userListe) {
			if(u.ip.equals(ipAdr)) {
				Login.userListe.remove(u)
				logoutSuccess = true;
			}
		}
		return logoutSuccess;		
	}
}

