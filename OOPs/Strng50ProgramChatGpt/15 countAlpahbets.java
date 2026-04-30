 class countAlpahbets {
    public static void main(String[] args) {
        String s="ABCHSD8765";
        s=s.toLowerCase();
        int count=0;
        for (int i=0;i<s.length();++i){
            char ch=s.charAt(i);
            if (ch>='a' && ch<='z'){
                ++count;
            }
        }
        System.out.println(count);
    }
}
