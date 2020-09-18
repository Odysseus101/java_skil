public class Umferdarljos {
    public static void main(String[] args) {
        String j = args[0];
        String i = args[1];


        if (j == "g" && i == "g") {
            System.out.println("Árekstur");
        } else if (j == "r" && i = "r") {
            System.out.println("Stop");
        } else {
            if ((j == "g" && i == "l") || (j == "l" && i == "r")) {
                System.out.println("Bíll 1 keyrir");
            } else if ((j == "l" && i == "g") || (j == "r" && i == "l")) {
                System.out.println("Bíll 2 Keyrir");
            }
        }
    }
}
