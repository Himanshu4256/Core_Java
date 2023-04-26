package package_program.exception_handling;

public class ExceptionPrintWays {
    public static void main(String[] args) {
        try{
            int a=100, b=0, c;
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException xe){
            //xe.printStackTrace(); // sbse aacha method jo sari cheez print krata hai
            System.out.println("1st :"+xe);
            System.out.println("2st :"+xe.toString());
            System.out.println("3st :"+xe.getMessage());
        }
    }
}
