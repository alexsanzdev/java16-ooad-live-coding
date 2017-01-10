package live_coding.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class Registry {

    private List<Contact> contacts = new ArrayList<>();

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return new ArrayList<>(contacts);
    }

    public void delete(int index) {
        contacts.remove(index);
    }
}
