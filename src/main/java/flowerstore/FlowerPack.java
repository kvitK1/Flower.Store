package flowerstore;

import lombok.Getter;
import lombok.Setter;
@Setter @Getter
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack (Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public double getPrice() {
        return flower.getPrice()*amount;
    }
    public String getColor() { return flower.getColor(); }

    public String getType () { return flower.getType(); }

    @Override
    public String toString() {
        String result = "FlowerPack {" + this.flower.toString()
                + " * amount: " + this.amount + "}";
        return result;
    }
}

