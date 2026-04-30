 class printAllPermutation {
    public static void main(String[] args) {
        String s="abcd";
        for (int i=0;i<s.length();++i){
            for (int j=0;j<s.length();++j){
                for (int k=0;k<s.length();++k){
                    for (int l=0;l<s.length();++l){
                        if (i!=j && i!=k && i!=l && j!=k && j!=l  && k!=l ){
                            System.out.print(" "+s.charAt(i)+s.charAt(j)+s.charAt(k)+s.charAt(l)+" ");

                        }
                    }
                }
            }
        }
    }
}
