package com.tgreen

class BootStrap {

    def init = { servletContext ->

	def citySurgery= new Surgery (
                surgeryID:'1',
                name:'City Health Centre',
                address:'21 Marble Street, Sheffield',
                postcode:'S11 5TY',
                telephone:'0114555555',
                numberOfPatients:'50',
                description: '"Placeholder text for the description field of this surgery',
                openingTime: '09:00-17:00hrs'
        ).save()




	def drSarah = new Doctor(
		docID: '1',
		fullName:'Dr. Sarah Macdonald',
		qualification: 'MBChB(Sheffield)',
		position: 'GP, Surgeon',
		doctorEmail: 's.macdonald@sheffsurgeries.com',
		password: 'password1',
		location: citySurgery,
		doctorOffice: 'D-9888',
		doctorPhone: '01111777',
		bio: 'Example text for a bio'
	).save()

	def recepA = new Receptionist (
		recepName:'Rob Kingston',
		recepEmail:'r.kingston@sheffsurgeries.com',
		recepUsername:'rking',
		recepPassword:'passwordA',
		recepPhone: '01142224445',
		location: citySurgery
	).save()

	def patA = new Patient (
                patientName: 'Daniel Atla',
                patientAddress: '7 Seskergates',
                patientResidence: 'Rivington',
                patientDob: 12/07/1992,
                patientID: 'E25555',
                dateRegistered: 16/01/1999,
                patientPhone: '0755553288'

        ).save()

	
	def prescripA = new Prescription (
		pharmacyName: 'Holderness Street',
		prescripNumber: '0001',
		medicine: 'Paracetamol A',
		totalCost: '05.00',
		issuedBy: drSarah,
		issuedToPatient: 'patA', 
		dateIssued: 02/02/2020,
		patientPaying: 'true'
	).save()
	
	def nurseA = new Nurse (
		nurseID: '1',
		nurseName: 'Susan Peters',
		qualifications: 'Registered General Nurse',
		nurseEmail: 's.peters@sheffSurgeries.com',
		surgeryAssignedTo: citySurgery,
		nurseOffice: 'B-455',
		nursePhone: '045825062'

	).save()

		
	def nurseB = new Nurse (
		nurseID : '2',
		nurseName: 'Sophie Stead',
		qualifications: 'Registered General Nurse',
		nurseEmail: 's.stead@sheffSurgeries.com',
		surgeryAssignedTo: citySurgery,
		nurseOffice: 'B-456',
		nursePhone: '0789635125'
	).save()
	
	def appointA = new Appointment (
		appointmentID: '1',
		patientID: patA,
		appDate: 20/02/2020,
		appTime: '3:00pm',
		appDuration: '30',
		appointmentLocation: citySurgery,
		roomNumber: 'A-1111',
		doctor: drSarah
	).save()
	


    }
    def destroy = {
    }
}
