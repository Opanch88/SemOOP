import veterinaryClinic.Animal;
import veterinaryClinic.Flyable;
import veterinaryClinic.Goable;
import veterinaryClinic.Swimable;

import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Goable, Swimable, Flyable {
    public Duck(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
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
        return 3.0;
    }

    @Override
    public double swim() {
        System.out.printf("%s Floating", type);
        return 8.0;
    }
}
