package Pratices.PraticeProva;

public class OcurrancesNumber {
    public static void main(String[] args) {
        int []v={1,2,3,4,5};
        int []v2=shiftInsertion(v, 0, 8);
        removeMinors(v, 3);
        for(int x:v){
            System.out.println(x);
        }
    }
    public static int[] shiftInsertion(int[]l, int i, int v){
        int[]l2=new int[l.length];
        for(int aux=0;aux<l.length;aux++){
            l2[aux]=l[aux];
        }
        int aux=l2.length-2;
        while (aux>i) {
            l[aux+1]=l[aux];
            aux--;
        }
        l2[aux]=v;
        return l2;
    }
    public static void removeMinors(int[] v,int x){
        int length=v.length;
        for(int aux=0; aux<length;aux++){
            if(v[aux]<x){
                remover(v,aux);
                aux--;
                length--;
            }
        }
    }
    public static void  remover(int[]v, int x){
        
        while(x<v.length-1){
            v[x]=v[x+1];
            x++;
        }
        v[x]=101;
    }
    /*Algoritmo: OcirrancesNumber(L,x)
     * Entrada:Lista, elemento buscado
     * 
     * OcurrencesNumber(L,x)
     * i<-0
     * count<-0;
     *  para i em L 
     *      se L[i]=x
     *          count<-count+1
     * return count 
     *  
     */


    /*Algoritmo indice(L,x)
     * i<-L.tamanho
     * para i até 0 faça 
     *      se L[i]=x
     *          retorne i
     * i<i-1
     * 
     */
    /*Algoritmo shiftInsertion(L,i,v)
     * shiftInsertion(L,i,v)
     *      se L.tamanho=L.capacidade 
     *          alocarcapacidade(L)
     *      aux<-L.tamanho
     *      L.tamanho<-tamanho+1
     *      enquanto aux>i faça
     *          L[aux+1]=L[aux]
     * 
     *    
     *      L[aux]<-v
     * 
     * 
     */
    /*RemoveLowValue(L,v) 
     * i<-0
     * para i em L faça 
     *  se L[i]=x
     *      remover(L,i)
     *      i--;
     *      length--;
     * 
     * 
     *
     * remover(L,i) 
     *  aux<-L.tamanho-1
     * enquanto i <tamanho-1 faça 
     *  L[i]=L[i+1]
     *  I--
     * L.tamanho-1
    */
    
}
