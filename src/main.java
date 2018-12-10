import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {

        Eulerian en = new Eulerian();

        int n , m;
        File f = new File("/home/nestorojedag/IdeaProjects/EulerianJava/in");
        try (LineIterator it = FileUtils.lineIterator(f, "UTF-8")) {
            String st;
            while (it.hasNext()) {
                st = it.nextLine();
                n = Integer.parseInt(st.substring(0, st.indexOf(" ")));
                m = Integer.parseInt(st.substring(st.indexOf(" ")+1));

                if(m >= n){
                    System.out.println("No se puede hacer la operación porque en "+"n=" + n + " y m=" + m +" n < m");
                }else {
                    System.out.println("n=" + n + ", m=" + m + " ;Eulerian Number=" + en.eulerianmem(n, m));
                }
            }


        }

    }
}
