package live_coding.builder;

import java.io.File;

public class Contact {

    public String firstName;
    public String middleName;
    public String lastName;
    public String nickname;
    public int age;
    public String gender;
    public File picture;
    public String phoneNumber;
    public String emailAddress;
    public String postAddress;
    public String relationshipStatus;

    public Contact(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public Contact(String firstName, String middleName, String lastName, String nickname, int age, String gender, File picture, String phoneNumber, String emailAddress, String postAddress, String relationshipStatus) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.picture = picture;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.postAddress = postAddress;
        this.relationshipStatus = relationshipStatus;
    }

    public Contact(String firstName, String lastName, int age) {

    }

    public static ContactBuilder builder() {
        return new ContactBuilder();
    }
}
