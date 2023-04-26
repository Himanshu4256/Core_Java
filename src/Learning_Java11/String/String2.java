package Learning_Java11.String;

public class String2 {
     void check(String s){
         System.out.println("Yes");
     }

    public static void main(String[] args) {
        String2 s1 = new String2();
        String2 s2 = new String2();
        s1.check("");

        System.out.println(s1==s2); // ye reference check krta hai aur eska address heap mai jata hai

        String s3 = "ABC";
        String s4 = "ABC";
        System.out.println(s3==s4); // ye value check krta hai aur ye string pool mai 
    }
}