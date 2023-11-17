package Recursion.Pratice01;
//now you must to print a same number 2*times
public class Challenge6 {
    static void sixChallenge(int number, int times){
        if(times>0){
            System.out.println(number);
            System.out.println(number);
            sixChallenge(number, times-1);
        }
    }
}
