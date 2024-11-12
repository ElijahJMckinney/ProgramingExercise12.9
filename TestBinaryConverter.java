package progexec;

import java.util.Scanner;

//Test the Program.
public class TestBinaryConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = input.next();

        try {
            int decimalValue = BinaryConverter.bin2Dec(binaryString);
            System.out.println("Decimal value: " + decimalValue);
        } catch (BinaryFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
