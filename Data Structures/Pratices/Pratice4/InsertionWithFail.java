package Pratices.Pratice4;

import java.util.ArrayList;
import java.util.Arrays;

//write an insertions algorithm that guarantees that will not have duplicate values in the list
//This means, if the value already exists in the vector,the insertions must to fail   
public class InsertionWithFail {
    public static void main(String[] args) {
        ArrayList<Integer> vector= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        int newValue=8;
        insertWithoutDoubles(vector,newValue);
        for(int x:vector){
            System.out.println(x);
        }
    }
    public static void insertWithoutDoubles(ArrayList<Integer> vector,int newValue){
        for(int aux:vector){
            if(aux==newValue){
            return;
            }
        }
        vector.add(newValue);
    }
    
}

