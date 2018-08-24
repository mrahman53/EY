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
        actualMap.put(6, "jumped");
        Map<Integer, String> expectedMap = DetermineWordLength.findTheLargestWord("The cow jumped over the moon.");
        Assert.assertEquals(actualMap, expectedMap );
    }
}
