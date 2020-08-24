package cn.xpbootcamp.gildedrose;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yang.yang
 */
public class GildedRose {
    private List<AbstractProduct> products;

    public GildedRose(List<AbstractProduct> products) {
        this.products = products;
    }

    public void timeFlyTo(int updatedsSellIn) {
        for (AbstractProduct product: products) {
            product.timeFlyTo(updatedsSellIn);
        }
    }

    public List<AbstractProduct> getProducts() {
        return products;
    }

    public static void main(String[] args) {
        GeneralProduct generalProduct = new GeneralProduct(5, 20);
        BackstagePass backstagePass = new BackstagePass(20, 40);
        List<AbstractProduct> products = new ArrayList<>();
        products.add(generalProduct);
        products.add(backstagePass);
        GildedRose gildedRose = new GildedRose(products);
        gildedRose.timeFlyTo(6);
        for (AbstractProduct product: gildedRose.getProducts()) {
            System.out.println(product.getQuality());
        }
    }
}
