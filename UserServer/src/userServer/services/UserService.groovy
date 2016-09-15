package userServer.services

import userServer.Login

@Singleton
class UserService {	

	def boolean removeUserFromList(def inetAddr){
		
		boolean success = false	
		for (u in Login.userListe) {
			if(u.ip.equals(inetAddr)) {
				println u.ip
				assert u.ip == inetAddr
				Login.userListe.remove(u)
				success = true
		
			}
		}
		return success
	}	
}
