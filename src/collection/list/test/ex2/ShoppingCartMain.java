package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item);
        cart.addItem(item2);
        cart.displayItem();
    }
}
