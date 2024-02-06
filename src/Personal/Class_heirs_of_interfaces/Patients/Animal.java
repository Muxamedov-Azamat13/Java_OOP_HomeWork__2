package Personal.Class_heirs_of_interfaces.Patients;

import Personal.GoAble_FlyAble_SwimAble.FlyAble;
import Personal.GoAble_FlyAble_SwimAble.GoAble;
import Personal.GoAble_FlyAble_SwimAble.SwimAble;
import java.util.List;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(){
        this("name");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
