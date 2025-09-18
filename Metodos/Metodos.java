public class Metodos{
    public int mediaBusca(int[] array){
        int soma = 0;
        int media = 0;
        
        for(int i = 0; i < 5; i++){
            soma += array[i];
        }
        
        media = soma/5;
        return media;
    }
    
    public int maiorElemento(int[] array){
        int comparador=0;
        
        for(int i = 0; i < 5; i++){
            if(array[i] >= comparador){
                comparador = array[i];
            }
        }
        return comparador;
    }
    
    public int contadorPar(int[] array){
        int contPar=0;

        for(int i = 0; i < 5; i++){
            if(array[i] %2 == 0){
                contPar +=1;
            }
        }
        return contPar;
    }
}