package chapters.chapters_12.Exercises.Exercise_08;

public class Hex2Dec {
    public static int hexToDecimal(String hex) throws HexFormatException {
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if (!(c >= 'A' && c <= 'F') && !(c >= '0' && c <= '9')) {
                throw new HexFormatException("Wrong input" );
            }
        }

        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if ('A' <= ch && ch <= 'F')
            return 10 + ch - 'A';
        else// ch is '0', '1', ..., or '9'
            return ch - '0';
    }
}
