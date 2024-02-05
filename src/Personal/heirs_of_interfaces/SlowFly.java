package Personal.heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.FlyAble;
import Personal.GoAble_FlyAble_SwimAble.GoAble;

public interface SlowFly extends FlyAble {
    default void slowFly(){
        System.out.println("Animal is slow fly");
    }
}
