package Personal;

import Personal.Class_heirs_of_interfaces.Patients.*;
import Personal.Doctor_Nurse.Personal;
import Personal.GoAble_FlyAble_SwimAble.FlyAble;
import Personal.GoAble_FlyAble_SwimAble.GoAble;
import Personal.GoAble_FlyAble_SwimAble.SwimAble;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {

    private List<Personal> personals;
    private List<Animal> patients;

    public VeterinaryClinic(){
        this.personals = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public List<Animal> getPatients(){
        return patients;
    }

    public List<Personal> getPersonals(){
        return personals;
    }

    public void addPersonal(Personal employee){
        personals.add(employee);
    }

    public void addPatients(Animal patient){
        patients.add(patient);
    }


    public List<GoAble> getRunners(List<GoAble> animals) {
        List<GoAble> runners = new ArrayList<>();

        for (GoAble a : animals) {
            if (a instanceof Cheetah || a instanceof Tortoise) {
                runners.add(a);
                double speed = a.run();
                System.out.println("Running animal speed: " + speed);
            }
        }

        return runners;
    }

    public List<FlyAble> getFlyers(List<FlyAble> animals) {
        List<FlyAble> flyers = new ArrayList<>();

        for (FlyAble a : animals) {
            if (a instanceof Falcon || a instanceof Sparrow) {
                flyers.add(a);
                double fly = a.fly();
                System.out.println("Flying animal speed: " + fly);
            }
        }
        return flyers;
    }

    public List<SwimAble> getSwimmers(List<SwimAble> animals) {
        List<SwimAble> swimmers = new ArrayList<>();

        for (SwimAble a : animals) {
            if (a instanceof Falcon || a instanceof Sparrow) {
                swimmers.add(a);
                double swim = a.swim();
                System.out.println("Swimming animal speed: " + swim);
            }
        }
        return swimmers;
    }

}
