//Write a method to split a comma spereated String in java
 class program12 {

    public static void splitString(String input){

        String[] arr=input.split(",");

        for (String s:arr){
            System.out.println(s);

        }
    }

    public static void main(String[] args) {
        String s="Apple,Banana,Mango,kela,seb";
        splitString(s);
    }
}
