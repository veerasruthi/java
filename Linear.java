import java.util.*;
public class Linear {
    public static  int demo(int arr[],int target)
    {
        int ind = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]== target)
            ind = i;
        }
        return ind;
    }
    public static void main(String[]args)
    {
        int arr[]={1,2,3,4,5,6,7};
        int search = 6;
        int res = demo(arr,search);
        System.out.print(res+ " ");
    }
}

