package userServer.controller


import groovy.json.JsonBuilder

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType

import userServer.model.User
import userServer.services.UserService

@Path('/')

class Login{

	@Context
	org.glassfish.grizzly.http.server.Request request

	
	@GET
	@Path('/login')
	@Produces([MediaType.APPLICATION_JSON])
	public String login(@QueryParam('name') String name){
		boolean namePresent = UserService.instance.checkNamePresent(name);
		String ip = request.getRemoteAddr()
		if(!namePresent){
			User user = new User (name: name, ip:ip)
			UserService.instance.addUser(user)
		}
		def json = namePresent ? new JsonBuilder("").toPrettyString():new JsonBuilder(ip).toPrettyString()  
		return json
	}
}
