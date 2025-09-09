public class Prime {
    public static void main(String[]args)
    {
        int a = 5;
        prime (a);
    }
    static void prime (int a)
    {
     int count = 0;    
     for(int i=1;i<=a;i++)
     {
        if(a % i == 0)
        {
            count++;
        }
     }
     if(count == 2)
     {
        System.out.print("prime");
     }
     else
     {
        System.out.print("Not prime");
     }
    }

    
}

