/*

Nafn : Kristján Kári Gunnarsson
Email: kkg6@hi.is

Frotitið skoðar hvað hitastig sem er set inn og prentar út "Hitabylgja" ef hitastigið sem er set inn er hærri en 30.

 */
public class Hitastig
    {
        public static void main(String[] args)
        {
         int hitastig;
            hitastig = Integer.parseInt(args[0]);

            if (hitastig > 30)
                System.out.println("Hitabylgja");
        }
}