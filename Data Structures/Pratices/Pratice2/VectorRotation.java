package Pratices.Pratice2;
import java.util.Scanner;

public class VectorRotation {
    public static void main(String[] args) {
        //cattching vector's size and the rotations turns 
        Scanner scan= new Scanner(System.in);
        String sizeRotation=scan.nextLine();
        String[] sizeAndRotationtoHalf= sizeRotation.split(" ");
        int size= Integer.parseInt(sizeAndRotationtoHalf[0]);
        int rotationsTurns=Integer.parseInt(sizeAndRotationtoHalf[1]);
        //Cattching the vector
        String [] vectorAux= scan.nextLine().split(" ");
        scan.close();
        //calling my function
        rotation(vectorAux,size,rotationsTurns);
        
    }
    public static String[] rotation(String[] vectorAux, int size, int rotations){
        String [] vector= new String[size];
        for(int aux=0; aux<size;aux++){
            if(rotations+aux>size-1){
                int rotAux=(rotations+aux)-size;
                vector[rotAux]=vectorAux[aux];
            }else{
                vector[aux+rotations]=vectorAux[aux];
            }
        }
        for(String x :vector){
            System.out.print(x+" ");
        }
        return vector;
    }
}
