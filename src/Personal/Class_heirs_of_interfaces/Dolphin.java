package Personal.Class_heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.SwimAble;

public class Dolphin implements SwimAble {

    Double swimmer;

    public Dolphin(){
        super();
        this.swimmer = 40.0;
    }

    @Override
    public String toString() {
        return "Dolphin плавает со скоростью " + swimmer;
    }


    @Override
    public double swim() {
        return 0;
    }
}
