package view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile {
    public  void writeToTxt (int [] array, String filePathName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(filePathName)));
        for (int ints : array) {
                writer.write(String.valueOf(ints));
                writer.write(" ");
            writer.write("\r\n");
        }
        writer.flush();
    }
}
