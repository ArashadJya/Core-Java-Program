public class stringRotation {
    public static void main(String[] args) {
        String s1="ABCe";
        String s2="BCDA";
        if (s1.length()!=s2.length()){
            System.out.println("string is not rotation");
            System.out.println("1");
        }
        String temp=s1+s1;
        if (temp.contains(s2)){
            System.out.println("String is rotation");

        }
        else{
            System.out.println("String is not rotation");
        }
    }
}
