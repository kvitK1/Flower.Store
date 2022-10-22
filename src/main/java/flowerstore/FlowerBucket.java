package flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    @Getter
    @Setter
    private List<FlowerPack> bucket = new ArrayList();
    private int amount = 0;
    private List<String> colours = new ArrayList();

//    public List<FlowerPack> desirableInSearch(Flower wantedFlower) {
//        boolean typeChecker = true;
//        boolean colorChecker = true;
//        boolean priceChecker = true;
//        List<FlowerPack> packs = new ArrayList();
//        for (FlowerPack pack : bucket) {
//            typeChecker = wantedFlower.getType().equals(pack.getType());
//            colorChecker = wantedFlower.getColor().equals(pack.getColor());
//            priceChecker = wantedFlower.getPrice() *
//            pack.getAmount() == pack.getPrice();
//            if (typeChecker && colorChecker && priceChecker) {
//                packs.add(pack);
//            }
//        }
//        return packs;
//    }

    public void add(FlowerPack pack) {
        bucket.add(pack);
        amount += 1;
        colours.add(pack.getColor());
    }

    public double getPrice() {
        double totalSum = 0;
        for (FlowerPack flowery : bucket) {
            totalSum += flowery.getPrice();
        }
        return totalSum;
    }

    @Override
    public String toString() {
        String result = "FlowerBucket: ";
        for (FlowerPack pack: bucket) {
            result += pack.toString() + " ";
        }
        result += ", amount: " + this.amount;
        return result;
    }
}


