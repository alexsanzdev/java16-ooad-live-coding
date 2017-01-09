package live_coding.adapter;

import live_coding.adapter.facebook.FacebookFriend;
import live_coding.adapter.linkedin.LinkedInContact;

public class AdapterExample {

    public static void main(String[] args) {
        ContactRegistry registry = new ContactRegistry();

        registry.add(new AddressBookContact());
        registry.add(new FacebookFriendContactAdapter(new FacebookFriend()));
        registry.add(new LinkedInContactAdapter(new LinkedInContact()));

    }
}
