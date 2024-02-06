package Personal.Class_heirs_of_interfaces.Patients;

import Personal.GoAble_FlyAble_SwimAble.FlyAble;
import Personal.heirs_of_interfaces.FastFly;

public  class Falcon extends Animal implements FlyAble, FastFly {
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

    @Override
    public void flying() {
        FastFly.super.flying();
    }
}
