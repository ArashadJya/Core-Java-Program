 class countSpecialCharacters {
    public static void main(String[] args) {
        String s="absc45673@#$%dg";
        int count=0;
        for (int i=0;i<s.length();++i){
            char ch=s.charAt(i);
            if (Character.isDigit(ch) || Character.isAlphabetic(ch)){

            }
            else{
                ++count;
            }
        }
        System.out.println(count);
    }
}
