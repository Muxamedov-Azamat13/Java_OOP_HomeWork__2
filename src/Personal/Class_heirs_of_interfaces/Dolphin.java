package Personal.Class_heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.SwimAble;
import Personal.heirs_of_interfaces.FastSwim;

public class Dolphin extends Animal implements SwimAble, FastSwim {

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

    @Override
    public void swimming() {
        FastSwim.super.swimming();
    }
}
