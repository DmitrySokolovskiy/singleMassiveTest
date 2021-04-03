package by.it.academia.main;

public class SingleArr {
    public static void main(String[] args) {
        SingleArr sglArr = new SingleArr();

        sglArr.setSingleArr(11);
    }
    public int[] setSingleArr(int razmer) {
        int[] arr = new int[razmer];
        for (int i=0; i <arr.length; i+=2) {
            arr[i] = 1;
        }
        for (int i=1; i <arr.length; i+=2) {
            arr[i] = 0;
        }
        return arr;
    }
}
