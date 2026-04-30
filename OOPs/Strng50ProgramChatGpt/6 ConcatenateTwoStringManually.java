 class ConcatenateTwoStringManually {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="world";
        String result="";
        for (int i=0;i<s1.length();++i){
            result=result+s1.charAt(i);
        }
        for (int i=0;i<s2.length();++i){
            result=result+s2.charAt(i);
        }
        System.out.println(result);
    }
}
