package userServer

import groovy.xml.MarkupBuilder

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.QueryParam
import javax.ws.rs.core.Context

import org.apache.commons.collections.functors.FalsePredicate;


@Path('/')

class Login{

	@Context
	org.glassfish.grizzly.http.server.Request request

	static List <User> userListe = new ArrayList<>()

	@GET
	@Path('/login')

	public def login(@QueryParam('name') String name){
	
		String ip = request.getRemoteAddr()
		User user = new User (name: name, ip:ip)
		for (u in userListe) {
			if(u.name.equals(name)){
				return null;
			}
		}
		return ip
	}
}
