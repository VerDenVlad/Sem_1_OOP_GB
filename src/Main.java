import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(
                1993,6,6),
                new ArrayList<>(), "Chumka", "Boss", 4);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());

        Animal eagle = new Eagle("Kesha", LocalDate.of(
                1996,6,6),
                new ArrayList<>(), "Chumka", "Boss");
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        System.out.println("________________________________________");

        barsik.lifeCycle();


    }

}

//    String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner