package Personal.Class_heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.GoAble;
import Personal.heirs_of_interfaces.FastRun;

public class Cheetah extends Animal implements GoAble, FastRun {
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


    @Override
    public void fastRun() {
        FastRun.super.fastRun();
    }
}
