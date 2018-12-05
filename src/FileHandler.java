import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileHandler{
    public void getInput(String path) throws IOException {
        File f = new File(path);
        LineIterator it = FileUtils.lineIterator(f, "UTF-8");
        try {
            while (it.hasNext()) {
                String line = it.nextLine();
                System.out.println(line);
            }
        } finally {
            it.close();
        }
    }
}