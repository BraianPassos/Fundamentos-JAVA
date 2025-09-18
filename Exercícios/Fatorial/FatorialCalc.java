public class FatorialCalc {
	
	public int fatorialCalculo(int num){
	    int aux=1;
	    int control = num;
	    
        for (int i = 0; i < num; i++){
        aux *= control; 
        control--;
        }
        
    return aux;
    
    }
}