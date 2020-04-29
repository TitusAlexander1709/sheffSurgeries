package com.tgreen

class Appointment {
	Patient patientID;
	Date appDate;
	String appTime;
	int appDuration;
	Surgery appointmentLocation;
	String roomNumber;
	Doctor doctor;
	String toString() {
	return appDate
	}
	
	

    static constraints = {
	patientID blank: false, nullable:false
	appDate blank:false, nullable: false
	appTime blank:false, nullable: false, maxSize:7
	appDuration blank:false, nullable: false, max: 60, maxSize: 2
	roomNumber blank:false, nullable: false, maxSize: 6
	appointmentLocation blank: false, nullable:false
	doctor blank: false, nullable:false
    }
}
