import java.time.LocalDate;
import java.util.Date;

public class Doctor extends Personal {
    private Nurse nurse = null;
    public Doctor(String name, LocalDate dateOfBirth, String post, String city, Nurse nurse) {
        super(name, dateOfBirth, post, city);
        this.nurse = nurse;
    }
    @Override
    protected void toAction() {

        System.out.println("Доктор " + getName() + " ведет приём");
    }
    public Nurse getNurse() {

        return nurse;
    }
    public void setNurse(Nurse nurse) {

        this.nurse = nurse;
    }
}