import java.util.*;
public class Mergearr {
    public static void main(String[] args)
    {
        int arr1[]={2,3,4};
        int arr2[]={5,6,7};
        int v = 0;
        int newarr[] = new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            newarr[v++]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++)
        {
            newarr[v++]=arr2[j];
        }
        System.out.print(Arrays.toString(newarr));
    }
    
}
