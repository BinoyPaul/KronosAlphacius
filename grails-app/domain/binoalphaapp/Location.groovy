package binoalphaapp

class Location {

	Long locationId
	String locationName
	String country
	
	static mapping =
	{
		id name: "locationId", generator: "sequence", params: [sequence: 'location_location_id_seq']
		version false
	}
	
    static constraints = {
		//locationId nullable: false
		locationName nullable: true
		country nullable: true
	}
}
