package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneralProductTest {

    @ParameterizedTest
    @CsvSource(value = {"10,20,9,19", "2,0,1,0", "3,6,2,5", "0,6,-1,4", "-1,6,-2,4"})
    public void should_return_correct_quality_when_after_several_days(int sellIn, int quality, int updatedSellIn,
                                                                       int updatedQuality) {
        GeneralProduct generalProduct = new GeneralProduct(sellIn, quality);
        generalProduct.timeFlyTo(updatedSellIn);
        Assert.assertEquals(updatedSellIn, generalProduct.getSellIn());
        Assert.assertEquals(updatedQuality, generalProduct.getQuality());
    }
}
