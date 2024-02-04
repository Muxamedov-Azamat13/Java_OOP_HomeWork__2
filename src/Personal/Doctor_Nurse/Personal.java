package Personal.Doctor_Nurse;

public class Personal {
    protected String name;
    protected String specialization;

    public Personal(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Personal " +
                "name = " + name +
                ", specialization = " + specialization;
    }

    public void getData(String patient){
        System.out.println(name + specialization + patient);
    }

}
