package Pratices.Pratice4;

public class TrING {

    public static void main(String[] args) {
        x(32);
    }

    public static void x(int n) {
        String s = Integer.toBinaryString(n);
        String[] newS = s.split("");
        int count = 0;
        for (int aux = 0; aux < newS.length-1; aux++) {
            int auxCount = 0;
            if (newS[aux].equals("1")) {
                int aux2=aux+1;
                while(newS[aux2].equals("0")&& aux2<newS.length-1){
                    auxCount++;
                    aux2++;
                }
                if(newS[aux2].equals("1") && auxCount>count){
                    count=auxCount;
                }
            }
        }
        System.out.println(count);
        /*
         * for(String x:newS){
         * System.out.println(x);
         * }
         * int longest=0;
         * for(String x:newS){
         * if(x.length()>longest){
         * longest=x.length();
         * }
         * }
         * System.out.println(longest);
         */
    }
}
