package Recursion.Pratice01;
//you must to make a recursive function that print a sequence of numbers in some orders
//now you must to print out in descendet order and after in ascendent order
public class Challenge3 {
    static void thirdChallenge(int from, int to){
        if(from<=to){
            System.out.println(to);
            thirdChallenge(from, to-1);
            System.out.println(to);
        }
    }
}
