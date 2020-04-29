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

	def ruralSurgery= new Surgery (
		surgeryID:'2',
		name: 'Park Lane Surgery',
		address: '17 Oaken Road',
		postcode: 'S02 7HY',
		telephone: '0215478193',
		numberOfPatients: '200',
		description: '"full description of surgery"',
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

	def drCope = new Doctor(
		docID: '2',
		fullName: 'Dr. Horace Cope',
		qualification: 'MBChB(Cambridge)',
		position: 'GP, Surgeon',
		doctorEmail: 'h.cope@sheffSurgeries.com',
		password: 'password2',
		location: ruralSurgery,
		doctorOffice: 'D-9863',
		doctorPhone: '0378128512',
		bio: 'bio description example here'	
	).save()

	def patA = new Patient (
                patientName: 'Daniel Atla',
                patientAddress: '7 Seskergates',
                patientResidence: 'Rivington',
                patientDob: new Date('12/02/1999'),
                patientID: 'E25555',
                dateRegistered: new Date('14/09/2012'),
                patientPhone: '0755553288'

        ).save()
	def patB = new Patient (
		patientName: 'Richard Allen',
		patientAddress: '12 Calimshan Road',
		patientResidence: 'Longacre',
		patientDob: new Date('16/10/1989'),
		patientID: 'E25556',
		dateRegistered: new Date('18/04/2004'),
		patientPhone: '0187494154'
	).save()
	
	def prescripA = new Prescription (
		pharmacyName: 'Holderness Street',
		prescripNumber: '0001',
		medicine: 'Paracetamol A',
		totalCost: '05.00',
		issuedBy: drSarah,
		issuedToPatient: patA, 
		dateIssued: new Date('12/02/2020'),
		patientPaying: true
	).save()

	def prescripB = new Prescription (
		pharmacyName: 'Bloomridge',
		prescripNumber: '0002',
		medicine: 'Oxyconbarbutamol',
		totalCost: '10.00',
		issuedBy: drCope,
		issuedToPatient: patB,
		dateIssued: new Date('14/04/2020'),
		patientPaying: false
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
		patientID: patA,
		appDate: new Date('29/04/2020'),
		appTime: '3:00pm',
		appDuration: '30',
		appointmentLocation: citySurgery,
		roomNumber: 'A-1111',
		doctor: drSarah
	).save()

	def appointB = new Appointment (
                patientID: patB,
                appDate: new Date('20/03/2020'),
                appTime: '4:30pm',
                appDuration: '60',
                appointmentLocation: ruralSurgery,
                roomNumber: 'A-1114',
                doctor: drSarah
	).save()

	def appointC = new Appointment (
                patientID: patA,
                appDate: new Date('02/04/2020'),
                appTime: '11:15pm',
                appDuration: '15',
                appointmentLocation: ruralSurgery,
                roomNumber: 'A-1114',
                doctor: drSarah
        ).save()



	def recepA = new Receptionist (
                recepName:'Rob Kingston',
                recepEmail:'r.kingston@sheffsurgeries.com',
                recepUsername:'rking',
                recepPassword:'passwordA',
                recepPhone: '01142224445',
                location: citySurgery
        ).save()


        def recepB = new Receptionist (
		recepName:'Samantha Cross',
                recepEmail:'s.cross@sheffsurgeries.com',
                recepUsername: 'scross',
                recepPassword:'passwordB',
                recepPhone:'03261958151',
                location: citySurgery
        ).save()

	

    }
    def destroy = {
    }
}
