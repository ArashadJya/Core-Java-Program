import java.util.HashSet;

 class commonCharactersInTwoStrings {
    public static void main(String[] args) {
        String s1="aabcdefghijl";
        String s2="abcijl";
        int count=0;
        HashSet<Character> hs=new HashSet<>();

        for (int i=0;i<s1.length();++i){
            for (int j=0;j<s2.length();++j){
                if (s1.charAt(i)==s2.charAt(j)){
                    hs.add(s1.charAt(i));
                }
            }
        }
        System.out.println(hs);
    }
}
