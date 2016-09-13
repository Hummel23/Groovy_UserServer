package userServer
import userServer.Login

import java.util.List;

import javax.ws.rs.GET
import javax.ws.rs.Path

 
@Path('/')

class GetList{
	
	@GET
	@Path('/list')
	public String getList(){
		
		List <User> userListe
            def builder = new groovy.json.JsonBuilder()
				builder {
					 rows (userListe.collect{pair -> [pair.collect {item ->  item}]})
				} 
				builder.toPrettyString()
				println builder
	}				
}
