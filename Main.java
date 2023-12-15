import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(
                1996,7,8),
                new ArrayList<>(), "Chumka", "Owner Alexei", 4);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());

        Animal eagle = new Eagle("Kesha", LocalDate.of(
                2000,8,9),
                new ArrayList<>(), "Chumka", "Owner Alexei");
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        System.out.println("________________________________________");

        barsik.lifeCycle();


    }

}