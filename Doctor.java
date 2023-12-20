import java.util.ArrayList;
import java.util.List;

class Doctor {
    public String name;
    public String specialization;
    public int experience;
    private List<Animal> patients;

    public Doctor(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.patients = new ArrayList<>();
    }

    /**
     * Обследование пациента
     */
    public void diagnosePatient(Animal patient) {
        System.out.println("Doctor " + name + " diagnoses the animal '" + patient.getName() + "' " + patient.illness);
    }

    /**
      Назначаем лечение
     */
    public void prescribeMedication(Animal patient, String medication) {
        System.out.println("Doctor " + name + " prescribes " + medication + " for animals with " + patient.illness);
    }

    /**
     Выписка
     */
    public void admitPatient(Animal patient) {
        System.out.println("Doctor " + name + " cured the animal " + patient.getName());
        patients.add(patient);
    }
}