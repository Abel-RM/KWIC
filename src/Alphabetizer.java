import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Alphabetizer implements Observer {
    ArrayList<String> lineas = new ArrayList<>();

    @Override
    public void update(Observable o, Object arg) {
        String linea=arg.toString();
        lineas.add(linea);
        Collections.sort(lineas);
    }

    public ArrayList<String> getLineas() {
        return lineas;
    }
}
