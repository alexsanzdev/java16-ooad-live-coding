package live_coding.mvc.presentation;

import live_coding.mvc.model.Contact;
import live_coding.mvc.model.ContactsModel;

public class ContactDetailsView implements View {

    private ContactsModel contactsModel;
    private Contact contact;
    private int contactPosition = -1;

    public ContactDetailsView(ContactsModel contactsModel) {

        this.contactsModel = contactsModel;
    }

    @Override
    public String render() {
        if (contact != null) {
            StringBuilder builder = new StringBuilder();

            builder.append("First name: ").append(contact.getFirstName()).append('\n');
            builder.append("Last name: ").append(contact.getLastName()).append('\n');
            builder.append("Email: ").append(contact.getEmailAddress()).append('\n');

            return builder.toString();
        } else {
            return "No contact selected";
        }
    }

    public void setContact(Contact contact, int position) {
        this.contact = contact;
        this.contactPosition = position;
    }

    public void handleContactDeletedEvent(int position) {
        if (position == contactPosition) {
            contact = null;
            contactPosition = -1;
        }
    }
}
