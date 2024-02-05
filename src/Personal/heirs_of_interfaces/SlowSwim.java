package Personal.heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.SwimAble;

public interface SlowSwim extends SwimAble {
    default void slowSwim(){
        System.out.println("Animal is slow swim");
    }
}
