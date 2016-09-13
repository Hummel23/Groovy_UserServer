package userServer

import java.util.List;

class User {
	
	
	def name
	def ip
		
<<<<<<< HEAD
	
=======

>>>>>>> branch 'master' of https://github.com/Hummel23/Groovy_UserServer
	@Override
	public String toString() {
		return "[name=" + name + ", ip=" + ip + "]";
	}
	/*def inetAddr = findIPAddress()
	
	*//**
	 * Get users IP-address
	 *//*
	String findIPAddress(){
		try {
			def inetAddr 
			return inetAddr
		}
		catch (UnknownHostException e) {
			println "Host not found: " + e.getMessage()
		}
	}*/
}
