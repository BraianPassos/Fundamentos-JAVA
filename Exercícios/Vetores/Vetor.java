import java.util.Random;
import java.util.Arrays;

public class Vetor
{
	public static void main(String[] args) {
		int[] array = new int[5];
		Random rand = new Random();
		int soma = 0;
		
			for(int i = 0; i < 5; i++){
		    array[i] = rand.nextInt(201) - 100;
		    soma += array[i];
		}
		System.out.println("Array: " + Arrays.toString(array));
		System.out.print("Elementos do array: ");
		for(int i = 0; i<5; i++){
		        System.out.print(" "+array[i] + " ");
		    }
		System.out.println("\nSoma: " + soma);
	}
}
