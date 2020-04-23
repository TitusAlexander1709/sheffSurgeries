package com.tgreen

class Surgery {
	String name;
	String address;
	String postcode;
	int telephone;
	int numberOfPatients;
	String description;
	String openingTime;
	


    static constraints = {
	name blank:false, nullable: false
	address blank:false, nullable: false
        postcode blank:false, nullable: false, maxSize: 7
	telephone blank:false, nullable: false, maxSize: 11, unique:true
	numberOfPatients blank:false, nullable: false, max: 50
	description blank:false, nullable: false, maxSize: 5000, widget: 'textarea'
	openingTime blank:false, nullable: false, maxSize: 16;





	


    }
}

