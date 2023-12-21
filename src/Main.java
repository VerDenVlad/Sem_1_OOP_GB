import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", LocalDate.of(1998, 9, 9), new ArrayList<>(), "Chumka", "Boss", 4);
        Eagle eagle = new Eagle("Kesha", LocalDate.of(1999, 2, 28), new ArrayList<>(), "Chumka", "Boss");
        Duck duck = new Duck("Ponka", LocalDate.of(2019, 9, 24), new ArrayList<>(), "Chumka", "Boss");
        Penguin penguin = new Penguin("Julia", LocalDate.of(1987, 7, 8), new ArrayList<>(), "Chumka", "Boss");
        Fish fish = new Fish("Nemo", LocalDate.of(2021, 1, 12), new ArrayList<>(), "Chumka", "Boss");
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(eagle);
        animals.add(duck);
        animals.add(penguin);
        animals.add(fish);

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(cat, eagle, penguin, duck, fish);
        System.out.println("---------------------------------");

        System.out.println("Список пациентов: "+clinic.getPatients());

        System.out.println("---------------------------------");

        Nurse nurse1 = new Nurse("Мадина", LocalDate.of(1985, 9, 25),
                "Медсестра", "Москва");

        Nurse nurse2 = new Nurse("Рузана", LocalDate.of(1978, 2, 11),
                "Медсестра", "Москва");

        Nurse nurse3 = new Nurse("Екатерина", LocalDate.of(1967, 12, 31),
                "Медсестра", "Москва");

        Doctor doctor1 = new Doctor("Андрей", LocalDate.of(1993, 5, 30),
                "Терапевт", "Москва", nurse3 );

        Doctor doctor2 = new Doctor("Заур", LocalDate.of(1989, 7, 22),
                "Терапевт", "Москва", nurse2);

        Doctor doctor3 = new Doctor("Дмитрий", LocalDate.of(1990, 1, 1),
                "Хирург", "Москва", nurse1);

        clinic.addPersonal(doctor1, doctor2, doctor3, nurse1, nurse2, nurse3);


        System.out.println("Список докторов: " +clinic.getAllDoctors());

        System.out.println("---------------------------------");

        System.out.println("Список медсестёр: " +clinic.getAllNurses());

        System.out.println("---------------------------------");

        System.out.println();
        System.out.println("Кабинет №1");
        doctor1.toAction();
        nurse3.toAction();

        System.out.println();
        System.out.println("Кабинет №2");
        doctor2.toAction();
        nurse2.toAction();

        System.out.println();
        System.out.println("Кабинет №3");
        doctor3.toAction();
        nurse1.toAction();


    }
}