package live_coding.delegation;

public class RegistryExample {

    public static void main(String[] args) {
        LocalRegistry localRegistry = new LocalRegistry();
        Contact c1 = new Contact();
        Contact c2 = new Contact();
        Contact c3 = new Contact();
        localRegistry.add(c1);
        localRegistry.add(c2);
        localRegistry.add(c3);

        System.out.println(localRegistry.size());

        localRegistry.remove(c2);

        System.out.println(localRegistry.size());

    }
}
