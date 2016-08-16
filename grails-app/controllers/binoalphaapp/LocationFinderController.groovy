package binoalphaapp

	
import grails.rest.RestfulController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;

class LocationFinderController extends RestfulController{

	static responseFormats = ['json']
/*	EngagementDetailsIfPresentController() {
		super(ViewPmtResourceIntegration)
	}
	*/
	def testService
	
		/**
		 * Hits the {@link resthcm.PmtResourceService}
		 *
		 * @author Binoy.Paul
		 *
		 * @param pmpkSowId and pmpkSubgroupId
		 * @return arrayList , float, float
		 */
	
	@Override
	def save()
	{
		log.debug("Inside locationFinderController save()");
		
	 try
	{
		
		def inputJsonRaw = request.JSON
		log.debug("inputJsonRaw "+inputJsonRaw);
		def inputJson = inputJsonRaw.sows[0];
		log.debug("inputJson "+inputJson);
		
	/*	String pmpkSowId = pmpkSowDetailsInput.pmpk_sow_id
		String pmpkSubgroupId = pmpkSowDetailsInput.pmpk_subgroup_id
	
		log.debug("pmpk SOW ID : "+pmpkSowId)
		log.debug("pmpk Subgroup ID : "+pmpkSubgroupId)
	*/	
		Long locationID = inputJson.locationId; 
		log.debug("locationID from request is "+locationID)
		def locationDetails
		locationDetails = testService.locationFinder(1); 
		
		
		//	log.debug(" This is present in EngagementDetailsIfPresentController "+ pmtResourceService.engDetailsIfPresent(pmpkSowId,pmpkSubgroupId) );
		render(contentType: "application/json") {
				[locationDetails:locationDetails]
		}
	  
	
	}
	 catch(Exception e)
	 {
		 log.debug("At the catch of LocationFinderController save()");
		 log.debug("The error is : "+e);
		 render(contentType: "application/json") {
				[errorMessage:e.toString()]
		}
	 }
	 log.debug("At the end of LocationFinderController save()");
	 }
	
}
