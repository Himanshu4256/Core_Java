package Learning_Java11;

public class Variable_Shadowing
{
    String car_name = "Ferrari";
    long price = 50000000;

    public void showCar() {
        String car_name = "Bugatti";
        long price = 43000000;
        System.out.println("Car Name: "+car_name); // ye Var Hiding hai. bcoz phle local var(apne block) wale ko print krega.
        System.out.println("Price: "+price);
        System.out.println("Car Name: "+this.car_name);
        System.out.println("Price: "+this.price);
    }
    public static void main(String args[])
    {
        //new Variable_Shadowing().showCar();
        Variable_Shadowing d = new Variable_Shadowing();
        d.showCar();
    }
}