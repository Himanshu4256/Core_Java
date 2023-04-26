package package_program.stringwork;

public class ReverseString {
    public static void main(String[] args) {
        String z = "Himanshu";
        String reverse = "";

        for(int i=z.length()-1;i>=0;i--){
            //System.out.println(z.charAt(i));

            reverse = reverse+z.charAt(i);
        }
        System.out.println(reverse);
    }
}
