package contoh;

import java.util.ArrayList;
import java.util.List;

public class Kasir {
    private List<Item> items;

    public Kasir() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the cart.");
        } else {
            System.out.println("Items in the cart:");
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    public void displayItemsDuplicate() {
        if (items.isEmpty()) {
            System.out.println("No items in the cart.");  // Duplicate block
        } else {
            System.out.println("Items in the cart:");    // Duplicate block
            for (Item item : items) {
                System.out.println(item);                // Duplicate block
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public double calculateTotalDuplicate() {
        double total = 0;                                  // Duplicate block
        for (Item item : items) {                           // Duplicate block
            total += item.getTotalPrice();                  // Duplicate block
        }
        return total;                                       // Duplicate block
    }

    public void checkout() {
        displayItems();
        double total = calculateTotal();
        System.out.println("Total amount: " + total);
        items.clear();
        System.out.println("Thank you for your purchase!");
    }

    public void checkoutDuplicate() {
        displayItemsDuplicate();                             // Duplicate block
        double total = calculateTotalDuplicate();            // Duplicate block
        System.out.println("Total amount: " + total);        // Duplicate block
        items.clear();                                       // Duplicate block
        System.out.println("Thank you for your purchase!");  // Duplicate block
    }
}
