import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class readWrite {
    void readFile() throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("d:/abc.txt");
    }
    void savefile() throws FileNotFoundException{
        FileOutputStream fos=new FileOutputStream("d:/xyz.txts");
    }
}
class test5{
    public static void main(String[] args) {
        readWrite rw=new readWrite();
        try{
            rw.readFile();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        try{
            rw.savefile();
            System.out.println("File save ho gya");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
