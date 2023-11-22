package Pratices.Pratice6;

public class SwapAdd {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        array = swapAdd(array, 0, 0);
        for (int aux : array) {
            System.out.println(aux);
        }
    }

    public static int[] swapAdd(int[] array, int number, int index) {
        // coppy the old array
        int[] auxArray = new int[array.length + 1];
        for (int aux = 0; aux < array.length; aux++) {
            auxArray[aux] = array[aux];
        }
        auxArray[auxArray.length - 1] = auxArray[index];
        auxArray[index] = number;
        return auxArray;
    }
}
