package Personal.Class_heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.GoAble;

public class Cheetah implements GoAble {

    Double runner;

    public Cheetah(){
        super();
        this.runner = 120.0;
    }

    @Override
    public String toString() {
        return "Cheetah бежить со скоростью120 = " + runner;
    }

    @Override
    public double run() {
        return 0;
    }
}
