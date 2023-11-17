package Pratices.Pratice3;
//create an insertion algorith using the shiftInsertion
public class ShiftInsertion {
    public static void main(String[] args) {
        int[] vector={1,2,3,4,5};
        int index=3;
        int newElement=8;
        shiftInsertion(vector,index,newElement);
    }
    public static void shiftInsertion(int[]vector, int index,int newElement){
        int []newVector=new int [vector.length+1];
        int aux=newVector.length-2;
        for(int x=0;x<vector.length;x++){
            newVector[x]=vector[x];
        }
        while(aux>=index){
            newVector[aux+1]=newVector[aux];
            aux--;
        }
        newVector[aux+1]=newElement;
        for(int x:newVector){
            System.out.println(x);
        }
        
    }
}
