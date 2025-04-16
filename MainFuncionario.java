import java.util.Scanner;

public class MainFuncionario
{
	public static void main(String[] args) {
	    //Variaveis: nome, salário bruto e taxa de imposto)
	    String NomeFunionario;
	    double salario, imposto, salarioBruto, aumentoSalario;
	    
	    Scanner scanf = new Scanner(System.in);
	    Funcionario funcionario = new Funcionario();
	    
		System.out.println("Calculadora Faz o L");
		
		System.out.println("Qual é o seu nome? ");
		NomeFunionario = scanf.nextLine();
		funcionario.setNome(NomeFunionario);
		
		System.out.println("Qual é o seu salário? ");
		salario = scanf.nextDouble();
		funcionario.setSalario(salario);
		
		System.out.println("Imposto: ");
		imposto = scanf.nextDouble();
		salarioBruto = funcionario.CalculoBruto(imposto);
		
		System.out.println("--------------------------------------------");
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("Salario: "+funcionario.getSalario());
		System.out.println("Imposto: "+imposto);
		System.out.println("--------------------------------------------");
		
		System.out.println("Funcionário: "+funcionario.getNome()+", "+ funcionario.getSalarioBruto());
		
		System.out.println("Qual a porcentagem de aumento de salário? ");
		aumentoSalario = scanf.nextDouble();
		funcionario.AumentoSalarial(aumentoSalario);
		System.out.println("Dados atualizados do funcionário: "+funcionario.getNome() +", "+ funcionario.getSalario());
	}
}
