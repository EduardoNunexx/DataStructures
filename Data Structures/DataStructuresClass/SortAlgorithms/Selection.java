package SortAlgorithms;

public class Selection {
    public static void main(String[] args) {
        int[] vector= {1,2,3};
        SelectionSort(vector);
        for(int showVar:vector){
            System.out.println(showVar);
        }
    }
    public static void SelectionSort(int[] v) {
        for (int aux = 0; aux < v.length-1; aux++) {
            int lower= aux;
            for(int index=aux+1;index<v.length;index++){
                if(v[index]<v[lower]){
                    lower=index;
                }
            }
            int aux2=v[aux];
            v[aux]=v[lower];
            v[lower]=aux2;
        }
    }
}
