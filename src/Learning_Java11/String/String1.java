package Learning_Java11.String;

public class String1 { 
    public static void main(String[] args) {
        String s1 = "Java"; //creating string by Java string literal

        char ch[]={'s','t','r','i','n','g'};
        String s2 = new String(ch);//convert char array to string
        String s3 = new String("example"); //creating Java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}