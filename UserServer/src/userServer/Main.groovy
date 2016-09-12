package userServer

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig

class Main {

	static main(args) {
		
		//start server
		//TODO: IP should be fix
		
		//change to individual local IP
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(
			"http://141.45.211.14:8080".toURI(),
			new ResourceConfig(Root.class));
		System.out.println("Press any key to close")
		System.in.read()
		server.stop()
	}

}
