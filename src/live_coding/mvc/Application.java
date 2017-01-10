package live_coding.mvc;

import live_coding.mvc.model.ContactsModel;
import live_coding.mvc.model.ContactsModelFacade;
import live_coding.mvc.model.Registry;
import live_coding.mvc.presentation.ContactDetailsView;
import live_coding.mvc.presentation.ContactListView;
import live_coding.mvc.presentation.DualColumnScreen;

public class Application {

    public static void main(String[] args) {

        Registry registry = new Registry();

        ContactsModel contactsModel = new ContactsModelFacade(registry);

        DualColumnScreen contactsScreen = new DualColumnScreen();
        ContactListView contactListView = new ContactListView(contactsModel);
        ContactDetailsView contactDetailsView = new ContactDetailsView(contactsModel);

        ContactsController controller = new ContactsController(contactsModel, contactListView, contactDetailsView);

        contactsScreen.setLeftColumn(contactListView);
        contactsScreen.setRightColumn(contactDetailsView);

        contactsScreen.print();

        controller.addContact("Alex", "Sanchez", "alex@email.com");
        controller.addContact("Martina", "Levin", "martina@levin.com");
        controller.addContact("Oswald", "Broström", "oswald@email.com");
        controller.addContact("Markus", "Averheim", "markus@gmail.com");
        contactsScreen.print();

        controller.viewContact(2);
        contactsScreen.print();

        controller.viewContact(3);
        contactsScreen.print();

        controller.deleteContact(3);
        contactsScreen.print();
    }
}
