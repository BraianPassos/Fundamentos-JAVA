public class Livros {
    //Atributos: nomes, autores e ano de publicação
	public String NomeLivro;
	public String Autor;
	public int Ano;
	
	public void mostrarLivros() {
		System.out.println("Nome: " + NomeLivro);
		System.out.println("Autor: " + Autor);
		System.out.println("Ano: " + Ano);
		System.out.println("-------------------------------------------");
	}
		
}