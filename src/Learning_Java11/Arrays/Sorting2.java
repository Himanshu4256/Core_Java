package Learning_Java11.Arrays;

public class Sorting2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,7,8};
        System.out.println("duplicate value are :");
        for (int i = 0; i<arr.length-1;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j) {
                    System.out.println(arr[j] + ",");
                }
            }
        }
    }
}