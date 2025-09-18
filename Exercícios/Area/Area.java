import java.util.Scanner;

public class Area
{
	public static void main(String[] args) {
	    Scanner scanf = new Scanner(System.in);
	    
		double larg, comp, area,metro, preco;
		
		System.out.println("Calculadora de Áreas");
		
		System.out.println("Qual o tamanho da largura em metros?");
		larg = scanf.nextDouble();
		System.out.println("Qual o tamanho do comprimento em metros?");
		comp = scanf.nextDouble();
		System.out.println("Qual o valor do metro?");
		metro = scanf.nextDouble();
		
		area = larg*comp;
		preco = area * metro;
		
		String area_formatada = String.format("%.2f", area);
		String preco_formatado = String.format("%.2f", preco);
		
		System.out.println("Área: " + area_formatada + "\nPreço: " + preco_formatado);
		
		scanf.close();
	}
}