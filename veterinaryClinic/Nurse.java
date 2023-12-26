package veterinaryClinic;

import java.util.ArrayList;
import java.util.List;

public class Nurse extends Doctor {
    public Nurse(String name, String specialization, int experience) {
        super(name, specialization, experience);
    }
    /**
     Помогаем врачу с пациентом
     */
    public void assistDoctor(Doctor doctor, Animal patient) {
        System.out.println("Nurse " + name + " is assisting Doctor " + doctor.name + " with patient " + patient.getName());
    }

    /**
     Лечение пациента
     */
    public void administerMedication(Animal patient, String medication) {
        System.out.println("Nurse " + name + " is administering " + medication + " to patient " + patient.getName());
    }

    /**
     Наблюдение за состоянием пациента
     */
    public void monitorPatient(Animal patient) {
        System.out.println("Nurse " + name + " is monitoring the condition of patient " + patient.getName());
    }
}

