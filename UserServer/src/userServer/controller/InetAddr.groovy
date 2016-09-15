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
		println "This is the result of findInetAddr method: " + ip
		def json = new JsonBuilder(ip).toPrettyString()
		println "this is the json" + json
		return json
	}
}

