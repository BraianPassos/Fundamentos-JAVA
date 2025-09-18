import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String apresentacao = "Calculador de Imposto\nQual é o Seu salario?Segue a table oficial de impostos:\nSalário:\t\tDesconto\n$ 0 - 34712 \t\t 9.72%\n$ 34713 - 68507 \t 37.35%\n$ 68508 \t\t 49.50%\n\nDigite o seu salário:";
	    System.out.print(apresentacao +" ");
	    
	    double salario = scanner.nextDouble();
	    String salarioDescontado = calculadoraSalario(salario);
	    
	    System.out.println(salarioDescontado);
	}
	
	public static String calculadoraSalario(double salario){
	  
	    double resultadoSalario = salario;
	    double salarioAnual = salario * 12;
	    double desconto;
	    double impostoNivel_1 = 0.0970;
	    double impostoNivel_2 = 0.3735;
	    double impostoNivel_3 = 0.4950;
	    
	    if(salario >= 0 && salario <= 35712){
	        resultadoSalario -= salario * impostoNivel_1;
	        desconto = salario * impostoNivel_1;
	    } else if (salario <= 68507 ){
	        resultadoSalario -= salario * impostoNivel_2;
	        desconto = salario * impostoNivel_2;
	    } else {
	        resultadoSalario -= salario * impostoNivel_3;
	        desconto = salario * impostoNivel_3;
	    }
	    
	    String mensagemDeSalalrio = "Salalrio Anual: "+ Double.toString(salarioAnual) +"\nSalário com desconto: "+ Double.toString(resultadoSalario) + "\nDesconto: " + Double.toString(desconto);
	    return mensagemDeSalalrio;
	}
}