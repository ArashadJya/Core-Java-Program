 class firstRepeatedCharacter {
    public static void main(String[] args) {
        String s="bcdahhmmkk";
        int count=0;
        for (int i=0;i<s.length();++i){
            for (int j=i+1;j<s.length();++j){
                if (s.charAt(i)==s.charAt(j)){
                    System.out.println(s.charAt(i));
                    ++count;
                    break;
                }
            }
            if (count>0){
                break;
            }
        }
    }
}
