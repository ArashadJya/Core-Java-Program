 class printASCIIValues {
    public static void main(String[] args) {
        String s="ABC";
        for (int i=0;i<s.length();++i){
            int a=(int) s.charAt(i);
            System.out.print(a+" ");
        }
    }
}
