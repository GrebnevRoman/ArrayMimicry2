import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ElementSearching elementSearching = new ElementSearching();
        ArraySorting sorting = new ArraySorting();
        Array array = new Array(5);
        int[] trueArray = array.getArrayData();
        System.out.print(Arrays.toString(trueArray) + "\n");
        System.out.print("Min is " + elementSearching.searchMaxOfArray(array) + "\n");
        System.out.print("Max is " + elementSearching.searchMinOfArray(array) + "\n");
        sorting.sortArray(trueArray);
        System.out.print(Arrays.toString(trueArray));


    }
}
