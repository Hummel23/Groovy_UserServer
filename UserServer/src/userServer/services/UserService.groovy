package userServer.services

import java.util.concurrent.LinkedBlockingQueue

import userServer.controller.Login
import userServer.model.User

@Singleton
class UserService {

	static def userListe = [] as LinkedBlockingQueue<User>


	boolean removeUserFromList(def inetAddr){

		boolean success = false
		
		//ODER		
//				userListe.each{ it -> it.ip == inetAddr
//					userListe.remove(it)
//					success = true
//				}
		for (u in userListe) {
			if(u.ip.equals(inetAddr)) {
				assert u.ip == inetAddr
				userListe.remove(u)
				success = true

			}
		}
		return success
	}

	def findInetAddr (String name){
		def ip = ""
		for(u in userListe){
			if(u.name.equals(name)){
				ip=u.ip
			}
		}
		return ip
	}

	void addUser (User user){
		userListe.add(user)
	}

	boolean checkNamePresent(String name){
		boolean namePresent = false
		for (u in userListe) {
			if(u.name.equals(name)){
				namePresent = true
			}
		}
		return namePresent
	}
}



