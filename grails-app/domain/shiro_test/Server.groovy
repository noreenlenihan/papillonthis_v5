package shiro_test

class Server {

	String serverName
	String location
	
	static belongsTo = [departments: Department]
	static hasMany = [results: Result]
	
    static constraints = {
		serverName()
		location()
    }
	
	String toString(){
		return serverName
	}
}

