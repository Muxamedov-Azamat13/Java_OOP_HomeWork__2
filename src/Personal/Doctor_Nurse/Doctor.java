package Personal.Doctor_Nurse;

public class Doctor extends Personal{

    public Doctor(String surName, String name, String specialization, Double salary) {
        super(surName, name, specialization, salary);
    }



    @Override
    public Personal getData(String patient) {
        System.out.println(name + specialization +  " обслуживает пациента " + patient);
        return null;
    }
}
