import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class VeterinaryClinic {
    /**
     * Методы для пациентов
     */
    public List<Animal> patients = new ArrayList<>();

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
     * Возвращает летающих животных (через stream api)
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

    /**
     * Методы для персонала
     */
    public List<Doctor> doctors;
    public List<Nurse> nurses;

    public VeterinaryClinic() {
        this.doctors = new ArrayList<>();
    }
    public List<Doctor> getAllDoctors() {
        return doctors;
    }
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Доктор " + doctor + " успешно добавлен");
    }

        public void addNurse (Nurse nurse){
            doctors.add(nurse);
            System.out.println("Сестра " + nurse + " успешно добавлен");
        }
}

