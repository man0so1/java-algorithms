package strings;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class DetermineColorOfChessboardSquare {
    public static boolean squareIsWhite(String coordinates) {
        // буква четная и число нечетное -> тру
        Character symbol = coordinates.charAt(0);
        int num = coordinates.charAt(1) - '0';
        if (num == 1) return symbol.hashCode() % 2 == 0;
        else if (symbol.hashCode() % 2 == 0 && num % 2 != 0) return true;
        else if (symbol.hashCode() % 2 != 0) return num % 2 == 0;
        return false;
    }
}
