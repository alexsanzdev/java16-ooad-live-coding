package live_coding.adapter;

import java.util.ArrayList;

public class ContactRegistry {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void add(Contact c) {
        contacts.add(c);
    }
}
