package Pratices.Pratice5;
//get algorithm
public class Pratice {
    public static void main(String[] args) {
        int array []= {1,2,3,4,5,6,7,8};
        search(array, 1);
        
    }
    public static void search(int array[], int number){
        for(int aux=0;aux<array.length;aux++){
            if(array[aux]==number){
                System.out.println(aux);
                break;
            }
            System.out.println("Haven't the number");
        }
    }
}
