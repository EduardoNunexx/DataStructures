package SortAlgorithms;

public class Buble {
    public static void main(String[] args) {
        int[] vector = { 1, 2, 4, 6, 5, 8, 7, 3 };
        bubleSort(vector);
        for (int index : vector) {
            System.out.println(index);
        }
    }

    public static void bubleSort(int[] v) {
        int length = v.length-1;
        for(int index=0; index<v.length; index++){
            for(int x=0;x<length;x++){
                if(v[x]>v[x+1]){
                    int aux= v[x];
                    v[x]=v[x+1];
                    v[x+1]=aux;
                }
            }
            length--;   
        }
    }
}
