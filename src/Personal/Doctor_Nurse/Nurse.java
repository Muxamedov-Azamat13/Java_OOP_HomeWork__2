package Personal.Doctor_Nurse;

public class Nurse extends Personal{

    public Nurse(String surName, String name, String specialization, Double salary) {
        super(surName, name, specialization, salary);
    }


    @Override
    public Personal getData(String patient) {
        System.out.println(name + specialization + " помогаеть доктору Smith с обслуживанием " + patient);
        return null;
    }

}
