 class convertLowercaseToUppercase {
    public static void main(String[] args) {
        String s="hello world";
        String result="";
        for (int i=0;i<s.length();++i){
           char ch=s.charAt(i);

           if ('a'<=ch && 'z'>=ch){
               ch= (char) (ch-32);
               result=result+ch;
           }
           if (ch==' '){
               result=result+' ';

           }
        }
        System.out.println(result);
    }
}
