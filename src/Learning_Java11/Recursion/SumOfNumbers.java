package Learning_Java11.Recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        //System.out.println(sum(15));
        System.out.println(power(3,5));
    }

    static int sum(int n){
        if (n==1){
            return 1;
        }
        return n + sum(n-1);
    }

    static int power(int a, int b){
        if (b == 0){
            return 1;
        }
        return a*power(a,b-1);
    }
}
