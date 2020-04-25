package com.tgreen

class Nurse {
	int nurseID;
	String nurseName;
	String qualifications;
	String nurseEmail;
	Surgery surgeryAssignedTo;
	String nurseOffice;
	int nursePhone;
	String toString() {
	return nurseName	
	}


    static constraints = {
	nurseName blank:false, nullable: false, maxSize:50
	qualifications blank:false, nullable: false
	nurseEmail email:true, blank:false, nullable: false
	nurseOffice maxSize:5, blank:false, nullable: false
	nursePhone blank:false, nullable: false, maxSize:11
	nurseID blank: false, nullable:false, unique: true
	surgeryAssignedTo blank: false, nullable:false
    }
}
