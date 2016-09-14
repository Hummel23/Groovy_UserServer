package userServer
import groovy.json.*

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType

@Path('/')

class Login{

	@Context
	org.glassfish.grizzly.http.server.Request request

	static List <User> userListe = new ArrayList<>()

	@GET
	@Path('/login')
	@Produces([MediaType.APPLICATION_JSON])
	public String login(@QueryParam('name') String name){
		boolean loginSuccess = true;
		String ip = request.getRemoteAddr()
		assert ip instanceof String
		User user = new User (name: name, ip:ip)
		for (u in userListe) {
			if(u.name.equals(name)){
				loginSuccess = false;
			}
		}
		if(loginSuccess){
			Login.userListe.add(user)
		}
		def json = loginSuccess ? new JsonBuilder(ip).toPrettyString() : new JsonBuilder("").toPrettyString()
		return json
	}
}
