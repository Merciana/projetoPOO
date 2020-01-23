package Teste2;

public class Execício2 {
    public static boolean isNumeric(String Coisa) {
        try {
            Double.parseDouble(Coisa);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}