package Personal.Class_heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.SwimAble;

public class Duck implements SwimAble {
    Double swimmer;

    public Duck(){
        super();
        this.swimmer = 10.0;
    }

    @Override
    public String toString() {
        return "Duck плавает со скоростью " + swimmer;
    }


    @Override
    public double swim() {
        return 0;
    }
}
