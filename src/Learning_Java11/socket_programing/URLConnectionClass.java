package Learning_Java11.socket_programing;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.io.FileInputStream;

public class URLConnectionClass {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.ducatindia.com/");
            URLConnection uricon = url.openConnection();
            InputStream stream = uricon.getInputStream();
            int i;
            while ((i = stream.read()) != -1){
                System.out.println((char)i);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
