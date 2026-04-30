//Count Digits in string
 class countdigitsInString {
    public static void main(String[] args) {
        String s="abchd49l87kj";
        int count=0;
        for (int i=0;i<s.length();++i){
            char ch=s.charAt(i);
            if (Character.isDigit(ch)){
                ++count;
            }
        }
        System.out.println(count);
    }
}
