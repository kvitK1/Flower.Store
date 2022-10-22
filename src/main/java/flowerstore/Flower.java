package flowerstore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
    public String getType() { return flowerType.toString(); }

    @Override
    public String toString() {
        String result = "<" + Flower.class.getSimpleName() + ": (sepalLength: " + this.getSepalLength() +
                ", color: " + this.getColor() + ", price: " + this.getPrice() + ") >";
        return result;
    }
}
