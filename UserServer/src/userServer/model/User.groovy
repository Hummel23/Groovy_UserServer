package userServer.model

import java.util.List;

class User {
	
	
	String name
	def ip
		
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
