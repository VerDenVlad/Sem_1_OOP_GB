import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", LocalDate.of(
                1993,6,6),
                new ArrayList<>(), "Chumka", "Boss", 4);
        System.out.println(cat);
        System.out.println(cat.getLegsCount());

        Animal eagle = new Eagle("Kesha", LocalDate.of(
                1996,6,6),
                new ArrayList<>(), "Chumka", "Boss");
        System.out.println(eagle);

        Animal duck = new Duck("Gosha", LocalDate.of(
                2022,4,16),
                new ArrayList<>(), "Chumka", "Boss");
        System.out.println(duck);

        Snake snake = new Snake("Julia", LocalDate.of(
                1987,7,8),
                new ArrayList<>(), "Chumka", "Boss");
        System.out.println(snake);

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(eagle);
        animals.add(duck);
        animals.add(snake);

        System.out.println("________________________________________");
        System.out.println("Cat Barsik");

        cat.lifeCycle();

        System.out.println("________________________________________");
        System.out.println("Eagle Kesha");

        eagle.lifeCycleEagle();

        System.out.println("________________________________________");
        System.out.println("Duck Gosha");

        duck.lifeCycleDuck();

        System.out.println("________________________________________");
        System.out.println("Snake Julia");

        snake.lifeCycleSnake();



    }

}

//    String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner