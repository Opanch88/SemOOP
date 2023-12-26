package veterinaryClinic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(1996, 7, 8), new ArrayList<>(), "Chumka", "Owner Alexei", 4);
//        Animal eagle = new Eagle("Kesha", LocalDate.of(2000, 8, 9), new ArrayList<>(), "Chumka", "Owner Alexei");
//        Animal dog = new Dog("Bul", LocalDate.of(1988, 7, 2), new ArrayList<>(), "Stomach upset ", "Owner Oleg");
//        Animal duck = new Duck("Donald", LocalDate.of(2001, 5, 8), new ArrayList<>(), "Avian flu", "Owner Petr");
        Animal snake = new Snake("Kaa", LocalDate.of(1998, 5, 8), new ArrayList<>(), "Царапина", "Owner Petr");
        Animal raven = new Raven("Kar-Karych", LocalDate.of(1997, 5, 8), new ArrayList<>(), "Is flying too high ", "Owner Sema");

        Doctor doctor = new Doctor("Petr", "Хирург", 5);
        Nurse nurse = new Nurse("Mila", "Интерн", 5);
        Doctor stat = new Doctor("Petr", "Хирург", 5);
        Nurse nurse2 = new Nurse("Mila", "Интерн", 5);


        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(barsik, snake, raven);

//        System.out.println(clinic.getPatients());
//        System.out.println(clinic.getGoables());
//        System.out.println(clinic.getFlyable());
//        System.out.println(clinic.getSwimable());

        doctor.diagnosePatient(snake);
        nurse.assistDoctor(doctor, snake);
        doctor.prescribeMedication(snake, "Зеленка");
        nurse.administerMedication(snake, "Зеленка");
        nurse.monitorPatient(snake);
        doctor.admitPatient(snake);
        System.out.println(" ");
        clinic.addDoctor(doctor);
        clinic.addDoctor(stat);
        System.out.println(clinic.getAllDoctors());
        clinic.addNurse(nurse);
        clinic.addNurse(nurse2);
    }
}