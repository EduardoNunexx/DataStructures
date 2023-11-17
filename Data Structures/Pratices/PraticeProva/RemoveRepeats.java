package Pratices.PraticeProva;
public class RemoveRepeats{
    public static void main(String[] args) {
        int[] v={3,3,2,5,3};
        removeRepeats(v);
        for(int x:v){
            System.out.println(x);
        }
    }
    public static void removeRepeats(int[]v){
        int length= v.length;
        for(int aux1=0;aux1<length;aux1++){
            for(int aux2=aux1+1;aux2<length;aux2++){
                if(v[aux1]==v[aux2]){
                    remove(v,aux2);
                    aux2--;
                    length--;
                }
            }
        }
    }
    public static void  remove(int[]v, int x){
        


        while(x<v.length-1){
            v[x]=v[x+1];
            x++;
        }
        v[x]=101;
    }


    /*RemoveRepeats(L)
     * i<-0
     * para i em L faça
     *      aux<-i+1
     *      para aux em L faça 
     *          se v[i]==v[aux]
     *              remover(v,aux)
     *              aux<-aux-1
     *              L.tamanh<-L.tamanho-1
     *          
     *remover(L,i)
     *  enquanto i<L.tamanho-1 faça 
     *      v[i]=v[i+1]
     *      i++
     * L.tamnho=L.tamanho-1
     * 
     */
    /*binarySearch
     * inicio<-0
     * fim<-v.length-1
     * enquanto inicio<=fim faça
     *  meio<-inicio+fim/2 arredondado pra baixo 
     *  se v[meio]=x então
     *      retorne "V"
     *  senao se v[meio]>x então
     *      fim=meio-1
     * senão se v[meio]<x então
     *      inicio=meio+1
     * 
     * retorne "f"
     * 
     * 
     * 
     * 
     */
}