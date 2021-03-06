package wordlength;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineWordLength {

    public static void main(String[] args) {
        String s="The cow jumped over the moon.";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        Iterator it = wordNLength.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " " + pair.getValue());

        }

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
