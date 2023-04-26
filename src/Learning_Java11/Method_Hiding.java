package Learning_Java11;
public class Method_Hiding {

    public static void showCar() {
        String car_name = "Bugatti";
        long price = 43000000;
        System.out.println("Car Name: " + car_name); // ye Var Hiding hai. bcoz phle local var(apne block) wale ko print krega. in short local,instace var ka name same hona chahiye.
        System.out.println("Price: " + price);
    }

}
class Hiding extends Method_Hiding {

    public static void showCar() {  // yha yemethod override ni ho rha ye overhide ho rha hai. bcoz static lga hai static kbhi override nahi hote. aur same name bhi Hai.
        String car_name = "Lamborghini";
        long price = 50000000;
        System.out.println("Car Name: " + car_name);
        System.out.println("Price: " + price);
    }
    public static void main(String args[]) {
        new Hiding().showCar();

    }
}

