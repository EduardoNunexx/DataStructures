package Pratices.Pratice3;
//create a algorith that determine the index of the last ocurrance of and element x in a sequencial list
public class LastOcurrance {
    public static void main(String[] args) {
        int []vector={1,2,4,2,1,2,4,5};
        lastOcurrance(vector,2);
    }
    public static void lastOcurrance(int[]vector, int element){
        for(int aux=vector.length-1;aux>0;aux--){
            if(vector[aux]==element){
                System.out.println(aux);
                break;
            }
        }
    }
}
