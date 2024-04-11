package SortAlgorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] a ={2,1};  
        sortTwo(a);
    }


//vou receber um array 
//vou colocar o pivot na primeira posição desse array 
    //vou ordenar esse valor 
        //isso siginifica que todos os numeros que vao ficar a esquerda dele serão menores que o pivot, e que todos a direita sejam maiores que o pivot
    //para fazer isso vou utilizar duas variaveis i e j
        //i começa do inicio do vetor e vai até o final 
        //j começa do final do vetor e vai até o inicio 
        //i tenta buscar um elemento que seja maior que o pivot 
        //j tenta buscar um elemento que seja menor que o pivot 
        //quando i e j estiverem satisfeitos voce troca os valores deles
        //faz isso até que j>i
            //e ai troca o valor de j pelo valor do pivot 
    //vou retornar a lista com esse valor ordenado 
    public static void sortOne(int[] array){
        int pivot = array[0];
        int i=0;
        int j=array.length-1;
        while (i<j) {
            do{
                i++;
            }while(array[i]<pivot);
            do{
                j--;
            }while(array[j]>pivot);
            if (i<j) {
                int aux = array[i];
                array[i]=array[j];
                array[j]=aux;
            }
        }
        int aux = array[j];
                array[j]=pivot;
                array[0]=aux;
        for (int k : array) {
            System.out.print(k+" ");
        }
    }
    public static void sortTwo(int[] array){
        int pivot = array[0];
        int i=1;
        int j=array.length-1;
        while (i<=j) {
            if(array[i]<=pivot){
                i++;
            }else
            if(array[j]>pivot){
                j--;
            }
            //se o array na posição i for maior que o pivot
            //e o array na posição j for menor que o pivot 
            //ele troca os valores de j e i e os faz passar proproximo elemento 
            else{
                int aux = array[i];
                array[i]=array[j];
                array[j]=aux;
                i++;
                j--;
            }
        }
        if(array[j]<pivot){
        array[0]=array[j];
        array[j]=pivot;
        }
                
        for (int k : array) {
            System.out.print(k+" ");
        }
    }
}
