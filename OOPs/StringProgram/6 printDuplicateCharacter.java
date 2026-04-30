import java.util.HashSet;

 class printDuplicateCharacter {
    public static void main(String[] args) {
        String s="arashadeffgggtttbbbdddkkjhvhvjv";

        HashSet<Character> hs=new HashSet<>();
        for (int i=0;i<s.length();++i){
            int count=0;
            for (int j=0;j<s.length();++j){
                if(s.charAt(i)==s.charAt(j)){
                   count++;
                }
            }

            if(count>1){

                hs.add(s.charAt(i));
            }

        }
        System.out.println(hs);
    }
}
