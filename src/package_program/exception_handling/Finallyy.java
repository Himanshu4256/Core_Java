package package_program.exception_handling;

public class Finallyy {
    public static void main(String[] args) {
        try{
            int a = 40, b=2, c;
            c=a/b;
            System.out.println(c);
        }
//        catch (ArithmeticException e){
//            System.out.println("Excep -" +e );
//        }


        // WE CAN WRITE FINALLY WITHOUT CATCH()
        finally {
            System.out.println("I Will definitely Execute either Exception is occur or NOT..");
        }
    }
}
