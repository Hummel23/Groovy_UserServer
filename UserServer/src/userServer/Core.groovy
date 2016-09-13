package userServer

import groovy.json.JsonBuilder

import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.UriInfo
import userServer.services.UserService


@Path('/')
class Root {

	@GET
	@Path('/resource')
	@Produces([MediaType.APPLICATION_JSON])
	def resource() {
		new JsonBuilder("Hello Server")
				.toPrettyString()

	}
}