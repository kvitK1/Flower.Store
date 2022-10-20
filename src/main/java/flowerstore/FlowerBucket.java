package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    public List<FlowerPack> bucket = new ArrayList();

    public void add(FlowerPack pack) {
        bucket.add(pack);
    }

    public double getPrice() {
        double totalSum = 0;
        for (FlowerPack flowery: bucket) {
            totalSum += flowery.getPrice();
        }
        return totalSum;
    }
}
