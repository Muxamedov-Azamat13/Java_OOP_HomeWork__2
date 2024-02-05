package Personal.heirs_of_interfaces;

import Personal.GoAble_FlyAble_SwimAble.SwimAble;

public interface FastSwim extends SwimAble {
    default void swimming(){
        System.out.println("Animal is fast swim");
    }
}
