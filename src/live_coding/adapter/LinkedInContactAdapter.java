package live_coding.adapter;

import live_coding.adapter.linkedin.LinkedInContact;

public class LinkedInContactAdapter implements Contact {

    private LinkedInContact lnContact;

    public LinkedInContactAdapter(LinkedInContact lnContact) {
        this.lnContact = lnContact;
    }

    @Override
    public String getFirstName() {
        return lnContact.getName().getFirst();
    }

    @Override
    public String getLastName() {
        return lnContact.getName().getLast();
    }

    @Override
    public String getEmailAddress() {
        return lnContact.getEmailAddress();
    }
}
