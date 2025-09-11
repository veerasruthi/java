public class CountString {
    public static void main(String[]args)
    {
        String str = "Hey Everyone";
        int count = 0;
        str = str.toLowerCase();
        int vowles = 0, consonants = 0;
        for(int i = 0; i < str.length(); i++)
        {
             char ch = str.charAt(i);
             if(ch >='a' && ch <= 'z')
             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
             {
                vowles ++;
             }
             else 
             {
                consonants ++;
             }
        }
        System.out.println("vowles:"+vowles);
        System.out.println("consonants:"+consonants);
    } 

}
