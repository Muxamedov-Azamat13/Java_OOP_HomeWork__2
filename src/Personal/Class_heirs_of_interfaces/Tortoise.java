package Personal.Class_heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.GoAble;

public class Tortoise implements GoAble {

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
}
