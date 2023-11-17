package Recursion.Pratice01;
//you must to make a recursive function that print a sequence of numbers in some orders
//print in an ascendent order after in descendent order
public class Challenge2 {
    static void secondChallenge(int from, int to){
        if(from<=to){
        System.out.println(from);
        secondChallenge(from+1, to);
        System.out.println(from);
        }
    }
}
