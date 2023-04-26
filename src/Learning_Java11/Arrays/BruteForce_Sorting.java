package Learning_Java11.Arrays;

public class BruteForce_Sorting {
    public static void main(String[] args)
    {
        int[] a = {3,5,4,3,2,2,1};
        System.out.println("duplicate values are :");
        for(int i = 0; i<a.length-1;i++) // for complete array perform
        {
            for(int j = i+1; j<a.length;j++)// ye check krega 1-1 element ko
                {
                if((a[i]==a[j]) && (i!=j)){
                    System.out.println(a[j]+",");
                }
            }
        }
    }
}
