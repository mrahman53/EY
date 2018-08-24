package wordlength;

import java.util.HashMap;
import java.util.Map;

public class DetermineWordLength {

    public static void main(String[] args) {
        String s="Today is the happiest day of my life";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        System.out.println(wordNLength.get(1)+ " " + wordNLength.get(1));

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        String[] word=wordGiven.split(" ");
            for(int i=0;i<word.length;i++){
                if(word[i].length()>=st.length()){
                    st=word[i];
                }
            }
            map.put(st.length(), st);
        return map;
    }
}
