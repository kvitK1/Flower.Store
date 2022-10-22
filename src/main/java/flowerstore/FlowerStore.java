package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {

    List<Flower> flowerCatalog = new ArrayList();

//    public boolean search(Flower wantedFlower) {
//        List<FlowerBucket> appealingBuckets = new ArrayList();
//        for (FlowerBucket bucket: flowerCatalog) {
//            List<FlowerPack> res = bucket.desirableInSearch(wantedFlower);
//            if (res.size()!=0) { appealingBuckets.add(bucket); }
//        }
//        return (appealingBuckets.size()>0);
//    }

    public void addFlower(Flower flower) {
        this.flowerCatalog.add(flower);
    }

    public boolean search(Flower wantedFlower) {
        boolean typeChecker;
        boolean colorChecker;
        boolean priceChecker;
        List<Flower> packs = new ArrayList();
        for (Flower flower: flowerCatalog) {
            typeChecker = wantedFlower.getType().equals(flower.getType());
            colorChecker = wantedFlower.getColor().equals(flower.getColor());
            priceChecker = wantedFlower.getPrice() == flower.getPrice();
            if (typeChecker && colorChecker && priceChecker) {
                packs.add(flower);
            }
        }
        return (packs.size()>0);
    }

}
