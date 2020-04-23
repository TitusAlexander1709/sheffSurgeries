package com.tgreen

class Prescription {
	String pharmacyName;
	int prescripNumber;
	String medicine;
	int totalCost;
	Date dateIssued;
	boolean patientPaying;



    static constraints = {
	pharmacyName blank:false, nullable: false
	prescripNumber blank:false, nullable: false, maxSize: 7, unique:true
	medicine blank:false, nullable: false
	totalCost blank:false, nullable: false, scale: 2
	dateIssued blank:false, nullable: false
	patientPaying blank:false, nullable: false




    }
}
