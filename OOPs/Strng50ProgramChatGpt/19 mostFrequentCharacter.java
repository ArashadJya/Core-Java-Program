 class mostFrequentCharacter {
    public static void main(String[] args) {
        String a="arashad";
        char maxChar = 0;
        int maxcount=0;
        for (int i=0;i<a.length();++i){
            int count=0;

            for (int j=i+1;j<a.length();++j){
                if (a.charAt(i)==a.charAt(j))
                    ++count;
            }
            if (count>maxcount){
                maxcount=count;
                maxChar=a.charAt(i);
            }
        }
        System.out.println(maxChar);
    }
}
