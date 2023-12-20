import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();

    /**
     * Добавляет по одному пациенту
     */
    public void addPatient(Animal animal) {
        patients.add(animal);
    }

    /**
     * Добавляет пациентов списком
     */
    public void addPatients(Animal... animals) {
        Collections.addAll(patients, animals);
    }

    /**
     * Возвращает список пациентов
     */
    public List<Animal> getPatients() {
        return patients;
    }

    /**
     * Возвращает бегающих животных
     */
    public List<Goable> getGoables() {
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Goable)
                result.add((Goable) animal);
        }
        return result;
    }

    /**
     * Возвращает летающих животных
     */
    public List<Flyable> getFlyable() {
        return patients.stream()
                .filter(Flyable.class::isInstance)
                .map(Flyable.class::cast)
                .collect(Collectors.toList());
    }

    /**
     * Возвращает плавающих животных
     */
    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Swimable)
                result.add((Swimable) animal);
        }
        return result;
    }
}
