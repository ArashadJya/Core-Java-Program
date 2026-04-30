import java.io.FileInputStream;
class checked {
    public static void main(String[] args) {
try{
    FileInputStream fis=new FileInputStream("d:/desktop:/Java Deepak Sir/OOPs/Inheritence/MultilevelInheritence");
}
catch (Exception e){
    System.out.println(e);
    System.out.println("file not found");
}
    }
}
