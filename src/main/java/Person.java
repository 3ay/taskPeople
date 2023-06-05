import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private Integer age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(address);
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public boolean hasAge() {
        if (age == null)
            return false;
        return age > 0;
    }

    public boolean hasAddress() {
        return address != null && !"".equals(address);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if (!this.hasAge()) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Человек с именем:"
                + this.getName() +
                "\n" + "фамилией: " + this.getSurname()
                + "\n" + "возрастом: " + this.getAge()
                + "\n" + "городом проживания: " + this.getAddress();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
