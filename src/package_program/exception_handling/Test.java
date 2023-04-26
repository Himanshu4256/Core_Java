package package_program.exception_handling;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;
        try{
            c = a/b;
        }
        catch (Exception e) // (AirthmaticException e)
        {
            System.out.println(e);
            System.out.println("Finish...");
        }



    }
}
