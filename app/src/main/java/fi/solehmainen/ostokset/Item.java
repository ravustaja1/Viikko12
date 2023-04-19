package fi.solehmainen.ostokset;

import java.io.Serializable;

public class Item implements Serializable {
    private String purchase;
    private static int counter = 0;
    private int id;

    private int image, image2;
    public Item(String purchase) {
        this.purchase = purchase;
        this.image = R.drawable.baseline_delete_forever_24;
        this.image2 = R.drawable.baseline_edit_24;
        this.id = counter++;
        System.out.println(this.id);
    }

    public String getPurchase() {
        return purchase;
    }

    public int getImage() {
        return image;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    public int getId() {
        return id;
    }


    public int getImage2() {
        return image2;
    }
}
