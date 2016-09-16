package userServer.controller

import groovy.json.JsonBuilder

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType

import userServer.services.UserService

@Path('/')
class InetAddr {

	@Context
	org.glassfish.grizzly.http.server.Request request


	@GET
	@Path('/findInetAddr')
	@Produces([MediaType.APPLICATION_JSON])
	public String findInetAddr(@QueryParam('name') String name){
		
		def ip = UserService.instance.findInetAddr(name.trim().toLowerCase())
		return new JsonBuilder(ip).toPrettyString()
		
	}
}

