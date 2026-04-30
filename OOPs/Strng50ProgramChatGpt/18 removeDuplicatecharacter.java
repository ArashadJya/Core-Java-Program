import java.util.HashSet;

 class removeDuplicateWords {
    public static void main(String[] args) {
        String s="arashad";
        HashSet<Character> hs=new HashSet<Character>();
        for (int i=0;i<s.length();++i){
            char  ch=s.charAt(i);
            hs.add(ch);
        }
        System.out.println(hs);
    }
}
