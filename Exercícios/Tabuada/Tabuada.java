import java.util.Scanner;

public class Tabuada
{
	public static void main(String[] args) {
	    Scanner scanf = new Scanner(System.in);
	    
		int num,resultado;
		
		System.out.println("Tabuada");
		
		System.out.println("Digite um número para a tabuada: ");
		num = scanf.nextInt();
		resultado = num;
		System.out.println("Tabuada de " + num);
		
		for(int i = 1; i <= 10; i++){
		    resultado = num * i;
	        System.out.println(num + " x " +i+ " = " +resultado);
		}
		
		scanf.close();
	}
}
