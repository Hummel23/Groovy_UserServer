package userServer

import java.util.List;

class User {
	
	
	def name
<<<<<<< HEAD
	//def ip
=======
	def ip
		
	
	
>>>>>>> branch 'master' of https://github.com/Hummel23/Groovy_UserServer.git

<<<<<<< HEAD
	def inetAddr = findIPAddress()
=======
	
	
	@Override
	public String toString() {
		return "[name=" + name + ", ip=" + ip + "]";
	}
	/*def inetAddr = findIPAddress()
>>>>>>> branch 'master' of https://github.com/Hummel23/Groovy_UserServer.git
	
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
