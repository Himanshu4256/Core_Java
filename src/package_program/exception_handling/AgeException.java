package package_program.exception_handling;

public class AgeException extends Exception {
    AgeException()
    {
        super("You are under age");
    }
    AgeException(String message)
    {
        super(message);
    }
}
class Voting{
    public static void main(String[] args) {
        int age=17;
        try{
            if(age<18)
            {
                throw new AgeException();
            }
            else
            {
                System.out.println("You can Vote NOw");
            }
        }
        catch (AgeException e){
            e.printStackTrace();
        }

    }
}
