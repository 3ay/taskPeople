public class PersonBuilder {
    private Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public Person build() {
        if (person.getAge() != null && person.getAge() <= 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше или равняться нулю");
        } else if (person.getName() == null || person.getName().equals("")
                || person.getSurname() == null || person.getSurname().equals("")) {
            throw new IllegalStateException("Должны быть обязательно указаны имя и фамилия");
        }

        return person;
    }

    public PersonBuilder setName(String name) {
        person.setName(name);
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        person.setSurname(surname);
        return this;
    }

    public PersonBuilder setAge(int age) {
        person.setAge(age);
        return this;
    }

    public PersonBuilder setAddress(String address) {
        person.setAddress(address);
        return this;
    }

}
