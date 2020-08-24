package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BackstagePassTest {

    @ParameterizedTest
    @CsvSource(value = {"15,20,14,21", "10,45,9,47", "9,45,8,47",
            "10,49,9,50" ,"10,50,9,50", "5,49,4,50", "5,45,4,48", "1,20,0,23","0,20,-1,0" })
    public void should_return_correct_quality_when_after_several_days(int sellIn, int quality, int updatedSellIn,
                                                                              int updatedQuality) {
        BackstagePass backstagePass = new BackstagePass(sellIn, quality);
        backstagePass.timeFlyTo(updatedSellIn);
        Assert.assertEquals(updatedSellIn, backstagePass.getSellIn());
        Assert.assertEquals(updatedQuality, backstagePass.getQuality());
    }
}
