package userServer

class User {
	
	def name, email
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
