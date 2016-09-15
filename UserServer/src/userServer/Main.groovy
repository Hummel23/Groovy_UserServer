package userServer

import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig



class Main {

	static main(args) {  
		
		//start server
		//TODO: IP should be fix
		
		//change to individual local IP
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(
			"http://141.45.206.251:8081".toURI(), new ResourceConfig(Root.class, Login.class, GetList.class, Logout.class))
		println ("press any key to close")
		System.in.read()
		server.stop()
	}
}
