package Personal.Class_heirs_of_interfaces;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(){
        this("name");
    }
}
