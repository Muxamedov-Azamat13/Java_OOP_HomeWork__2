package Personal.heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.GoAble;

public interface SlowRun extends GoAble {
    default void running(){
        System.out.println("Animal is slow run");
    }
}
