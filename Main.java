import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(1996, 7, 8), new ArrayList<>(), "Chumka", "Owner Alexei", 4);
        Animal eagle = new Eagle("Kesha", LocalDate.of(2000, 8, 9), new ArrayList<>(), "Chumka", "Owner Alexei");
        Animal dog = new Dog("Bul", LocalDate.of(1988, 7, 2), new ArrayList<>(), "Stomach upset ", "Owner Oleg");
        Animal duck = new Duck("Donald", LocalDate.of(2001, 5, 8), new ArrayList<>(), "avian flu", "Owner Petr");

        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        animals.add(dog);
        animals.add(duck);
        //System.out.println(animals);
        System.out.println(eagle);
    }
}