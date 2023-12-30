import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < words[i].length(); j++){
                char ch = words[i].charAt(j);
                int c = map.getOrDefault(ch, 0);
                c++;
                if(c % n == 0){
                    map.remove(ch);
                }else map.put(ch, c);

            }
        }
        return map.isEmpty();
    }
}
