dataSource {
	pooled = true
	jmxExport = true
	driverClassName = "org.postgresql.Driver"
//	username = "nfomreqhhtibsc"
//	password = "wuHqPw9OXjx9CnWzoUHmTEUWSQ" 
	username = "riiqejit"  //application
	password = "coLjz2IQxSBCTk_ul4tEBmMvIhyj6kQv";  //pswForApplication
	
	
}

hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = false
	//cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
	cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
	singleSession = true // configure OSIV singleSession mode
}

// environment specific settings
environments {
	development {
		dataSource {
		 dbCreate = "validate" // one of 'create', 'create-drop', 'update', 'validate', ''
		// url = "jdbc:postgresql://ec2-54-221-253-117.compute-1.amazonaws.com:5432/deeuv84th2tbdp"
		 
		 	url="jdbc:postgresql://qdjjtnkv.db.elephantsql.com:5432/riiqejit";  //serverName:portNo/DBName
		// url="jdbc:postgresql://riiqejit:coLjz2IQxSBCTk_ul4tEBmMvIhyj6kQv@qdjjtnkv.db.elephantsql.com:5432/riiqejit";  //serverName:portNo/DBName
		hibernate.default_schema = "sample"
		properties {
			// See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
			jmxEnabled = true
			initialSize = 5
			maxActive = 500
			minIdle = 50
			maxIdle = 250
			maxWait = 10000
			maxAge = 10 * 6000000
			timeBetweenEvictionRunsMillis = 50000
			minEvictableIdleTimeMillis = 600000
			validationQuery = "SELECT 1"
			validationQueryTimeout = 3
			validationInterval = 15000
			testOnBorrow = true
			testWhileIdle = true
			testOnReturn = false
			jdbcInterceptors = "ConnectionState"
			defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
		}
		
		
		}
	}
	test {
		dataSource {
			dbCreate = "validate" // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:postgresql://10.120.1.8:5432/hcm_qa"
			hibernate.default_schema = "testrm"
		}
	}
	production {
		dataSource {
			dbCreate = "validate" // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:postgresql://10.120.1.8:5432/hcm_qa"
			hibernate.default_schema = "testrm"
			properties {
				// See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
				jmxEnabled = true
				initialSize = 5
				maxActive = 500
				minIdle = 50
				maxIdle = 250
				maxWait = 10000
				maxAge = 10 * 6000000
				timeBetweenEvictionRunsMillis = 50000
				minEvictableIdleTimeMillis = 600000
				validationQuery = "SELECT 1"
				validationQueryTimeout = 3
				validationInterval = 15000
				testOnBorrow = true
				testWhileIdle = true
				testOnReturn = false
				jdbcInterceptors = "ConnectionState"
				defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
			}
		}
	}
}
