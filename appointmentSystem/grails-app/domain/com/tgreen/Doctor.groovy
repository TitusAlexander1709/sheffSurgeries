package com.tgreen

class Doctor {
	String fullName;
	String qualification;
	String position;
	String doctorEmail;
	String password;
	String doctorOffice;
	int doctorPhone;
	String bio;





    static constraints = {
	fullName blank:false, nullable: false
	qualification blank:false, nullable: false
	position blank:false, nullable: false, maxSize: 70
	doctorEmail blank:false, nullable: false, email: true, unique: true
	password blank:false, nullable: false, minSize: 6
	doctorOffice blank:false, nullable: false, maxSize: 8
	doctorPhone blank:false, nullable: false, maxSize: 11, unique: true
	bio blank:false, nullable: false, widget: 'textarea', maxSize: 5000








    }
}