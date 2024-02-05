package Personal.Class_heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.FlyAble;
import Personal.heirs_of_interfaces.SlowFly;

public class Sparrow extends Animal implements FlyAble, SlowFly {
    Double flies;

    public Sparrow(){
        super();
        this.flies = 25.0;
    }

    @Override
    public String toString() {
        return "Sparrow летает со скоростью " + flies;
    }

    @Override
    public double fly() {
        return 0;
    }

    @Override
    public void slowFly() {
        SlowFly.super.slowFly();
    }
}
