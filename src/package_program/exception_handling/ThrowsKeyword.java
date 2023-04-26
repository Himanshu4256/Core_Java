package package_program.exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThrowsKeyword {
    void readFile() throws FileNotFoundException
    {
        FileInputStream f = new FileInputStream("/Users/laxminarayansharma/Desktop");
    }
    void saveFile() throws FileNotFoundException{
        String text = "This IS Demo";
        FileOutputStream Op = new FileOutputStream("FileNotFoundException");
    }
}
class Tests
{
    public static void main(String[] args) {
        ThrowsKeyword t = new ThrowsKeyword();
        // abb readFile wale Method ki exception ko yha handle krenge
        try {
            t.readFile();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("-----Finish readFile Method------");


        try{
            t.saveFile();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("-----Finish saveFile Method------");
    }
}