package userServer

import groovy.json.JsonBuilder

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

//@Path('/')
//public class Root {
//	@GET
//	public String get() {
//		return "Hello Server"
//	}
//}

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
