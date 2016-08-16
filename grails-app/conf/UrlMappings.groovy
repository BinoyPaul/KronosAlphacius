class UrlMappings {

	static mappings = {
//		"/pmtResource/$pmpkSowId/$pmpkSubgroupId"(controller:"Pmt",action:"pmtResource",parseRequest: true)
//        "/rest/$pmpkSowId/$pmpkSubgroupId"(resource:"pmtRest",parseRequest: true){
//        action = [GET: "show"]
//        }
       
		"/locationRetrieve"(resource:"LocationFinder",parseRequest: true){
			action = [POST: "save"]
			}
		
		/*
			//For reference
		//Engagement details sent, if present - Binoy begin
		"/rest/engDetailIfPresent"(resource:"EngagementDetailsIfPresent",parseRequest: true){
			action = [POST: "save"]
			}	
		//Engagement details sent, if present - Binoy begin
		 
        "/rest/pushAccount"(resource:"pmtAccountPush",parseRequest: true){
        action = [POST: "save",PUT :"update"]
        }
         */
		
        "/$controller/$action?/$id?(.$format)?"(view:'/error')
        "/"(view:'/error')
        "500"(view:'/error')
	} 
}

   