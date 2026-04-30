 class validateemailFormate {
     public static void main(String[] args) {
        String email="jya@gmail.com";
        int atPos=email.indexOf('@');
        int dotPos=email.lastIndexOf('.');
         if (atPos > 0 &&
                 dotPos > atPos + 1 &&
                 dotPos < email.length() - 1 &&
                 email.indexOf('@') == email.lastIndexOf('@')) {

             System.out.println("Valid Email");
         } else {
             System.out.println("Invalid Email");
         }
     }
}
