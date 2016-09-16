package userServer

import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig

import userServer.controller.InetAddr
import userServer.controller.List
import userServer.controller.Login
import userServer.controller.Logout



class Main {

	/**
	 * to start server:
	 * change IP to individual local inetAddr
	 * @param args
	 */
	static main(args) {
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(
				"http://141.45.206.251:8081".toURI(), new ResourceConfig(Login.class, List.class, Logout.class, InetAddr.class))
		println ("press any key to close")
		System.in.read()
		server.stop()
	}
}
