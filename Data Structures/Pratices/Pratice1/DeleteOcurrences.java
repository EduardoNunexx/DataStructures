package Pratices.Pratice1;
import java.util.Scanner;
public class DeleteOcurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //cattching the vector and his size  
        int length = scan.nextInt();
        scan.nextLine();
        //turnig in a int vector
        String[] aux= scan.nextLine().split(" ");
        int[] vector=new int[length];
        for(int i=0; i <length;i++){
            vector[i]=Integer.parseInt(aux[i]);
        }
        //cattching the size of numbers out 
        int out= scan.nextInt();
        scan.nextLine();
        //cattching the numbers that will be removed 
        String[] aux2= scan.nextLine().split(" ");
        int[] vectorOut=new int[out];
        for(int i=0; i <out;i++){
            vectorOut[i]=Integer.parseInt(aux2[i]);
        }
        scan.close();
        //showing the new vector response 
        for( int x: removeOcurrences(vector, vectorOut)){
            System.out.print(x+" ");
        }
    }

    public static int[] removeOcurrences(int[] vector, int[] vectorOut){
        int[] newVector= new int [vector.length-vectorOut.length];
        int indexIn=0;
        for(int aux=0; aux<vector.length;aux++){
            boolean mustOut=false;
            for( int aux2=0;aux2<vectorOut.length;aux2++){
                if(vector[aux]==vectorOut[aux2]){
                    mustOut=true;
                    break;
                }
            }
            if(mustOut==false){
                newVector[indexIn]=vector[aux];
                indexIn++;
            }
        }
        return newVector;
    }
}
