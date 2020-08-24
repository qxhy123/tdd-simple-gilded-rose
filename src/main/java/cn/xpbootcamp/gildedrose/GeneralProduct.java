package cn.xpbootcamp.gildedrose;

/**
 * @author yang.yang
 */
public class GeneralProduct extends AbstractProduct {

    public static final int MIN_QUALITY = 0;
    public static final int NON_EXPIRED_QUALITY_DECR = 1;
    public static final int EXPIRED_QUALITY_DECR = 2;

    GeneralProduct(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public void timeFlyTo(int updatedSellIn) {
        int quality;
        int days = getSellIn() - updatedSellIn;
        if (getSellIn() > 0) {
            quality = getQuality() - (days * NON_EXPIRED_QUALITY_DECR);
        } else {
            quality = getQuality() - (days * EXPIRED_QUALITY_DECR);
        }
        setSellIn(updatedSellIn);
        setQuality(quality > 0? quality: MIN_QUALITY);
    }
}
