import java.time.LocalDate;
import java.util.List;

public class Snake extends Animal implements Swimable {
    public Snake(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }

    @Override
    public double swim() {
        System.out.printf("%s Floating", type);
        return 10.0;
    }
}
