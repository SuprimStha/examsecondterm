import Order.order;
import Order.tshirt;

public class Main {
    public static void main(String[] args) {
        tshirt tshirt1 = new tshirt("Gorkhali Batman",572, 1235, "Nepal Clothing",
                "You either die a hero or live long enough to see yourself be a villain", new String[]{"S", "M", "L"});

        order order1 = new order("Gopal Sharma", "0486756465",new int[]{572}, new double[]{1235});;
        order1.printBillWithVAT();

    }
}