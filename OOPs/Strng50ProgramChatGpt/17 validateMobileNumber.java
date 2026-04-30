 class validateMobileNumber {
    public static void main(String[] args) {
        String s="1234567897";
        int count=0;
        if (s.length()==10){
            for (int i=0;i<s.length();++i){
                if (Character.isDigit(s.charAt(i))){

                }
                else{
                   ++count;
                }
            }
            if (count==0){
                System.out.println("Valid Mobile number");
            }
            else{
                System.out.println("Invalid numbers");
            }
        }
        else{
            System.out.println("Invalid mobile numbers");
        }
    }
}
