package live_coding.command;

public class BuyAction implements Action {

    @Override
    public void run() {
        System.out.println("Add product to shopping cart");
        System.out.println("Product added to cart");
    }
}
