package userServer.controller


import groovy.json.JsonBuilder

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

import userServer.services.UserService


@Path('/')

class List{
	
	@GET
	@Path('/list')
	@Produces([MediaType.APPLICATION_JSON])
	def getList(){
		
		def list = UserService.instance.getUserListe()
		return new JsonBuilder(list)
				.toPrettyString()
				
	}

}

