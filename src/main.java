import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {

        Eulerian en = new Eulerian();
        FileHandler fh = new FileHandler();
        ArrayList<String> list = fh.getInput("/home/nestorojedag/IdeaProjects/EulerianJava/in");
        int n , m;
        for (String st:list) {
            n = Integer.parseInt(st.substring(0, st.indexOf(" ")));
            m = Integer.parseInt(st.substring(st.indexOf(" ")+1));
            System.out.println(en.eulerian(n,m));

        }

    }
}
