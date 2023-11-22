package Pratices.Pratice7;
//you must to insert a new number in a specyfi index in array without change the old order
public class ShiftAdd {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        array=shiftAdd(array, 10, 3);
        for(int aux:array){
            System.out.println(aux);
        }
    }
    public static int[] shiftAdd(int[] array, int number, int index){
        int []auxArray = new int[array.length+1];
        for(int aux=0; aux<array.length; aux++){
            auxArray[aux]= array[aux];
        }
        for(int aux=auxArray.length-1; aux>=0; aux--){
            if(aux==index){
                auxArray[aux]=number;
                break;
            }
            auxArray[aux]=auxArray[aux-1];
        }

        return auxArray;
    }
}
