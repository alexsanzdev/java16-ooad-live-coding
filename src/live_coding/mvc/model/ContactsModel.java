package live_coding.mvc.model;

import java.util.List;

public interface ContactsModel {

    List<Contact> getContacts();

    void addContact(String firstName, String lastName, String emailAddress);

    Contact getContact(int index);

    void deleteContact(int index);
}
