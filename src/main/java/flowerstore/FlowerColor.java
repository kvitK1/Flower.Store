package flowerstore;

import lombok.Getter;
import lombok.Setter;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF"), WHITE("#FFFFFF");
    private String color;
    FlowerColor(String color) {
        this.color = color;
    }

    public String toString() {
        return color;
    }
}
