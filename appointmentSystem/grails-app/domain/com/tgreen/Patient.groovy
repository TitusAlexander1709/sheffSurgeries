package com.tgreen


class Patient {
	String patientName;
	String patientAddress;
	String patientResidence;
	Date patientDob;
	String patientID;
	Date dateRegistered;
	int patientPhone;
	String toString() {
	return patientName 
	}

	static hasMany=[doctors:Doctor, prescriptions:Prescription, surgeries:Surgery]
	static belongsTo=[Doctor, Patient]

    static constraints = {
	patientName blank:false, nullable: false
	patientAddress blank:false, nullable: false, maxSize: 500
	patientResidence blank:false, nullable: false, maxSize: 500
	patientDob blank:false, nullable: false
	patientID blank:false, nullable: false, maxSize: 6
	dateRegistered blank:false, nullable: false
	patientPhone blank:false, nullable: false, unique:true, maxSize:11 
    }


	static mapping = { 
		sort "patientName"
	
	}



}
