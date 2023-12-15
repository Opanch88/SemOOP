import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {

    private int legsCount;

    public Cat(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthDate, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }
}