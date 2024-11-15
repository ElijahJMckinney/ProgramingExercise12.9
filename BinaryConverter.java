package progexec;

public class BinaryConverter {
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        // Check if the string is a valid binary number
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Invalid binary string: " + binaryString);
            }
        }

        // Convert binary string to decimal
        int decimalValue = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            decimalValue = decimalValue * 2 + (binaryString.charAt(i) - '0');
        }
        return decimalValue;
    }
}
