public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length!=pattern.length()) return false;
        Map<Character,String> dic = new HashMap<Character, String>(); 
        for(int i =0; i < pattern.length(); i++) {
            if(dic.containsKey(pattern.charAt(i))) {
                if(!dic.get(pattern.charAt(i)).equals(words[i]))
                    return false;
            } else if (dic.containsValue(words[i])){
                return false;
            } else {
                dic.put(pattern.charAt(i),words[i]);
            }
        }
        return true;
    }
}
