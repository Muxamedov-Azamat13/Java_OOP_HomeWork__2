package Personal.heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.GoAble;

public interface FastRun extends GoAble {
    default void fastRun(){
        System.out.println("Animal fast run");
    }
}
