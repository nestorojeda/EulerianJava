import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class FileHandler{

    public ArrayList<String> getInput(String path) throws IOException {
        File f = new File(path);
        ArrayList<String> res = new ArrayList<>();
        try (LineIterator it = FileUtils.lineIterator(f, "UTF-8")) {
            while (it.hasNext()) {
                res.add(it.nextLine());
            }
        }
        return res;
    }
}