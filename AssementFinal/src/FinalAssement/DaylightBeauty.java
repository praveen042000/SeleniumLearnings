package FinalAssement;

import java.util.Scanner;

public class DaylightBeauty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numeric barcode: ");
        String Barcode = sc.nextLine();     
        String ProductCode = convertToAlphabeticCode(Barcode);      
        if (ProductCode.equals("Invalid Numeric Digits")) {
            System.out.println(ProductCode);
        } else {
            System.out.println("Alphabetic Product Code: " + ProductCode);
        }
    } 
    public static String convertToAlphabeticCode(String Barcode) {
        String ProductCode = "";
        String[] digitToLetter = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        for (int i = 0; i < Barcode.length(); i++) {
            char digit = Barcode.charAt(i);
            
            if (Character.isDigit(digit)) {
                int index = digit - '0';              
                if (index >= 0 && index <= 9) {
                	ProductCode += digitToLetter[index];
                } else {
                    return "Invalid Numeric Digits";
                }
            } else {
                return "Invalid Numeric Digits";
            }
        }    
        return ProductCode;
    }
}
