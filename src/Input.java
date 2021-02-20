import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
   private static Lines lines=new Lines();
    public static void leer(String ruta){
        CircularShift cs=new CircularShift();
        lines.addObserver(cs);
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(ruta));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            lines.insert(scanner.nextLine());
        }
        Output.escribir(cs.getAlphabetizer().getLineas());
    }
}
