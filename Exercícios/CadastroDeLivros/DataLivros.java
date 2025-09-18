import java.util.Scanner;

public class DataLivros {

	public static void main(String[] args) {
		
		String nomeLivro, nomeAutor;
		int anoLivro, quantidade;
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Cadastro de Livros");
		System.out.println("Quantos Livros deseja cadastrar? ");
		quantidade = scanf.nextInt();
		
		Livros[] livro = new Livros[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			livro[i] =  new Livros();
			System.out.println("Livro "+(i+1)+":");
			//Adicionei isso por cuase de um erro que tava dando(não era possível ler o nome do livro)
			//ficava pulando a linha, aí lancei no gpt e el falou algo sobre consumo da função.
			//Não entendi nada, mas o código funciona. GET THE VISION = Pega a visão.
			scanf.nextLine();
			
			System.out.println("Qual o título do livro? ");
			nomeLivro = scanf.nextLine();
			livro[i].NomeLivro = nomeLivro;
			System.out.println("Qual o nome do Autor? ");
			nomeAutor = scanf.nextLine();
			livro[i].Autor = nomeAutor;
			System.out.println("Qual foi o ano de publicação? ");
			anoLivro = scanf.nextInt();
			livro[i].Ano = anoLivro;
		}
		
		System.out.println("------------------Livros-----------------");
		for (int i = 0; i < quantidade; i++) {
			livro[i].mostrarLivros();
		}
	}
}