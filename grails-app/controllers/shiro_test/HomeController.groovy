package shiro_test

<<<<<<< HEAD

import org.apache.shiro.authc.UsernamePasswordToken
import org.apache.shiro.SecurityUtils
import shiro_test.User
import shiro_test.Role

	
class HomeController {
	
	def shiroSecurityService

    def index() {
    }
	
	def secured(){
		render "This is secured"
	}
	
	def signin(){
		
		// Check to see if the username already exists
		def user = User.findByUsername(params.username)
		
		// Login user
		def authToken = new UsernamePasswordToken(user.username, params.password)
		SecurityUtils.subject.login(authToken)

		redirect(controller: 'dashboard', action: 'index')
		
	}

 
=======
class HomeController {

    def index() {
        render "This page is not secured"
    }

    def secured() {
       render "This page requires a user to be logged in"
    }

    def admin() {
       render "This page requires the logged in user to be an administrator"
    }
>>>>>>> 5596933d044abc50e7d7ca724273c94e949f6669
}
