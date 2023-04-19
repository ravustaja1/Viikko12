package fi.solehmainen.ostokset;

import java.util.ArrayList;

public class ItemStorage {
    private static ItemStorage itemStorage = null;

    ArrayList<Item> items = new ArrayList<>();

    private ItemStorage() {

    }

    public static ItemStorage getInstance() {
        if (itemStorage == null) {
            itemStorage = new ItemStorage();
        }

        return itemStorage;
    }

    public ArrayList<Item> getItems() {

        return items;
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getPurchase());
        System.out.println(items);
        System.out.println(item.getId());
    }

    public void removeItem(int id) {
        int i2 = 0;
        for (Item i : items) {
            if (i.getId() == id) {
                break;
            }
            i2++;
        }
        items.remove(i2);
    }

    public Item getItemById(int id) {
        return items.get(id);
    }
}
