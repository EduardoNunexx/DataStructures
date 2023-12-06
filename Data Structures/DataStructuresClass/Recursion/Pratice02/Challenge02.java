package Recursion.Pratice02;

public class Challenge02 {
    public static void contraryOrder(int[] array, int length){
        if(length>=0){
            System.out.println(array[length]);
            contraryOrder(array, length-1);
        }
    }
    public static void maxValue(int[] array,int length, int first){
        System.out.println();
        if(first<length){
            System.out.println(array[first]);
            maxValue(array, length, first+1);
        }
    }
}
