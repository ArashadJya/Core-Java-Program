 class removeSpaceFromString {
    public static void main(String[] args) {
        String s="Helllo world";
        String result="";
        for (int i=0;i<s.length();++i){
            if (s.charAt(i)!=' '){
                result=result+s.charAt(i);
            }

        }
        System.out.println(result);
    }
}
