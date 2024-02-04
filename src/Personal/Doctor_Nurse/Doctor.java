package Personal.Doctor_Nurse;

public class Doctor extends Personal{

    public Doctor(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public void getData(String patient) {
        System.out.println(name + specialization +  " обслуживает пациента " + patient);
    }
}
