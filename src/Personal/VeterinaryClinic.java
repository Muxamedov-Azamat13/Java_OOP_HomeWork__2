package Personal;

import Personal.Class_heirs_of_interfaces.*;
import Personal.Doctor_Nurse.Doctor;
import Personal.Doctor_Nurse.Nurse;
import Personal.Doctor_Nurse.Personal;

public class VeterinaryClinic {
    public static void main(String[] args) {

        Personal doctor = new Doctor("Dr.Smith ","Cardiologist ");
        Personal nurse = new Nurse("Diana ","Assistant Dr.Smith ");
        System.out.println(doctor);
        System.out.println(nurse);
        doctor.getData("Cheetah");
        nurse.getData("Cheetah");
        

        Cheetah cheetah = new Cheetah();
        Tortoise tortoise = new Tortoise();
        Falcon falcon = new Falcon();
        Sparrow sparrow = new Sparrow();
        Dolphin dolphin = new Dolphin();
        Duck duck = new Duck();

        cheetah.run();
        tortoise.run();
        falcon.fly();
        sparrow.fly();
        dolphin.swim();
        duck.swim();


        System.out.println(cheetah);
        System.out.println(tortoise);
        System.out.println(falcon);
        System.out.println(sparrow);
        System.out.println(dolphin);
        System.out.println(duck);

    }
}
