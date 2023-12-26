import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double run() {
        System.out.printf("%s Running", type);
        return 15.0;
    }


    @Override
    public double swim() {
        System.out.printf("%s Floating", type);
        return 10.0;
    }
}
