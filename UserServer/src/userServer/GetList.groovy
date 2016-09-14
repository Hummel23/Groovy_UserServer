package userServer


import groovy.json.JsonBuilder
import javax.validation.metadata.ReturnValueDescriptor;
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.GenericEntity
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@Path('/')

class GetList{

	@GET
	@Path('/list')
	@Produces([MediaType.APPLICATION_JSON])
	def getList(){
		def list = Login.userListe
		return new JsonBuilder(list)
				.toPrettyString()
	}

}

