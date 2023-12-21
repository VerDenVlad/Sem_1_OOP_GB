import java.time.LocalDate;

public class Nurse extends Personal {
    public Nurse(String name, LocalDate dateOfBirth, String post, String city) {

        super(name, dateOfBirth, post, city);
    }
    @Override
    protected void toAction() {

        System.out.println("Медсестра " + getName() + " ассистент");
    }
}