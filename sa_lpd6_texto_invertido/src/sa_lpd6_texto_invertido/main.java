package sa_lpd6_texto_invertido;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, ingresa una palabra o frase:");
        String input = scanner.nextLine();
        String reversedText = reverseText(input);
     
        System.out.println("Texto al revés: " + reversedText);
  
        scanner.close();
    }
    public static String reverseText(String text) {
       
        StringBuilder reversed = new StringBuilder();
                
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }
}
