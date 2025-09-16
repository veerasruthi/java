public class Monotonic {
    public static boolean CheckArray(int arr[])
    {
        boolean asc = true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1]) asc = false;
        }
        return asc ;
    }
public static void main(String[]args)
{
    int arr[] = {1,2,3,4,5,6};
    boolean ans = CheckArray(arr);
    System.out.print(ans);
}
}
