package flower.store;

import flowerstore.FlowerStore;
import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.FlowerColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerStoreTest {
    private static final double SEPALLENGTH = 2.8;
    private static final int PRICE = 100;
//    private static final int QUANTITY = 20;
    private FlowerStore flowerStore;

    @BeforeEach
    public void init() {
        flowerStore = new FlowerStore();
    }

    @Test
    public void testStore() {
        Flower flower = new Flower();
        flower.setPrice(PRICE);
        flower.setFlowerType(FlowerType.TULIP);
        flower.setSepalLength(SEPALLENGTH);
        flower.setColor(FlowerColor.BLUE);
        flowerStore.addFlower(flower);
        Assertions.assertTrue(flowerStore.search(flower));
    }
}
