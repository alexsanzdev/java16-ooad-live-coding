package live_coding.delegation;

import java.util.ArrayList;

public class LocalRegistry {

    private ArrayList list = new ArrayList();


    public void add(Contact contact) {
        list.add(contact);
    }

    public void remove(Contact contact) {
        list.remove(contact);
    }

    public int size() {
        return list.size();
    }
}
