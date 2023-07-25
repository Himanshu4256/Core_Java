package Learning_Java11.lambda_expression.SeprateLambdaWork;

public class Main {
    public static void main(String[] args) {
        System.out.println("My System starts...");

        //THERE ARE 3 WAYS TO USE FUNCTIONAL INTERFACE WITHOUT USING IMPLEMENTS.



        // [1] Old way use interface in main class
//        MyInter myinter = new MyInrfceImplts();
//        myinter.sayHello();


        // [2] new way use interface in main class WHICH IS CALLED ANONYMOUS_CLASS && agr interface m 2 method hai to ese use kro

        MyInter i = new MyInter() // yha ye inetrfce ka obj ni bna rha ye ANONYMOUS_CLASS bna rha hai.
        {
            @Override
            public void sayHello() {
                System.out.println("This is first anonymous class");
            }
        };
        i.sayHello();

        // [3] new way use interface in main class using [Lambda] && ye sirf functional interface k liye use hota hai jisme 1 hi method ho..

        MyInter l = () -> System.out.println("accessing functional interface using lambda");;
        i.sayHello();

    }}
