package package_program.stringwork;

public class PalindromeString {
    public static void main(String[] args) {
        String z = "Himanshu";
        String reverse = "";

        for(int i=z.length()-1;i>=0;i--){
            //System.out.println(z.charAt(i));

            reverse = reverse+z.charAt(i);
        }
        if(reverse.equals(z)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
