import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Output {
    public static void escribir(Lines lines){
        ArrayList<String> salida = lines.getAll();
        String sFichero = "C:\\Users\\abely\\Desktop\\Maestria\\semestre 2\\Arquitectura\\Proyectos\\Proyecto1\\src\\output.txt";
        File fichero = new File(sFichero);
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(sFichero));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (fichero.exists()) {
            for (String item : salida){
                try {
                    bw.write(item + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
