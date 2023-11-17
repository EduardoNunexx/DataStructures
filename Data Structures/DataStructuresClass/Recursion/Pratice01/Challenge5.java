package Recursion.Pratice01;
//now you must to print out a x number n times
public class Challenge5 {
    
    static void fiveChallenge(int number, int times){
        if(times>0){
            System.out.println(number);
            fiveChallenge(number, times-1);
        }
    }
}
