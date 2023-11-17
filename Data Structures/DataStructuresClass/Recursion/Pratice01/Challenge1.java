package Recursion.Pratice01;
//you must to make a recursive function that print a sequence of numbers in some orders
//first: print the number in ascending order  
public class Challenge1 {
    static void fisrtChallenge(int from, int to){
        if(from<=to){
        System.out.println(from);
        fisrtChallenge(from+1, to);
        }
    }
}
