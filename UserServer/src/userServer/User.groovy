package userServer

import java.util.List;

class User {
	
	
	def name
	//def ip
	
	

	
	
	def inetAddr = findIPAddress()
	
	/**
	 * Get users IP-address
	 */
	String findIPAddress(){
		try {
			def inetAddr 
			return inetAddr
		}
		catch (UnknownHostException e) {
			println "Host not found: " + e.getMessage()
		}
	}
}
