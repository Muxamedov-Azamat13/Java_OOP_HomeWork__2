package Personal;

import Personal.Class_heirs_of_interfaces.*;
import Personal.Doctor_Nurse.Doctor;
import Personal.Doctor_Nurse.Nurse;
import Personal.Doctor_Nurse.Personal;
import Personal.GoAble_FlyAble_SwimAble.FlyAble;
import Personal.heirs_of_interfaces.*;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class VeterinaryClinic {

    public void addAnimals(){
        List<Animal> animal = new ArrayList<Animal>();

        Cheetah cheetah = new Cheetah();
        Dolphin dolphin = new Dolphin();
        Duck duck = new Duck();
        Falcon falcon = new Falcon();
        Sparrow sparrow = new Sparrow();
        Tortoise tortoise = new Tortoise();

        animal.add(cheetah);
        animal.add(dolphin);
        animal.add(duck);
        animal.add(falcon);
        animal.add(sparrow);
        animal.add(tortoise);
        System.out.println(animal);
    }

    public void getRunAnimal(){
        List<FastRun> fastRuns = new ArrayList<>();
        List<SlowRun> slowRuns = new ArrayList<>();

        Cheetah cheetah = new Cheetah();
        fastRuns.add(cheetah);

        Tortoise tortoise = new Tortoise();
        slowRuns.add(tortoise);

        System.out.println(fastRuns);
        System.out.println(slowRuns);
    }

    public void getSwimAnimal(){
        List<FastSwim> fastSwims = new ArrayList<>();
        List<SlowSwim> slowSwims = new ArrayList<>();

        Dolphin dolphin = new Dolphin();
        fastSwims.add(dolphin);

        Duck duck = new Duck();
        slowSwims.add(duck);

        System.out.println(fastSwims);
        System.out.println(slowSwims);
    }

    public void getFlyAnimal(){
        List<FastFly> fastFly = new ArrayList<>();
        List<SlowFly> slowFly = new ArrayList<>();

        Falcon falcon = new Falcon();
        fastFly.add(falcon);

        Sparrow sparrow = new Sparrow();
        slowFly.add(sparrow);

        System.out.println(fastFly);
        System.out.println(slowFly);
    }

    public void addPersonal(){
        List<Personal> personal = new ArrayList<>();

        Doctor doctor = new Doctor("Jonathan ","Smith ","Cardiologist",5000D);
        Nurse nurse = new Nurse("Emma ","Tomphson ","Nurse",1500D);

        personal.add(doctor);
        personal.add(nurse);
        System.out.println(personal);

        personal.add(doctor.getData("Cheetah"));
        personal.add(nurse.getData("Cheetah"));
    }
}
