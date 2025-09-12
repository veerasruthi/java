public class Reverse {
    public static void main(String[]args)
    {
        int n=12345;
        int res = rev(n);
        System.out.print(res);
    }
     static int rev(int n)
    {
        int rev = 0;
        while(n!=0)
        {
            int d = n%10;
            rev = rev*10+d;
            n/=10;
        }
        return(rev);
    }
}
