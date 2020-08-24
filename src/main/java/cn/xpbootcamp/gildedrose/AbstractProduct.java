package cn.xpbootcamp.gildedrose;

/**
 * @author yang.yang
 */
abstract public class AbstractProduct {

    protected int sellIn;
    protected int quality;

    AbstractProduct(int sellIn, int quality) {
        this.sellIn = sellIn;
        this.quality = quality;
    }

    protected int getQuality() {
        return quality;
    }

    protected int getSellIn() {
        return sellIn;
    }

    protected void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    protected void setQuality(int quality) {
        this.quality = quality;
    }

    /**
     * sellIn -> updatedSellIn
     * @param updatedSellIn
     */
    abstract public void timeFlyTo(int updatedSellIn);
}
