package cn.xpbootcamp.gildedrose;

/**
 * @author yang.yang
 */
public class BackstagePass  extends AbstractProduct {
    public static final int MIN_QUALITY = 0;
    public static final int MAX_QUALITY = 50;
    public static final int BEFORE_EXPIRE_INCR = 1;
    public static final int TEN_DAYS_BEFORE_EXPIRE_INCR = 2;
    public static final int FIVE_DAYS_BEFORE_EXPIRE_INCR = 3;
    public static final int ZERO = 0;
    public static final int FIVE = 5;
    public static final int TEN = 10;

    BackstagePass(int sellIn, int quanlity) {
        super(sellIn, quanlity);
    }

    @Override
    public void timeFlyTo(int updatedSellIn) {
        int quality = 0;
        int days = getSellIn() - updatedSellIn;
        if (getSellIn() > FIVE && getSellIn() <= TEN) {
            quality = getQuality() + (days * TEN_DAYS_BEFORE_EXPIRE_INCR);
        } else if(getSellIn() <= FIVE && getSellIn() > ZERO) {
            quality = getQuality() + (days * FIVE_DAYS_BEFORE_EXPIRE_INCR);
        } else if(getSellIn() <= ZERO) {
            quality = MIN_QUALITY;
        } else {
            quality = getQuality() + BEFORE_EXPIRE_INCR;
        }
        setSellIn(updatedSellIn);
        if (quality > MAX_QUALITY) {
            quality = MAX_QUALITY;
        }
        setQuality(quality > 0? quality: MIN_QUALITY);
    }
}
