 class program11 {
    public static void main(String[] args) {
        String s1="jypa";
        String s2="ayjm";

        if (s1.length()!=s2.length()){
            System.out.println("Not anagram");
            return;
        }

     int count=0;
        for (int i=0;i<s1.length();++i){
            if (s2.indexOf(s1.charAt(i))==-1){
                ++count;
            }


        }
        if (count==0){
            System.out.println("This is  anagram string");
        }
        else{
            System.out.println("This is not anagram string");
        }
    }
}
