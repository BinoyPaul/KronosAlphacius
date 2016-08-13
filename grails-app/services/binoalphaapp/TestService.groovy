package binoalphaapp

import grails.transaction.Transactional

@Transactional
class TestService {
	def locationFinder(String locationId)
	{
		log.debug("The location ID is "+locationId)
		
		
	}
   
}
