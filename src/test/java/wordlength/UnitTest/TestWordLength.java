package wordlength.UnitTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import wordlength.DetermineWordLength;

import java.util.HashMap;
import java.util.Map;

public class TestWordLength {

    @Test
    public void largestWord(){
        Map<Integer, String> actualMap = new HashMap<Integer, String>();
        actualMap.put(8, "happiest");
        Map<Integer, String> expectedMap = DetermineWordLength.findTheLargestWord("Today is the happiest day of my life");
        Assert.assertEquals(actualMap, expectedMap );
    }
}
