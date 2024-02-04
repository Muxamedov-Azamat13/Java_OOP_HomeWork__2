package Personal.Class_heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.FlyAble;

public class Falcon implements FlyAble {
    Double flies;

    public Falcon(){
        super();
        this.flies = 250.0;
    }

    @Override
    public String toString() {
        return "Falcon летает со скоростью " + flies;
    }

    @Override
    public double fly() {
        return 0;
    }
}
