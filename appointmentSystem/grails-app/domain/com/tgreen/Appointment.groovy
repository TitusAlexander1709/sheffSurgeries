package com.tgreen

class Appointment {
	int appointmentID;
	Patient patientID;
	Date appDate;
	String appTime;
	int appDuration;
	Surgery appointmentLocation;
	String roomNumber;
	Doctor doctor;


    static constraints = {
	appDate blank:false, nullable: false
	appTime blank:false, nullable: false, maxSize:7
	appDuration blank:false, nullable: false, max: 60, maxSize: 2
	roomNumber blank:false, nullable: false, maxSize: 6
	appointmentID blank: false, nullable:false, unique: true
	appointmentLocation blank: false, nullable:false, unique: true
	doctor blank: false, nullable:false, unique: true
	patientID blank: false, nullable:false, unique: true
    }
}
