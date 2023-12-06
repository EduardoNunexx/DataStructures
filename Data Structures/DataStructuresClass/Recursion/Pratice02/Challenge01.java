package Recursion.Pratice02;

public class Challenge01 {
    //print all the number from n to 0 
    public static void printNToZero(int n){
        System.out.println(n);
        if(n>0){
        printNToZero(n-1);
        }
    }
    public static void printZeroToN(int n){
        if(n>0){
            printZeroToN(n-1);
        }
        System.out.println(n);
    }
    public static void printNToZeroAndZeroToOne(int n, int zero){
        if(n>=zero){
            System.out.println(zero);
            printNToZeroAndZeroToOne(n, zero+1);
            System.out.println(zero);
        }
    }
}
