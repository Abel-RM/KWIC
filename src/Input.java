import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
    public static void leer(String ruta, Line lines){

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(ruta));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String l = scanner.nextLine();
            if (!lines.getAll().contains(l))
                lines.insert(l);
        }

    }
}
