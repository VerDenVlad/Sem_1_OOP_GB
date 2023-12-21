import java.time.LocalDate;

public abstract class Personal {

    protected String name;
    protected LocalDate dateOfBirth;
    protected String post;
    protected String city = null;

    public Personal(String name, LocalDate dateOfBirth, String post, String city) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.post = post;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPost() {
        return post;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", specialization='" + post + '\'' +
                ", address='" + city + '\'' +
                '}';
    }

    protected abstract void toAction();
}