package Personal.Doctor_Nurse;

public class Nurse extends Personal{

    public Nurse(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public void getData(String patient) {
        System.out.println(name + specialization + " помогаеть доктору Smith с обслуживанием " + patient);
    }
}
