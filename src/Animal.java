import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List <String> vaccinations;
    protected String illness;
    protected String owner;

    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return owner;
    }

    private void wakeup (){
        System.out.println("Animal is wakeup !!");
    }

    private void wakeupi (int time){
        System.out.println("Animal is wakeup in " + time);
    }

    private void eat (){

        System.out.println("Animal eat");
    }

    private void play (){
        System.out.println("Animal played");
    }

    private void sleep () {

        System.out.println("Animal sleeping");
    }
    private void toGo () {

        System.out.println("Animal is moving");
    }
    private void fly () {

        System.out.println("Animal flies");
    }
    private void swim () {

        System.out.println("Animal swims");
    }

    public void lifeCycle () {
        wakeup();
        eat();
        play();
        sleep();
    }

    public void lifeCycleEagle () {
        wakeup();
        fly();
        eat();
        sleep();
    }
    public void lifeCycleDuck () {
        wakeup();
        swim();
        eat();
        fly();
        play();
        sleep();
    }
    public void lifeCycleSnake () {
        wakeup();
        swim();
        eat();
        toGo();
        sleep();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}

