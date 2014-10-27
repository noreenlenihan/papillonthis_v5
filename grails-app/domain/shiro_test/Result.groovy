package shiro_test

class Result {
	
	Date dateOfQuery
	Long metric_1
	Long metric_2
	Long metric_3
	Long metric_4

	static belongsTo = [servers: Server]
    static constraints = {
		
		dateOfQuery()
		metric_1()
		metric_2()
		metric_3()
		metric_4()
    }
}
