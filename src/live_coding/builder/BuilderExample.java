package live_coding.builder;

import live_coding.adapter.*;

import java.io.File;

public class BuilderExample {

    public static void main(String[] args) {

        Contact c = new Contact("Mikael", "Rolf", "Hallberg", "Micke", 38, "MALE", new File("/tmp/micke.jpg"), "90829082908290", "micke@mh.se", "Gamla Filmstaden", "UNKNOWN");

        Contact c2 = Contact.builder()
            .firstName("Mikael")
            .lastName("Hallberg")
            .age(38)
            .build();


    }
}
