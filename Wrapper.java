import java.util.stream.Gatherer.Integrator;

public class Wrapper {
    public static void main(String[] args){
        // Integer wrappedNumber = 255;
        // int rawNumber = wrappedNumber;
        // System.out.println(wrappedNumber);
        // String binaryForm = Integer.toBinaryString(rawNumber);
        
        // String hexForm = Integer.toHexString(rawNumber);

        // System.out.println(binaryForm);
        // System.out.println(hexForm);


        // String priceText = "199.99";
        // String quantityText = "5";
        // double price = Double.parseDouble(priceText);
        // int quantity = Integer.parseInt(quantityText);

        // double totalCost = price* quantity;
        // String receiptOutput = Double.toString(totalCost);
        // System.out.println(receiptOutput);


        char symbol = '7';
        char letter = 'x';

        boolean isNum = Character.isDigit(symbol);
        boolean isAlpha = Character.isLetter(letter);
        char upperCaseLetter = Character.toUpperCase(letter);
        System.out.println(isNum);
        System.out.println(isAlpha);
        System.out.println(upperCaseLetter);

    }
    
}
