import java.util.ArrayList;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Line extends Observable {
    private final ArrayList<String> lineas = new ArrayList<>();

    public void insert(String linea){
        lineas.add(linea);
        setChanged();
        notifyObservers(linea);
    }

    public ArrayList<String> getAll(){
        return lineas;
    }
}
