package userServer.services

import java.util.concurrent.LinkedBlockingQueue

import userServer.controller.Login
import userServer.model.User

@Singleton
class UserService {

	static def userListe = [] as LinkedBlockingQueue<User>


	boolean removeUserFromList(def inetAddr){

		boolean success = false
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
		for(user in userListe){
			if(user.name == name){
				return user.ip
			}else{
				return ""
			}
		}
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



