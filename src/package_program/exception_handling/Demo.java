package package_program.exception_handling;

public class Demo {
    public static void main(String[] args) {
        int a = 102;
        int b = 0;
        int c = 10;

        String value = "1111@";
        Integer i = 0;
        System.out.println("Welcome---------");

        try{
            i=Integer.parseInt(value);
            System.out.println("----Number----");
        }
        catch (NumberFormatException n){
            i = 0000;
            System.out.println("String");
            n.printStackTrace();
        }
        System.out.println("i :"+i);
    }
}
