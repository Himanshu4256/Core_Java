package package_program.exception_handling;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException //unchecked exception
{
    YoungerAgeException(String msg)
    {
        super(msg); // ye default exception handler ko description provide krta hai
    }
}

public class ThrowKeywordException
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");

        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new YoungerAgeException("You are not Eligible for Voting"); // basically it's a object
            } else {
                System.out.println("You are eligible for voting");
            }
        }
        catch (YoungerAgeException e)
        {
            e.printStackTrace();
            System.out.println("Finish....");
        }
    }
}

