package Learning_Java11.Arrays;

public class Max_Min_Array {
    public static void main(String[] args) {
        int a[] = { 22,55,33,88,58,69,78};
        int max = a[0];
        for(int i=0;i<a.length;i++){
                if(a[i]>max)
                {
                    max = a[i];
                }
        }
        System.out.println(max);
    }
}