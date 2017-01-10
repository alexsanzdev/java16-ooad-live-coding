package live_coding.mvc.model;

import java.util.List;

public class ContactsModelFacade implements ContactsModel {

    private Registry registry;

    public ContactsModelFacade(Registry registry) {
        this.registry = registry;
    }

    @Override
    public List<Contact> getContacts() {
        return registry.getContacts();
    }

    @Override
    public void addContact(String firstName, String lastName, String emailAddress) {
        Contact contact = new Contact(firstName, lastName, emailAddress);
        registry.add(contact);
    }

    @Override
    public Contact getContact(int index) {
        return registry.getContacts().get(index);
    }

    @Override
    public void deleteContact(int index) {
        registry.delete(index);
    }
}
