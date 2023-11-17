public class BinarySearch {
    public static void main(String[] args) {
        int[] vector= {1,2,3,4,5,8};
        System.err.println(binarySearch(vector,6));
    }
    public static boolean binarySearch(int v[], int x){
        //setting the firsts first and lasts positions 
        int start=0;
        int end=v.length-1;
        //starting the search
        while (start<=end){
            int middle= start+(end-start)/2;
            if(v[middle]==x){
                return true;
            }else if(v[middle]<x){
                start=middle+1;
            }else if(v[middle]>x){
                end=middle-1;
            }
        }
        return false;
    }
}
