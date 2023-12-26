import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Flyable, Goable {
    public Eagle(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }


    @Override
    public double fly() {
        System.out.printf("%s Flying", type);
        return 200.0;
    }


    @Override
    public double run() {
        System.out.printf("%s Running", type);
        return 8.0;
    }
}