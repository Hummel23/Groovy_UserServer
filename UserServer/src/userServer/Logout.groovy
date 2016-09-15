package userServer

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.core.Context

import userServer.services.UserService


@Path('/')

class Logout{

	@Context
	org.glassfish.grizzly.http.server.Request request
	
	@GET
	@Path('/logout')

	public boolean logout(){
		String inetAddr = request.getRemoteAddr()
		UserService.instance.removeUserFromList(inetAddr)
	
	}
}

