package doctors;

import patient.Patient;

public class Therapist extends Doctor {

    @Override
    public void heal() {
        System.out.println("You have a therapist.");
    }

    public void selectHealing(Patient patient) {
        if (patient.getHealingPlan() == 1) {
            patient.setDoctor(new Surgeon());
            Surgeon surgeon = new Surgeon();
            surgeon.heal();
        } else if (patient.getHealingPlan() == 2) {
            patient.setDoctor(new Dentist());
            Dentist dentist = new Dentist();
            dentist.heal();
        } else {
            patient.setDoctor(new Therapist());
            heal();
        }
    }


}
