package live_coding.mvc;

import live_coding.mvc.model.Contact;
import live_coding.mvc.model.ContactsModel;
import live_coding.mvc.presentation.ContactDetailsView;
import live_coding.mvc.presentation.ContactListView;

public class ContactsController {

    private ContactsModel model;
    private ContactListView contactListView;
    private ContactDetailsView contactDetailsView;

    public ContactsController(ContactsModel model, ContactListView contactListView, ContactDetailsView contactDetailsView) {
        this.model = model;
        this.contactListView = contactListView;
        this.contactDetailsView = contactDetailsView;
    }

    public void addContact(String firstName, String lastName, String emailAddress) {
        model.addContact(firstName, lastName, emailAddress);
    }

    public void viewContact(int position) {
        Contact contact = model.getContact(position - 1);
        contactDetailsView.setContact(contact, position);
    }

    public void deleteContact(int position) {
        model.deleteContact(position-1);
        contactDetailsView.handleContactDeletedEvent(position);
    }
}
