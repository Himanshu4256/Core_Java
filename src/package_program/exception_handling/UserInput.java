package package_program.exception_handling;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Value");
        int a = sc.nextInt();
        System.out.println("Enter Second Value");
        int b = sc.nextInt();
         try{
           int c = a/b;
             System.out.println("Ans Is :"+c);
         }
         catch (ArithmeticException e){
             e.printStackTrace(); // if you write this (ArithmeticException e) and O/P m exception ka (name and line no. ,def) chahiye then ye likhna padega
                                  // if U write (Exception e) then ye method likhne ki jarurt ni hai wo all things o/p m auto dikha dega.
             System.out.println("Finish");
         }
    }
}
