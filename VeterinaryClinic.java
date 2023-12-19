import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
     * Возвращает список пациентов
     */
    public List<Animal> getPatients() {
        return patients;
    }
}
