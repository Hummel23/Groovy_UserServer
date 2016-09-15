package userServer

import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig

import userServer.controller.InetAddr
import userServer.controller.List
import userServer.controller.Login
import userServer.controller.Logout



class Main {

	static main(args) {  
		
		//start server
		//TODO: IP should be fix
		
		//change to individual local IP
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(
			"http://141.45.209.103:8081".toURI(), new ResourceConfig(Login.class, List.class, Logout.class, InetAddr.class))
		println ("press any key to close")
		System.in.read()
		server.stop()
	}
}
