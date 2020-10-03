import data.Array;
import logic.ArraySorting;
import logic.ElementSearching;
import view.WritingInFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WritingInFile writingInFile = new WritingInFile();
        ElementSearching elementSearching = new ElementSearching();
        ArraySorting sorting = new ArraySorting();
        Array arrayObject = new Array(5);
        int[] array = arrayObject.getArrayData();

        writingInFile.writeToTxt(array,"file.txt");

    }
}
