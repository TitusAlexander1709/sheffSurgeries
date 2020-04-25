package com.tgreen

class Surgery {
	int surgeryID;
	String name;
	String address;
	String postcode;
	int telephone;
	int numberOfPatients;
	String description;
	String openingTime;
	String toString() {
	return name
	}	


    static constraints = {
	name blank:false, nullable: false
	address blank:false, nullable: false
        postcode blank:false, nullable: false, maxSize: 7
	telephone blank:false, nullable: false, maxSize: 11, unique:true
	numberOfPatients blank:false, nullable: false
	description blank:false, nullable: false, maxSize: 5000, widget: 'textarea'
	openingTime blank:false, nullable: false, maxSize: 16;
	surgeryID blank: false, nullable:false, unique: true
	



	


    }
}

