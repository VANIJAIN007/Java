import java.util.HashMap;
import java.util.Map;

public class LengthLongestSubstring
{
    public static void main(String[] args) {
    }
    public static int lengthOfLongest(String s)
    {
        Map<Character,Integer> map=new HashMap<>();
        int maxLength=0;
        int start=0;
        for (int i = 0; i < s.length() ; i++) {
            char RightChar=s.charAt(i);
            if(map.containsKey(RightChar))
            {
                start=Math.max(start,map.get(RightChar)+1);
            }
            map.put(RightChar,i);
            maxLength=Math.max(maxLength,i-start+1);
        }
        return maxLength;

    }
}
