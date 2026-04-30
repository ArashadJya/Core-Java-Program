import java.util.*;

class Demos
{
    public static void main(String[] args)
    {
        String s = "aaabbccccd";

        HashMap<Character,Integer> map = new HashMap<>();

        // Count frequency
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }

        // Convert map into list
        List<Character> list = new ArrayList<>(map.keySet());

        // Sort by frequency descending
        Collections.sort(list, (x,y) -> map.get(y)-map.get(x));

        // Print result
        String result = "";

        for(char ch : list)
        {
            int count = map.get(ch);

            for(int i=1; i<=count; i++)
            {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}
