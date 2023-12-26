package veterinaryClinic;

import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccinations;
    protected String illness;
    protected String ownerName;
    protected String type;

    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.ownerName = owner;
        this.type = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return ownerName;
    }

    private void wakeup() {
        System.out.println("Animal is wakeup !! ");
    }

    private void wakeup(int time) {
        System.out.println("Animal is wakeup in " + time);
    }

    private void eat() {
        System.out.println("Animal ate ");
    }

    private void play() {
        System.out.println("Animal played ");
    }

    private void sleep() {
        System.out.println("Animal sleeping ");
    }

    //public abstract void lifeCycle();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + ownerName + '\'' +
                '}';
    }
}