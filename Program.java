import java.util.Scanner;


public class Program
{
	public static void main(String[] args)
	{
	    Scanner scanf = new Scanner(System.in);
	    ContaBanco registro = new ContaBanco();
	    
	    int numeroConta,escolha, controleW = 0, escolhaDeAlteracao;
	    double deposito,controleSaldo;
	    String nomeTitular;
	    
	    System.out.println("Conta");
	    
	    System.out.println("Qual o numero da conta?");
	    numeroConta = scanf.nextInt();
	    registro.setNumeroConta(numeroConta);
	    
	    scanf.nextLine();
	    
	    System.out.println("Qual o nome do titular?");
	    nomeTitular = scanf.nextLine();
	     registro.setNome(nomeTitular);
	     
	    System.out.println("Deseja fazer algum deposito? 1-sim 0-não ");
	    escolha = scanf.nextInt();
	    
	    if(escolha == 1)
	    {
	        System.out.println("Quanto deseja depositar?");
	        deposito = scanf.nextDouble();
	        registro.setDeposito(deposito);
	    }
	    else if (escolha == 0) 
	    {
	        deposito = 0;
	         registro.setDeposito(deposito);
	    }
	    else
	    {
	        System.out.println("Erro");
	    }
	    
	    System.out.println("Dados da conta: ");
	    
	    registro.MostracontaAtual();
	 
	    do{
	    System.out.println("Deseja alterar algo na sua conta?\n1 - Nome do titular da conta\n2 - Depositar\n3 - Retirar\n0 - Sair");
		escolhaDeAlteracao = scanf.nextInt();
		switch(escolhaDeAlteracao)
		{
		    case 0:
		        controleW = 0;
		        break;
		    case 1:
		        //Troca de nome
		        System.out.println("Qual será o novo nome do titular?");
		        String TrocaNome = scanf.next();
		        registro.setNome(TrocaNome);
		        registro.MostracontaAtual();
		        System.out.println("Deseja fazer mais alguma alteração? 1-Sim 0-Não");
		        controleW = scanf.nextInt();
		        break;
		        
		    case 2:
		        //Chama Deposito
		        System.out.println("Quanto deseja depositar?");
		        controleSaldo = scanf.nextDouble();
		        registro.Depositar(controleSaldo);
		        registro.MostracontaAtual();
		        System.out.println("Deseja fazer mais alguma alteração? 1-Sim 0-Não");
		        controleW = scanf.nextInt();
		        break;
		        
		    case 3:
		        //retira do Saque
		        System.out.println("Quanto deseja retirar?");
		        controleSaldo = scanf.nextDouble();
		        registro.Saque(controleSaldo);
		        registro.MostracontaAtual();
		        System.out.println("Deseja fazer mais alguma alteração? 1-Sim 0-Não");
		        controleW = scanf.nextInt();
		        break;
		        
		    default:
		        System.out.println("Erro");
		        System.out.println("Deseja fazer mais alguma alteração? 1-Sim 0-Não");
		        controleW = scanf.nextInt();
		        break;
		}
		} while(controleW == 1);
	    
	    
	}
}
