package Recursion.Pratice01;
//you must to make a recursive function that print a sequence of numbers in some orders
//now you must to print the pair numbers in ascendent order and the impar numbes in descending order
public class Challenge4 {
    static void fourChallenge(int from, int to) {
        if (from <= to) {
            if (from % 2 == 0) {
                System.out.println(from);
            }
            fourChallenge(from+1, to);
            if (from%2==1) {
                System.out.println(from);
            }
        }
    }
}
