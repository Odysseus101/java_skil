public static int aha(int a, int b) 
{
     if (a < b) return 0;
     return 1 + aha(a -b, b);
}
public class Aha
{
    public static void main(String[] args)
    {
        aha(7,2);
    }
}