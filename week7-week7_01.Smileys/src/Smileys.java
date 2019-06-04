
public class Smileys {

    public static void main(String[] args) {
        //Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
        //:) \:D/ :)

    }

    private static void printWithSmileys(String str) {

        String smiles = "";

        if (str.length() % 2 == 0) {
            str = ":) ".concat(str).concat(" :)");
        } else {
            str = ":) ".concat(str).concat("  :)");
        }
        for (int i = 0; i < str.length(); i = i + 2) {
            smiles += ":)";
        }
        System.out.println(smiles);
        System.out.println(str);
        System.out.println(smiles);
    }

}
