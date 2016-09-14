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
		println "on server in /list"
			def list = Login.userListe
			return new JsonBuilder(list)
			.toPrettyString()
			}
//		//TODO: send JSON instead of generic
//		List<User> userListe = Login.userListe;
////		def builder = new groovy.json.JsonBuilder()
////		builder {
////			rows (userListe.collect{pair -> [pair.collect {item ->  item}]})
////		}
////		builder.toPrettyString()
//		GenericEntity<List<User>> genericList = new GenericEntity<List<User>>(userListe) {};
//		//return Response.ok(genericList).build();
//		return Response.ok().entity(genericList).build()
//		//return userListe;
	}

