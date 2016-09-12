package userServer

class User {
	
<<<<<<< HEAD
     String name
//, email
//	def inetAddr = findIPAddress()
//	
//	/**
//	 * Get users IP-address
//	 */
//	String findIPAddress(){
//		try {
//			def inetAddr 
//			return inetAddr
//		}
//		catch (UnknownHostException e) {
//			println "Host not found: " + e.getMessage()
//		}
//	}
=======
	
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
>>>>>>> branch 'master' of https://github.com/Hummel23/Groovy_UserServer
}
