package package_program.exception_handling;

public class ExceptionHandler {
    public static void main(String[] args) {
        ExceptionHandler e = new ExceptionHandler();
        e.divide();
        System.out.println("Finish");
    }

    void divide()
    {
        int a =100, b=0, c;
        try {
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

    }
}