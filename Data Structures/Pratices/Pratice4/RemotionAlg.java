package Pratices.Pratice4;
import java.util.ArrayList;
import java.util.Arrays;
/*write a remover algorithm that, 
given an list L and an value x, 
remove from L all the values
less than x 
*/
public class RemotionAlg {
    public static void main(String[] args) {
        ArrayList<Integer> vector=new ArrayList<Integer>(Arrays.asList(1,2,2,2,3));
        int x=2;
        removeLess(vector, x);
        for(int aux=0;aux<vector.size();aux++){
            System.out.println(vector.get(aux));
        }
    }
    public static void removeLess(ArrayList<Integer>v, int x){
        for(int aux=0;aux<v.size();aux++){
            if(v.get(aux)<x){
                v.remove(aux);
                aux--;
            }
        }
        
    }
}
