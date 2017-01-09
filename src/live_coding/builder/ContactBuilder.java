package live_coding.builder;

public class ContactBuilder {

    private String firstName;
    private String lastName;
    private int age;

    public ContactBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }


    public ContactBuilder age(int age) {
        this.age = age;
        return this;
    }

    public Contact build() {
        return new Contact(firstName, lastName, age);
    }
}
