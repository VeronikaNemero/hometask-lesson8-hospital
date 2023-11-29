import doctors.Therapist;
import patient.Patient;

public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient(1);
        Therapist therapist = new Therapist();
        therapist.selectHealing(patient1);

        Patient patient2 = new Patient(2);
        therapist.selectHealing(patient2);

        Patient patient3 = new Patient(3);
        therapist.selectHealing(patient3);
    }
}