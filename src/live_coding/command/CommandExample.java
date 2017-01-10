package live_coding.command;

public class CommandExample {

    public static void main(String[] args) {
        Button button = new Button("Buy");

        //button.setAction(new BuyAction());

        //button.push();

        Button closeButton = new Button("Quit");

        closeButton.setAction(() -> {
            System.out.println("Quitting application...");
            System.exit(0);
        });

        closeButton.push();

    }
}
