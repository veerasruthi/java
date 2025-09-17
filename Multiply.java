import java.util.*;
public class Multiply 
{
    public static int[] Product(int arr[]) //238
    {
        int prd=1;
        int ind=-1;
        int zc=0;
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i] == 0)
           {
            zc++;
            if(zc > 1) return ans;
            ind = i;
           }
           else
           {
            prd = prd* arr[i];
           }
           if(zc==1)
           {
            ans[ind]=prd;
            return ans;
           }
        }
           for(int i=0;i<arr.length;i++)
           {
            ans[i] = prd/arr[i];
           }
           return ans;
        
    }

    public static void main(String[]args)
    {
        int arr[] = {1,2,0,4,5};
        int ans[] = Product (arr);
        System.out.print(Arrays.toString(ans));
    }
    
}
    
