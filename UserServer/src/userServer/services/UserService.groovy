package userServer.services

import java.util.concurrent.LinkedBlockingQueue

import userServer.controller.Login
import userServer.model.User

@Singleton
class UserService {

	static def userListe = [] as LinkedBlockingQueue<User>

	boolean removeUserFromList(def inetAddr){
		boolean success = false
		def user = userListe.find{ it -> it.ip == inetAddr}
		if(user){
			userListe.remove(user)
			success = true
		}
		return success
	}

	def findInetAddr (String name){
		def user = userListe.find{ it.name == name }
		return user ? user.ip : ""
	}

	void addUser (User user){
		def oldUser = userListe.find{it.ip == user.ip}
		if(oldUser) { userListe.remove(oldUser) }
		userListe.add(user)
	}

	boolean checkNamePresent(String name){
		def user = userListe.find{it.name == name}
		return user ? true : false
	}
}



