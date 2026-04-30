 class MinFrequentCharacter {
    public static void main(String[] args) {
        String s="aaabbbcdddeeefff";

        int minCount=Integer.MAX_VALUE;
        System.out.println(minCount);
        char minchar=0;
        for (int i=0;i< s.length();++i){
            int count=0;
            for (int j=0;j<s.length();++j){
                if (s.charAt(i)==s.charAt(j)){
                    ++count;
                }
            }
            if (minCount>count){
                minCount=count;
                minchar=s.charAt(i);
            }

        }
        System.out.println(minchar);

    }
}
