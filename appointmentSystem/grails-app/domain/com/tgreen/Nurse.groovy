package com.tgreen

class Nurse {
	String nurseName;
	String qualifications;
	String nurseEmail;
	String nurseOffice;
	int nursePhone;





    static constraints = {
	nurseName blank:false, nullable: false, maxSize:50
	qualifications blank:false, nullable: false
	nurseEmail email:true, blank:false, nullable: false
	nurseOffice maxSize:5, blank:false, nullable: false
	nursePhone blank:false, nullable: false, maxSize:11

    }
}
