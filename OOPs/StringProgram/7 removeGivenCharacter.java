class removeGivenCharacter {
    public static void main(String[] args) {
        String s="Arashad";
       char ch='h';
        //h ko remove karna hai
        for (int i=0;i<s.length();++i){
           if (s.charAt(i)!=ch){
               System.out.print(s.charAt(i));




            }
        }
    }
}
