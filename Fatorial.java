import java.util.Scanner;


public class Fatorial
{
	public static void main(String[] args) {
	    Scanner scanf = new Scanner(System.in);
	    
	    FatorialCalc calculo = new FatorialCalc();
	    
		int num,resultado;
		
		System.out.println("Fatorial");
		
		System.out.println("Digite um numero para ser fatorado: ");
		num = scanf.nextInt();
		
		if(num >= 0){
		    resultado = calculo.fatorialCalculo(num);
		    System.out.println("Fatorial de "+num+ " = " + resultado);
		}
		else{
		    System.out.println("Entrada invalida: " +num);
		}
		
		scanf.close();
	}
}