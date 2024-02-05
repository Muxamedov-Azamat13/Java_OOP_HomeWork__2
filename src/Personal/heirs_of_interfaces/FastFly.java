package Personal.heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.FlyAble;

public interface FastFly extends FlyAble {
    default void flying(){
        System.out.println("Animal is fast fly");
    }
}
