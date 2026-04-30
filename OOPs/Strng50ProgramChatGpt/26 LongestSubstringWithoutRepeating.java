 class LongestSubstringWithoutRepeating {
     public static void main(String[] args) {
         String str="abcabcdabcdea";
         String longest="";
        int maxLength=0;
        for (int i=0;i<str.length();++i){
            String temp="";
            for (int j=i;j<str.length();++j){
                 char ch=str.charAt(j);
                if (temp.indexOf(ch)!=-1) {
                    break;

                }
                temp=temp+str.charAt(j);
            }
            if (temp.length()>maxLength){
                maxLength=temp.length();
                longest=temp;

            }
        }
         System.out.println("Longest SubString "+longest);
         System.out.println("Longets substring length "+longest.length());



     }
}
