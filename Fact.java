public class Fact {
    public static void main(String[]args)
    {
        int a = 2;
        int fact = 1;
        factorial (a,fact);
    }
    static void factorial  (int a,int fact)
    {
        for(int i=1; i<=a; i++)
        {
            fact = fact * i;
        }
        System.out.print(fact);
    }
    
}
