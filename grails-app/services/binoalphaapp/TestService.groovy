package binoalphaapp

import grails.transaction.Transactional

@Transactional
class TestService {
	def locationFinder(Long locationId)
	{
		log.debug("The location ID is "+locationId)
		
		/*
		pmtResourceList = new ArrayList<ViewPmtResourceIntegration>()
		pmtResponseResourceList = new ArrayList<PmtResponseResourceWithSowIdAndSubgroupId>()
		pmtResourceList = ViewPmtResourceIntegration.createCriteria().list(){
			and
			{
				eq("pmpkSowId",pmpkSowId)
				eq("pmpkSubgroupId",pmpkSubgroupId)
				le("allocationStartDate",endDate)
				ge("allocationEndDate",startDate)
			}
		}
		*/
		
		def LocationList = new ArrayList<Location>()
		LocationList = Location.createCriteria().list()
		{
				and
				{
					eq("locationId" , locationId)
				}
				
		}
		
		return LocationList.locationName;
	}
   
}
