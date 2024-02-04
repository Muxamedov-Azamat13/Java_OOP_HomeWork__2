package Personal.Class_heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.FlyAble;

public class Sparrow implements FlyAble {
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
}
