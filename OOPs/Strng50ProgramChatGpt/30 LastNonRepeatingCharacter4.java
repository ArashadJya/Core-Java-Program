 class LastNonRepeatingCharacter {
     public static void main(String[] args) {
         String s="abbccfhhkkdd";
          for (int i=s.length()-1;i>=0;--i){
              int count=0;
              for (int j=s.length()-1;j>=0;--j){
                  if (s.charAt(i)==s.charAt(j)){
                      ++count;
                  }
              }
              if (count==1){
                  System.out.println(s.charAt(i));
                  break;
              }
          }
     }
}
