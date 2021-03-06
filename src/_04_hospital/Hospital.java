package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	ArrayList<Patient> patientList = new ArrayList<Patient>();

	public void addDoctor(GeneralPractitioner generalPractitioner) {
		// TODO Auto-generated method stub

		doctorList.add(generalPractitioner);
	}

	public void addDoctor(Surgeon surgeon) {
		// TODO Auto-generated method stub
		doctorList.add(surgeon);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctorList;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patientList.add(patient);

	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientList;
	}

	public void assignPatientsToDoctors() {

		System.out.println(patientList.size());
		System.out.println(doctorList.size());
		
		int count = 0;
		for (int j = 0; j < patientList.size(); j++) {

			if(doctorList.get(count).patientListD.size() == 3) {
				count++;
			}
				
					
					try {
						doctorList.get(count).assignPatient(patientList.get(j));
					} catch (DoctorFullException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						//count++;
					}

			
				
			}
			//count = count + 3;

		
		

		System.out.println(doctorList.get(0).getPatients().size());
		System.out.println(doctorList.get(1).getPatients().size());
		System.out.println(doctorList.get(2).getPatients().size());

	}

	public static void main(String[] args) {

		Hospital testHospital = new Hospital();
		testHospital.addDoctor(new GeneralPractitioner());
		testHospital.addDoctor(new GeneralPractitioner());
		testHospital.addDoctor(new Surgeon());
		// TODO: add 8 patients to hospital
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());

		testHospital.assignPatientsToDoctors();
	}

}
