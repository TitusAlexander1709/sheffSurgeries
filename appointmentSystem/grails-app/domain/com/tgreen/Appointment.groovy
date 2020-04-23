package com.tgreen

class Appointment {
	Date appDate;
	String appTime;
	int appDuration;
	String roomNumber;


    static constraints = {
	appDate blank:false, nullable: false
	appTime blank:false, nullable: false, maxSize:7
	appDuration blank:false, nullable: false, max: 60, maxSize: 2
	roomNumber blank:false, nullable: false, maxSize: 6



    }
}
