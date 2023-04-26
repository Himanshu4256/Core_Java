package package_program.exception_handling;

public class HandlingOnCalling {
    public static void main(String[] args) {
        HandlingOnCalling h = new HandlingOnCalling();
        try{
            h.divide();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Finish");
    }

    void divide(){
        int a=100, b=3, c;
        c=a/b;
        System.out.println(c);
    }
}
