package SortAlgorithms;

public class Insertion {
    public static void main(String[] args) {
        int[] vector={1,2,3};
        insertionSort(vector);
        for(int x:vector){
            System.out.println(x);
        }
    }


    public static void insertionSort(int[] vector){     
        for(int x=1; x<vector.length;x++){
            int value=vector[x];
            int aux=x-1;
            while(aux>=0 && vector[aux]>value){
                vector[aux+1]=vector[aux];
                aux--;
            }
            vector[aux+1]=value;
        }
    }
}
