import java.util.Scanner;
import java.util.Arrays;

public class Strings
{
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Escreva uma frase(com no mínimo 5 caracteres): ");
		String frase = scanf.nextLine();
		
		System.out.println("Frase original: " + frase);
		System.out.println("Em minúsculas: " + frase.toLowerCase());
		System.out.println("Em maiúsculas: " + frase.toUpperCase());
		System.out.println("Sem espaços em branco: " + frase.trim());
		System.out.println("Substring: " + frase.substring(5));
		System.out.println("Substituição: " + frase.replace("a","b"));
		
	}
}