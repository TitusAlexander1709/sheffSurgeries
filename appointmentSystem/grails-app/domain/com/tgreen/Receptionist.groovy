package com.tgreen

class Receptionist {
	String recepName;
	String recepEmail;
	String recepUsername;
	String recepPassword;
	int recepPhone;



    static constraints = {
	recepName blank:false, nullable: false
	recepEmail email:true, blank:false, nullable: false
	recepUsername blank:false, nullable: false, unique: true, maxSize: 20
	recepPassword blank:false, nullable: false, minSize: 6
	recepPhone blank:false, nullable: false, maxSize: 11, unique: true





    }
}
