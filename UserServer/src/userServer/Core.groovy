package userServer

import javax.ws.rs.GET
import javax.ws.rs.Path

@Path('/')
public class Root {
	@GET
	public String get() {
		return "Hello Server"
	}
}

