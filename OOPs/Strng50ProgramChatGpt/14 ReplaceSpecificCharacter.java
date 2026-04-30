 class ReplaceSpecificCharacter {
    public static void main(String[] args) {
        String s="abcd";
        //replacing b to x

        String result="";
        for (int i=0;i<s.length();++i){
            if (s.charAt(i)=='b'){
                result=result+'x';

            }
            else{
                result=result+s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
