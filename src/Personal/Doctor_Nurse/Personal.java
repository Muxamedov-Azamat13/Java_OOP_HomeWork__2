package Personal.Doctor_Nurse;

public abstract class Personal {
    protected String surName;
    protected String name;
    protected String specialization;
    protected Double salary;


    public Personal(String surName, String name, String specialization, Double salary) {
        this.surName = surName;
        this.name = name;
        this.specialization = specialization;
        this.salary = salary;
    }

   public Personal(){
        this("Фамилия","Имя","Специализация",5.000D);
   }
    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return String.format("surName = %s, name = %s, specialization = %s, salary = %s", surName, name, specialization, salary);
    }

    public Personal getData(String patient){
        System.out.println(name + specialization + patient);
        return null;
    }


}