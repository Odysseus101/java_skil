public class LoglegEinkunn
{
    public static void main(String[] args)
    {
        float einkun, glank;
        einkun = Float.parseFloat(args[0]);

        glank = Math.round((einkun*10));

        if (glank > 0 && glank < 100){
            System.out.println("lögleg einkunn");
        }
        else if (glank < 0 || glank > 100){
            System.out.println("ólögleg einkunn");
        }
    }
}
