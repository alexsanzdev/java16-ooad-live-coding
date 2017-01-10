package live_coding.command;

public class Button {

    private String label;
    private Action action;

    public Button(String label) {
        this.label = label;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void push() {
        System.out.println("Button \""+label+"\" pushed...");
        if (action != null) {
            action.run();
        }
    }
}
