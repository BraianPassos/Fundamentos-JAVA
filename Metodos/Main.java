import java.util.Random;
import java.util.Arrays;

class Main{
	public static void main(String[] args) {
	    
		int[] array = new int[5];
		Random rand = new Random();
		Metodos obj = new Metodos();
		
		for(int i = 0; i < 5; i++){
		array[i] = rand.nextInt(100);
		}
		
		int media = obj.mediaBusca(array);
		int maior = obj.maiorElemento(array);
		int contador = obj.contadorPar(array);
		
		System.out.println("Array: " + Arrays.toString(array));
		System.out.println("Media: " + media);
		System.out.println("Maior valor: " + maior);
		System.out.println("Número de valores pares: " + contador);
	}
}
