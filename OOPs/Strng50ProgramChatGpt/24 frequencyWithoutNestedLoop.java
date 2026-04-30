import java.util.HashMap;

 class frequencyWithoutNestedLoop {
    public static void main(String[] args) {
        String s="arashad";
        HashMap<Character,Integer> hs=new HashMap<>();
        for (int i=0;i<s.length();++i){
            char ch=s.charAt(i);

            if (hs.containsKey(ch)){
                hs.put(ch,hs.get(ch)+1);
            }
            else{
                hs.put(ch,1);
            }
        }
        System.out.println(hs);

    }
}
