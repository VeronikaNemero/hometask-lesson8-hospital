package patient;

import doctors.Doctor;

public class Patient {
    public int healingPlan;

    public Doctor doctor;

    public Patient(int healingPlan) {
        this.healingPlan = healingPlan;
    }

    public int getHealingPlan() {
        return healingPlan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
