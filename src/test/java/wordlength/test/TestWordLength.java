package wordlength.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import wordlength.DetermineWordLength;

import java.util.HashMap;
import java.util.Map;

public class TestWordLength {

    @Test
    public void largestWord(){
        Map<String, Integer> actualMap = new HashMap<String, Integer>();
        actualMap.put("happiest", 8);
        Map<String, Integer> expectedMap = DetermineWordLength.findTheLargestWord("Today is the happiest day of my life");
        Assert.assertEquals(actualMap, expectedMap );
    }
}
