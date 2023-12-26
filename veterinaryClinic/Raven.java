import java.time.LocalDate;
import java.util.List;

public class Raven extends Animal implements Flyable, Goable {


    public Raven(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double fly() {
        System.out.printf("%s Flying", type);
        return 100.0;
    }

    @Override
    public double run() {
        System.out.printf("%s Running", type);
        return 5.0;
    }
}
