package package_program.exception_handling;

public class Array {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3, 4};
            System.out.println(arr[3]);
            int a = 10 / 0;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
//        catch (ArrayIndexOutOfBoundsException a) {
//            a.printStackTrace();
//        }
        System.out.println("----stop----");
    }
}
