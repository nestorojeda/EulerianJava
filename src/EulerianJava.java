import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import java.io.File;
import java.io.IOException;

public class EulerianJava {
    public static void main(String[] args) throws IOException {

        Eulerian en = new Eulerian();
        boolean flagm = false;  // si es true se ejecuta memorization y si es false tabulation
        boolean flagt = false;  // si es true se activa el tiempo
        File f;
        for (String s : args) {
            if (s.equals("-t")) {
                if(flagt) {
                    System.out.println("No se pueden repetir los flags");
                    System.exit(1);
                }
                flagt = true;
            } else if (s.equals("-m")) {
                if(flagm) {
                    System.out.println("No se pueden repetir los flags");
                    System.exit(2);
                }
                flagm = true;
            } else if (s.substring(0, 1).equals("-")) {
                System.out.println("La flag " + s + " no es válida");
                System.exit(3);
            }
        }

        if(!flagm) System.out.println("Se va a calcular mediante tabulation");
        else System.out.println("Se va a calcular mediante memoization");
        long startTime = 0;

        if(flagt) startTime = System.nanoTime();


        f = new File(args[args.length-1]);
        int n , m;
        try (LineIterator it = FileUtils.lineIterator(f, "UTF-8")) {
            String st;
            while (it.hasNext()) {
                st = it.nextLine();
                n = Integer.parseInt(st.substring(0, st.indexOf(" ")));
                m = Integer.parseInt(st.substring(st.indexOf(" ")+1));

                if(m >= n){
                    System.out.println("No se puede hacer la operación porque en "+"n=" + n + " y m=" + m +" n < m");
                }else {
                    if(flagm){
                        System.out.println("n=" + n + ", m=" + m + " ;Eulerian Number=" + en.eulerianmem(n, m));
                    }else{
                        System.out.println("n=" + n + ", m=" + m + " ;Eulerian Number=" + en.euleriantab(n, m));

                    }
                }
            }

        }

        if(flagt) System.out.println("Ejecución terminada en " + (System.nanoTime() - startTime) + " ns");
    }
}
