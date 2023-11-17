public class LinearSearch{
    public static void main(String[] args) {
        int[] vector= {1,2,3,4,2,1,2};
        System.out.println(Search(vector,5));
    }
    
    //down below is the algorithm 
    public static boolean Search(int[] vector, int number){
        for(int aux:vector){
            if(aux==number){
                return true;
            }
        }
        return false;
    }
}