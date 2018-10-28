package _04_hospital;

import java.util.ArrayList;

public class Doctor extends DoctorFullException {

	ArrayList<Patient> patientListD = new ArrayList<Patient>();

	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (patientListD.size() >= 3) {
			throw new DoctorFullException();
		} else {
			patientListD.add(patient);
		}
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientListD;
	}

	public void doMedicine() {
		for (int i = 0; i < patientListD.size(); i++) {
			patientListD.get(i).checkPulse();
		}

	}

}
