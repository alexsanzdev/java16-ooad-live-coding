package live_coding.adapter;

import live_coding.adapter.facebook.FacebookFriend;

public class FacebookFriendContactAdapter implements Contact {

    private FacebookFriend fbFriend;

    public FacebookFriendContactAdapter(FacebookFriend fbFriend) {
        this.fbFriend = fbFriend;
    }

    @Override
    public String getFirstName() {
        return fbFriend.getFirstName();
    }

    @Override
    public String getLastName() {
        return fbFriend.getLastName();
    }

    @Override
    public String getEmailAddress() {
        return fbFriend.getEmailAddress();
    }
}
