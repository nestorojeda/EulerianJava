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

            if(m >= n){
                System.out.println("No se puede hacer la operación porque m>n");
            }else {
                System.out.println("n=" + n + ", m=" + m + " ;Euler=" + en.eulerian(n, m));
            }

        }

    }
}
