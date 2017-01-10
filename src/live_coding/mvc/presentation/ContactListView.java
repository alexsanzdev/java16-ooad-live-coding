package live_coding.mvc.presentation;

import live_coding.mvc.model.Contact;
import live_coding.mvc.model.ContactsModel;

import java.util.List;

public class ContactListView implements View {

    private ContactsModel contactsModel;

    public ContactListView(ContactsModel contactsModel) {
        this.contactsModel = contactsModel;
    }

    @Override
    public String render() {
        if (!contactsModel.getContacts().isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();

            List<Contact> contacts = contactsModel.getContacts();
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                stringBuilder.append(i+1);
                stringBuilder.append(". ");
                stringBuilder.append(contact.getFirstName());
                stringBuilder.append(" ");
                stringBuilder.append(contact.getLastName());
                stringBuilder.append("\n");
            }

            return stringBuilder.toString();
        } else {
            return "No contacts";
        }
    }
}
