import java.util.*;
class Strong
{
    public static void main(String[] args){
    int n=145;
    int orgnumber=n;
    int sum=0;
    while(n>0)
    {
        int temp=n%10;
        int factorial=1;
        for(int i=1;i<=temp;i++)
        {
            factorial*=i;
        }
        sum+=factorial;
        n/=10;
    }
    if(sum==orgnumber)
    {
        System.out.println("Strong number");
    }
    else
    {
        System.out.println("Not strong number");
    }
   }
}