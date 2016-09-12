package userServer.controllers

import groovyx.net.http.RESTClient


import javax.ws.rs.core.MediaType
import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.Context

import userServer.User

@Path('/login_user')


class LoginController {
	
	@Context
	
	
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	
	def loginService (User user)
	
	{  
		User myUser= new User (user."Anna")
		eingellogteUsers.put(myUser.name, ip)  // ip
		println "Welcome to MESSAS myUser.name"
		
		
	}
	
	
	static main(args)
	{
		
		def br = new BufferedReader(new InputStreamReader(System.in))
		println "Please enter your username: "
		def myUser = br.readLine()
		println "User name: $myUser"
		
		/*RESTClient client = new RESTClient('http://141.45.207.58:8080/')
		def response = client.get(path: '/login-user')
		assert response.status == 200
		assert response.data == 'Login'*/
		/*loginService()*/
	}
	

}