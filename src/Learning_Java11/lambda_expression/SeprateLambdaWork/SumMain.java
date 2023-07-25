package Learning_Java11.lambda_expression.SeprateLambdaWork;

public class SumMain {
    public static void main(String[] args) {

        // using lambda for do SUM
        SumInterface s = (int a, int b) -> {
            return a+b;
        };
        System.out.println(s.sum(40,14));


        //for more concise
        SumInterface s2 = (a,b) -> a+b;
        System.out.println(s2.sum(15,20));

        // check String length

        LengthInterface l = (str -> str.length());
        System.out.println("String length is :"+l.getlength("Himanshu"));


    }


}
