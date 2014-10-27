import shiro_test.Role
import shiro_test.User

class BootStrap {

	def shiroSecurityService
	
		def init = { servletContext ->
	
			// Create the admin role
			def adminRole = new Role(name: "Administrator")
			adminRole.addToPermissions("*:*")
			adminRole.save()
	
			// Create the user role
			def userRole = new Role(name: "User")
			userRole.addToPermissions("Home:index")
			userRole.addToPermissions("Home:secured")
			userRole.save()
	
			def admin = new User(username: "Admin", passwordHash: shiroSecurityService.encodePassword("password"))
			admin.addToRoles(adminRole)
			admin.save()
			
			def user = new User(username: "User", passwordHash: shiroSecurityService.encodePassword("password"))
			user.addToRoles(userRole)
			user.save()
	}
    def destroy = {
    }
}
