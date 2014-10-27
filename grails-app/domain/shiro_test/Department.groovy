package shiro_test

class Department {

	String departmentName
	Long budget
	
	static hasMany = [servers: Server, users: User]
	static belongsTo = [users: User]
	
    static constraints = {
		departmentName()
		budget()
    }
	
	String toString(){
		return departmentName
	}
}
