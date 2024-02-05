package Personal.Class_heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.GoAble;
import Personal.heirs_of_interfaces.SlowRun;

public class Tortoise extends Animal implements GoAble, SlowRun {

    Double runner;

    public Tortoise(){
        super();
        this.runner = 4.0;
    }

    @Override
    public String toString() {
        return "Tortoise двигаеться со скоростью " + runner;
    }

    @Override
    public double run() {
        return 0;
    }

    @Override
    public void running() {
        SlowRun.super.running();
    }
}
