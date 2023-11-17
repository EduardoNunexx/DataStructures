package Pratices.Pratice3;
/*create a algorithm that count the number of occurances of  
an element in a seguencial list */
public class Ocurrances {
    public static void main(String[] args) {
        int[] vector={1,2,3,5,5,6,6,1,3};
        counting(vector,5);
    }
    
    public static void counting( int[]v, int value){
        int count=0;
        for( int aux:v){
            if(aux==value){
                count++;
            }
        }
        System.out.println(count);
    } 
}
